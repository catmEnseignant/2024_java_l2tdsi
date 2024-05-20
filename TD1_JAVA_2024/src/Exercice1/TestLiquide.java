package Exercice1;

public class TestLiquide {

		public static void main(String[] args) {
	        Liquide liquide1 = new Liquide();
	        Liquide liquide2 = new Cafe();
	        Liquide liquide3 = new Lait();

	        Tasse tasse1 = new Tasse();
	        Tasse tasse2 = new Tasse();
	        Tasse tasse3 = new Tasse();

	        tasse1.AjouterLiquide(liquide1);
	        tasse2.AjouterLiquide(liquide2);
	        tasse3.AjouterLiquide(liquide3);

	        Tasse[] tasses = {tasse1, tasse2, tasse3};

	        for (Tasse tasse : tasses) {
	            tasse.imprimer();
	        }
	    }

	}


