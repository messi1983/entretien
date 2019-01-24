package main.java.entretien;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntretienTechnique {
	
	private static final int NB_LETTRES_ALPHABET = 26;
	private static final Pattern P_ALPHABET = Pattern.compile("[a-zA-Z]");
	
	public boolean isNombreNarcissique(int nombre) {
		String nbInSrt = String.valueOf(nombre);
		int puissance = nbInSrt.length();
		
		int resultat = 0;
		for(int i = 0; i < puissance; i++) {
			resultat += Math.pow(Integer.valueOf("" + nbInSrt.charAt(i)), puissance);
		}
		
		return resultat == nombre;
	}
	
	public boolean isPangramme(String phrase) {
		Optional<String> optPhr = Optional.ofNullable(phrase);
		
		if(optPhr.isPresent()) {
			String phraseFinale = Normalizer.normalize(phrase, Normalizer.Form.NFD).toLowerCase();
			List<String> lettres = new ArrayList<String>(NB_LETTRES_ALPHABET);
			
			int i = 0;
			String current;
			Matcher matcher;
			
			while(lettres.size() < NB_LETTRES_ALPHABET && i < phraseFinale.length()) {
				current = "" + phraseFinale.charAt(i);
				matcher = P_ALPHABET.matcher(current);
				if(!lettres.contains(current) && matcher.matches()) {
					lettres.add(current);
				}
				i++;
			}
			return lettres.size() == NB_LETTRES_ALPHABET;
		}
		return false;
	}
}
