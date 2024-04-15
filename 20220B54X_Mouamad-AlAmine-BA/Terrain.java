package examen;

public class Terrain {
    private double longueur;
    private double largeur;
    private String typePropriete;
    private String adresse;
    private boolean occupe;

    public Terrain(double longueur, double largeur, String type, String adresse, boolean occupe) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.typePropriete = type;
        this.adresse = adresse;
        this.occupe = occupe;
    }

    public boolean isOccupe() {
        return occupe;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }

    public double calculerSurface() {
        return longueur * largeur;
    }

    public void allouer(Personne personne) {
        System.out.println("Votre numero de telephone est : " + personne.getNumero());
        System.out.println("Avec votre prenom " + personne.getPrenom());
        System.out.println("Et comme nom " + personne.getNom());
        System.out.println("Votre terrain se trouve à : " + adresse);
        System.out.println("Avec une longueur de : " + longueur);
        System.out.println("Et sa largeur est : " + largeur);
        
    }
}
