/*
 * generated by Xtext 2.23.0
 */
package fr.ensma.idm.choreography.robottxtsyntax.ui.tests;

import com.google.inject.Injector;
import fr.ensma.idm.choreography.robottxtsyntax.ui.internal.RobottxtsyntaxActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class TxtDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RobottxtsyntaxActivator.getInstance().getInjector("fr.ensma.idm.choreography.robottxtsyntax.TxtDsl");
	}

}