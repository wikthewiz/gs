package org.arccore.gdbsl.tests;

import static org.junit.Assert.*;

import org.arccore.gdbsl.GdbslInjectorProvider;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.xbase.interpreter.IExpressionInterpreter;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
@RunWith(value = XtextRunner.class)
@InjectWith(value = GdbslInjectorProvider.class)
public class TestInterpreter {

	@Inject
	IExpressionInterpreter interpreter;
	
	@Inject
	IResourceFactory resfact;
	
	@Test
	public void test() {
		System.out.println("start");
	}
	
	

}
