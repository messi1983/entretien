package main.java;

/**
 * 
 * @author Messi
 *
 */
public class CaculatetteNombrePremier {

	public boolean isNombrePremier(Integer nombre) {
		for(int i = 1; i < nombre; i++) {
			if(nombre % i == 0) {
				return false;
			}
		}
		return true;
	}
}
