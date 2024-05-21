package Exercice1;

public class TestLiquide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Liquide cafe=new Cafe();
		Liquide lait=new Lait();
		
		Tasse t1= new Tasse();
		Tasse t2= new Tasse();
		t1.AjouterLiquide(lait);
		t2.AjouterLiquide(cafe);
		Tasse[] tasse= {t1,t2};
		for (Tasse tasse3 : tasse) {
			tasse3.imprimer();
		}
	}
}
