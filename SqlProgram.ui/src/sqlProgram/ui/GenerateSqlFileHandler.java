package sqlProgram.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.PlatformUI;

import sqlProgram.Queries;
import sqlProgram.Selection;
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
	    	Object firstElement = ((StructuredSelection) selection).getFirstElement();
	        if (firstElement instanceof SqlProgram) {
	        	SqlProgram sqlProgram = (SqlProgram) firstElement;
	        	
	        	StringBuilder sqlScript = new StringBuilder();
	        	
	        	for (Queries query: sqlProgram.getQueries()) {
	        		if (query instanceof Selection) {
	        			sqlScript.append(SqlScript.fromSelection((Selection) query));
	        		}
	        	}
	        	
	    		SqlScript.showSaveWindow("Script SQL généré", sqlScript.toString());
	        }       
	    }
	    
		
		return null;
	}
}
