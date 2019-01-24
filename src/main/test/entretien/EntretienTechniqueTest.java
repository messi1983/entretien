package main.test.entretien;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import main.java.entretien.EntretienTechnique;

import org.junit.Test;

public class EntretienTechniqueTest {
private EntretienTechnique entretien = new EntretienTechnique(); 
	
	@Test
	public void testIsNombreNarcissiqueOK() {
		
		assertTrue(entretien.isNombreNarcissique(9));
		assertTrue(entretien.isNombreNarcissique(153));
	}
	
	@Test
	public void testIsNombreNarcissiqueKO() {
		
		assertFalse(entretien.isNombreNarcissique(10));
		assertFalse(entretien.isNombreNarcissique(154));
	}
	
	
	@Test
	public void testIsPangrammeOK() {
		String phrase = "Portez ce vieux whisky au juge blond qui fume";
		assertTrue(entretien.isPangramme(phrase));
	}
	
	@Test
	public void testIsPangrammeOK2() {
		String phrase = "POrtez ce Vieux whiskY au juge blond qui fume";
		assertTrue(entretien.isPangramme(phrase));
	}
	
	@Test
	public void testIsPangrammeOK3() {
		String phrase = "POrtez ce Vieux whiskY à la juge blonde qui fume!";
		assertTrue(entretien.isPangramme(phrase));
	}
	
	@Test
	public void testIsPangrammeKO_withNull_Sentence() {
		assertFalse(entretien.isPangramme(null));
	}
	
	@Test
	public void testIsPangrammeKO_withEmpty_Sentence() {
		String phrase = "";
		assertFalse(entretien.isPangramme(phrase));
	}
	
	@Test
	public void testIsPangrammeKO_withSmall_Sentence() {
		String phrase = "petite phrase";
		assertFalse(entretien.isPangramme(phrase));
	}
	
	@Test
	public void testIsPangrammeKO() {
		String phrase = "petite phrase";
		assertFalse(entretien.isPangramme(phrase));
	}
}
