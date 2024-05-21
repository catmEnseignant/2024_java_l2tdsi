package exo1;

public class TestLiquide {
	public static void main(String[] args) {
	
		   Liquide liquide = new Liquide();
		   Liquide cafe = new Cafe();
		   Liquide lait = new Lait();
		
		   Tasse[] tasses = new Tasse[3];
		   tasses[0] = new Tasse();
		   tasses[1] = new Tasse();
		   tasses[2] = new Tasse();
		
		   tasses[0].AjouterLiquide(liquide);
		   tasses[1].AjouterLiquide(cafe);
		   tasses[2].AjouterLiquide(lait);
		
			  /* for (Tasse tasse : tasses) {
			       tasse.imprimer();
			   } */
			   
		   tasses[0].imprimer();
		   tasses[1].imprimer();
		   tasses[2].imprimer();
	}
}