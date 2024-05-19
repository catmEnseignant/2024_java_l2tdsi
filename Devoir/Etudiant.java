package Devoir;

public class Etudiant {
	public String numcarte;
	public String prenom;
	public String nom; 
	public double moyenne=0.0;
	
	
	
	public Etudiant(String numero_de_carte, String prenom, String nom) {
		this.numcarte = numero_de_carte;
		this.nom = nom;
		this.prenom = prenom;
	}
	public  void  SetMoyenne(double moy) {
		this.moyenne=moy;
	}
	public void affichage() {
		System.out.println("les informations de l'etudiant sont: ");
	    System.out.println("numero de carte: " + this.numcarte );
	    System.out.println( "Nom: " +this.nom);
	    System.out.println("prenom: " +this.prenom);
		
		
		if (this.moyenne >=  10) {
			System.out.println("Semestre: valider");
			
		}
		
		else {
			System.out.println("Semestre: non valider");
		}
	}
	
	
	

}
