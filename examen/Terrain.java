/**
 * Terrain
 */
public class Terrain {

    // Déclaration des attributs.
    private double longueur;
    private double largeur;
    private String typePropriete;
    private String adresse;
    private boolean occupe;

    // Constructeur paramétré.
    Terrain(double longueur, double largeur, String typePropriete, String adresse, boolean occupe) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.typePropriete = typePropriete;
        this.adresse = adresse;
        this.occupe = occupe;
    }

    // Calcul de la surface.
    double CalculerSurface() {
        return longueur * largeur;
    }

    // Méthode pour allouer le terrain à une personne.
   
    void allouer(Personne personne) {
        // Vérifier si le terrain n'est pas déjà occupé.
        if (!occupe) {
            // Attribuer le terrain à la personne.
            occupe = true;
            System.out.print( " On vous attribut se terrain.");
        } else {
            System.out.println(  " est déjà occupé.");
        }
    }

    public String toString() {
        return " le Terrain de Longueur =" + longueur + ", et de  Largeur = " + largeur + ",  de Type de Propriété=" + typePropriete
                + ",  qui a pour Adresse =" + adresse  + ", Surface=" + CalculerSurface();
    }


    
}
