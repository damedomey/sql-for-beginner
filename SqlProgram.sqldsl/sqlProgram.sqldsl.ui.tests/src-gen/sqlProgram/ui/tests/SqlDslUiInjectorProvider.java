/*
 * generated by Xtext 2.30.0.M3
 */
package sqlProgram.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import sqlProgram.sqldsl.ui.internal.SqldslActivator;

public class SqlDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SqldslActivator.getInstance().getInjector("sqlProgram.SqlDsl");
	}

}
