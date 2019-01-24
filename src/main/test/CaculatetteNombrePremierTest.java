package main.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import junit.framework.TestCase;
import main.java.CaculatetteNombrePremier;

import org.junit.Test;

public class CaculatetteNombrePremierTest {

	private CaculatetteNombrePremier calculette = new CaculatetteNombrePremier(); 
	
	@Test
	public void testIsNombrePremier() {
		
		assertTrue(calculette.isNombrePremier(2));
		assertTrue(calculette.isNombrePremier(3));
		
		assertFalse(calculette.isNombrePremier(4));
	}
}
