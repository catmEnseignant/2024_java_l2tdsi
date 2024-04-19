
public class Version {
	 public long calculateFactorial(int n) {
	        if (n == 0) {
	            return 1; // Le factoriel de 0 est 1
	        } else {
	            return n * calculateFactorial(n - 1); // Appel récursif pour calculer le factoriel
	        }
	    }
}
