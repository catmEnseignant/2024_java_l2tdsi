public class Terrain {

    private double longueur;
    private double largeur;
    private String typePropriete;
    private String adresse;
    private boolean occupe;

    public Terrain(double longueur, double largeur, String typePropriete, String adresse, boolean occupe){
        this.longueur = longueur;
        this.largeur = largeur;
        this.typePropriete = typePropriete;
        this.adresse = adresse;
        this.occupe = occupe;
    }

    double surface = longueur*largeur ;
    public static double calculerSurface(double surface){
        return surface;
    }
   
}