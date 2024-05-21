package exercice1;

public class TestLiquide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Tasse[] tabTasses=new Tasse[3];
		tabTasses[0]=new Tasse();
		tabTasses[1]=new Tasse();
		tabTasses[2]=new Tasse();
		
		tabTasses[0].ajouterLiquide(new Cafe());
		tabTasses[1].ajouterLiquide(new Lait());
		
		for(Tasse t: tabTasses) {
			
			t.imprimer();
		}
		
	}
}
