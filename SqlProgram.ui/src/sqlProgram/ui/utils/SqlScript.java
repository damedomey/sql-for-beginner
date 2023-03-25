package sqlProgram.ui.utils;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public abstract class SqlScript {
	public static String fromTable() {
		return "hello";
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
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel etiquette = new JLabel("Contenu :");

        // Créer une zone de texte scrollable pour le contenu
        JTextArea zoneTexte = new JTextArea(content);
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
        fenetre.add(etiquette, BorderLayout.NORTH);
        fenetre.add(scrollPane, BorderLayout.CENTER);
        fenetre.add(panneauBoutons, BorderLayout.SOUTH);

        // Afficher la fenêtre
        fenetre.pack();
        fenetre.setVisible(true);
    }
}
