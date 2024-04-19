
public class terrains {
    public static void main(string[]args) {
        
        public class Terrain {
// une classe terrain avec des attributs privés
             private double longueur;
             private double largeur;
             private String typePropriete; 
             private String adresse;
             private boolean occupe; 

// ajout d'un  Constructeur
             public Terrain(double longueur, double largeur, String typePropriete, String adresse, boolean occupe) {
                 this.longueur = longueur;
                 this.largeur = largeur;
                 this.typePropriete = typePropriete;
                 this.adresse = adresse;
                 this.occupe = occupe;
             }   
 //calculer la surface
             public double calculeSurface() {
                 return longueur * largeur;
             }  	
         
// une methode allouer
             public void allouer(Personne personne) {
                 if (!occupe) {
                     System.out.println("Le terrain est alloué à " + personne.getPrenom() + " " + personne.getNom());
                     occupe = true;
                 } else {
                     System.out.println("Le terrain est déjà occupé.");
                 }
             }
         }
    }
}
