
package org.arccore.gdbsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GdbslStandaloneSetup extends GdbslStandaloneSetupGenerated{

	public static void doSetup() {
		new GdbslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

