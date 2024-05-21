package exo1;

public class Liquide{
	public void imprimer() {
		System.out.println("Je suis un Liquide");
	}
}

class Tasse{
	private Liquide liquide;
	
	public void AjouterLiquide(Liquide li) {
		this.liquide= li;
	}
	public void imprimer() {
		liquide.imprimer();
	}
}


