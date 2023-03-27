package sqlProgram.ui.utils;

import java.beans.Statement;
import java.io.StringReader;

public abstract class SqlValidator {
	public static void validate(String script) {
		String[] queries = script.split(";"); // Séparer les requêtes SQL
        
        for (String query : queries) {
            if (!query.trim().isEmpty()) { // Ignorer les chaînes vides
                
            }
        }
	}
}
