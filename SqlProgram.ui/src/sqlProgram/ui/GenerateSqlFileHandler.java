package sqlProgram.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.PlatformUI;

import sqlProgram.SqlProgram;
import sqlProgram.ui.utils.SqlScript;

public class GenerateSqlFileHandler extends AbstractHandler implements IHandler {
	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get the SQL program from the active workbench selection
	    ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
	    
	    if (selection instanceof StructuredSelection) {
	    	// TODO Auto-generated method stub
	    	System.out.print("It's work");
	    	System.out.print(SqlScript.fromTable());
	    	
	    	Object firstElement = ((StructuredSelection) selection).getFirstElement();
	        if (firstElement instanceof SqlProgram) {
	        	SqlProgram sqlProgram = (SqlProgram) firstElement;
	        }       
	    }
	    
		SqlScript.showSaveWindow("Script SQL généré", "Ceci est un texte de test.");
		
		return null;
	}
}
