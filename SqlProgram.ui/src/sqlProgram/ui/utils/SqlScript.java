package sqlProgram.ui.utils;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import sqlProgram.Clause;
import sqlProgram.Column;
import sqlProgram.ColumnValue;
import sqlProgram.Constaint;
import sqlProgram.Creation;
import sqlProgram.Delete;
import sqlProgram.Insertion;
import sqlProgram.Queries;
import sqlProgram.QuickSelection;
import sqlProgram.Selection;
import sqlProgram.SqlProgram;
import sqlProgram.Table;
import sqlProgram.Update;
import sqlProgram.Value;

public abstract class SqlScript {
	private static String tabulation = "    "; // instead of '\t' because it's too big
	
	public static String buildScript(SqlProgram rootElement) {
		SqlProgram sqlProgram = (SqlProgram) rootElement;
    	
    	StringBuilder sqlScript = new StringBuilder();
    	
    	for (Queries query: sqlProgram.getQueries()) {
    		if (query instanceof Selection) {
    			sqlScript.append(SqlScript.fromSelection((Selection) query));
    		} else if (query instanceof Creation){
    			sqlScript.append(SqlScript.fromCreation((Creation) query));
    		} else if (query instanceof Update) {
    			sqlScript.append(SqlScript.fromUpdate((Update) query));
    		} else if (query instanceof Delete) {
    			sqlScript.append(SqlScript.fromDelete((Delete) query));
    		} else if (query instanceof Insertion) {
    			sqlScript.append(SqlScript.fromInsertion((Insertion) query));
    		}
    	}
    	
    	return sqlScript.toString();
	}
	
	/**
	 * Generate the script corresponding to a [selection]
	 * @param selection
	 * @return the script
	 */
	public static String fromSelection(Selection selection) {
		StringBuilder script = new StringBuilder();
		String selectRow = "SELECT ", fromRow = "", clauseRow = "";

		for (Object object: selection.getObjects()) {
			if (object instanceof Table) {
				Table table = (Table) object;
				
				for (Column column: table.getColumns()) {
					selectRow +=  selectRow == "SELECT " ? "":", ";
					if(!(selection instanceof QuickSelection)) {
						selectRow += table.getName() + "." + column.getName();
					} else {
						String method = ((QuickSelection)selection).getMethod().toUpperCase();
						selectRow += method + "(" +
								table.getName() + "." + column.getName() 
								+ ") as " + method + "_" + column.getName();
					}
					
				}
				
				fromRow +=  fromRow == "" ? tabulation + "FROM ":", ";
				fromRow += table.getName();
			}
		}

		for (Clause clause: selection.getClauses()) {
			switch (clause.getName().trim().toLowerCase()) {
			case "where":
			case "group by":
			case "having":
			case "limit":
			case "offset": {
				clauseRow += tabulation + clause.getName().toUpperCase() + " " + clause.getBody() + "\n";
				break;
			}
			case "and":
			case "or": {
				clauseRow += tabulation + tabulation + clause.getName().toUpperCase() + " " + clause.getBody() + "\n";
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value for clause: " + clause.getName());
			}
		}
		
		script.append(selectRow)
			.append("\n")
			.append(fromRow)
			.append("\n")
			.append(clauseRow)
			.append(";\n");
		
		return script.toString();
	}
	
	/**
	 * Generate the script corresponding to a [creation]
	 * @param creation
	 * @return
	 */
	
	public static String fromCreation(Creation creation) {
		StringBuilder script = new StringBuilder();
		
		script.append("CREATE ");
		
		switch (creation.getType().toLowerCase()) {
		case "table": {
			script.append("TABLE ");
			
			for (Object object: creation.getObjects()) {
				if (object instanceof Table) {
					Table table = (Table) object;
					script.append(table.getName())
						.append("(\n");
					
					int length = table.getColumns().size();
					
					for (Column column: table.getColumns()) {						
						script.append(tabulation)
							.append(column.getName())
							.append(" ")
							.append(column.getType());
						
						for (Constaint contraint: column.getConstaints()) {
							script.append(" ")
								.append(contraint.getBody());
						}
						
						if (length-- > 1)
							script.append(", \n");
					}
					
					break; // A creation can't concern more than 1 table due to possible constraints
				}
			}
			
			for (Constaint constraint: creation.getConstaints()) {
				script.append(", \n")
					.append(tabulation)
					.append("CONSTRAINT ")
					.append(constraint.getBody());
			}
			
			script.append("\n);\n");
			break;
		}
		case "index": {
			script.append("UNIQUE INDEX "); // TODO: Allow simple index creation
			script.append(creation.getName());
			script.append(" ON ");

			for (Object object: creation.getObjects()) {
				if (object instanceof Table) {
					Table table = (Table) object;
					script.append(table.getName())
						.append("(");

					int length = table.getColumns().size();

					for (Column column: table.getColumns()) {
						script.append(column.getName())
							.append(length-- > 1 ? ", " : "");
					}

					break; // A creation can't concern more than 1 table due to possible constraints
				}
			}
			script.append(");\n");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + creation.getType());
		}
		
		return script.toString();
	}
	
	public static String fromInsertion(Insertion insertion) {
		StringBuilder script = new StringBuilder();
		
		for (Object object: insertion.getObjects()) {
			if (object instanceof Table) {
				Table table = (Table) object;
				script.append("INSERT INTO ")
					.append(table.getName());
				
				if (table.getColumns().size() > 0) {
					String columnList = "";
					for (Column column : table.getColumns()) {
						columnList +=  columnList == "" ? "":", ";
						columnList += column.getName();
					}
					
					script.append("(")
						.append(columnList)
						.append(")");
				}
				
				script.append("\n");
				
				break; // A creation can't concern more than 1 table due to possible constraints
			}
		}
		
		String values = "";
		for (Value value : insertion.getValues()) {
			// TODO: With this configuration, we don't know the type of data in the columnValue. So, we generate all of these as string. How to resolve this without add another information ?
			
			String valueRow = "";
			for (ColumnValue columValue: value.getColumnvalues()) {
				valueRow +=  valueRow == "" ? "":", ";
				valueRow += columValue.getValue();
			}
			
			values +=  (values == "") ? "": (", \n" + tabulation + tabulation);
			values += "(" + valueRow + ")";
		}
		
		script.append(tabulation)
			.append("VALUES ")
			.append(values)
			.append(";")
			.append("\n");
		
		return script.toString();
	}
	
	public static String fromUpdate(Update update) {
		StringBuilder script = new StringBuilder();
	    String setRow = "", whereRow = "";

	    for (Object object: update.getObjects()) {
			if (object instanceof Table) {
				Table table = (Table) object;
				script.append("UPDATE ")
					.append(table.getName())
					.append("\n");
				break; // A creation can't concern more than 1 table due to possible constraints
			}
		}
	    
	    for (Clause clause: update.getClauses()) {
			switch (clause.getName().trim().toLowerCase()) {
			case "set":
			case "where": {
				whereRow += tabulation + clause.getName().toUpperCase() + " " + clause.getBody() + "\n";
				break;
			}
			case "and":
			case "or": {
				whereRow += tabulation + clause.getName().toUpperCase() + " " + clause.getBody() + "\n";
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value for clause: " + clause.getName());
			}
		}

	    script.append(setRow)
	        .append(whereRow)
	        .append(";\n");

	    return script.toString();
	}
	
	public static String fromDelete(Delete delete) {
		StringBuilder script = new StringBuilder();
		
		for (Object object: delete.getObjects()) {
			if (object instanceof Table) {
				Table table = (Table) object;
				script.append("DELETE FROM ")
					.append(table.getName())
					.append("\n");
				break; // A creation can't concern more than 1 table due to possible constraints
			}
		}
		
		for (Clause clause: delete.getClauses()) {
			switch (clause.getName().trim().toLowerCase()) {
			case "where":
			case "and":
			case "or": {
				if (clause.getName().trim().toLowerCase() != "where" ) {
					script.append("    ");
				}
				script.append(clause.getName().toUpperCase())
					.append(" ")
					.append(clause.getBody())
					.append("\n");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value for clause: " + clause.getName());
			}
		}
		script.append(";\n");
		
		return script.toString();
	}
	
	public static String fromQuickSelection(QuickSelection quick) {
		StringBuilder script = new StringBuilder();
		script.append("qsdf");
		return script.toString();
	}
	
	/**
	 * Write [content] in the given [file]
	 * @param file
	 * @param content
	 * @throws IOException
	 */
	public static void save (File file, String content) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(content);
        writer.close();
	}
	
	/**
	 * Display a window with the [content] to the user with the possibility to save the content in a file.
	 * 
	 * @param title the title of the windows
	 * @param content the content to be save
	 */
	public static void showSaveWindow(String title, String content) {
        JFrame fenetre = new JFrame(title);
        // fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel callToAction = new JLabel("Voulez-vous enregistrer le script dans un fichier ?");

        // Créer une zone de texte scrollable pour le contenu
        JTextArea zoneTexte = new JTextArea(content);
        zoneTexte.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(zoneTexte);
        scrollPane.setPreferredSize(new Dimension(400, 200));

        // Créer un bouton pour confirmer
        JButton boutonConfirmer = new JButton("Confirmer");
        boutonConfirmer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Sauvegarde du fichier
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File fichier = fileChooser.getSelectedFile();
                    try {
                    	String signature = "-- Generate by sql-for-beginner https://github.com/damedomey/sql-for-beginner/ \n";
                        save(fichier, signature + content);
                        JOptionPane.showMessageDialog(null, "Le texte a été sauvegardé dans le fichier " + fichier.getAbsolutePath());
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Erreur lors de l'enregistrement du fichier : " + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Le texte n'a pas été sauvegardé.");
                }
            	
                fenetre.dispose();
            }
        });

        // Créer un bouton pour annuler
        JButton boutonAnnuler = new JButton("Annuler");
        boutonAnnuler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Le bouton Annuler a été cliqué.");
                fenetre.dispose();
            }
        });

        // Créer un panneau pour les boutons
        JPanel panneauBoutons = new JPanel();
        panneauBoutons.setLayout(new FlowLayout());
        panneauBoutons.add(boutonConfirmer);
        panneauBoutons.add(boutonAnnuler);

        // Ajouter l'étiquette, la zone de texte scrollable et le panneau de boutons à la fenêtre
        fenetre.add(scrollPane, BorderLayout.NORTH);
        fenetre.add(callToAction, BorderLayout.CENTER);
        fenetre.add(panneauBoutons, BorderLayout.SOUTH);

        // Afficher la fenêtre
        fenetre.pack();
        fenetre.setVisible(true);
    }
}
