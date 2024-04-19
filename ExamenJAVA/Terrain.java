
public class Terrain
{

    public Terrain(double longueur , double largeur , String propriete , String adresse, boolean occupe)
    {
        this.longueur = longueur;
        // System.out.println("Longueur : " + longueur);
        this.largeur = largeur;
        // System.out.println("Largeur : " + largeur);
        this.propriete = propriete;
        // System.out.println("Propriété : " + propriete);
        this.adresse = adresse;
        // System.out.println(adresse);
        this.occupe = occupe;
        // System.out.println(occupe);
    }

    public void affiche()
    {
        System.out.println("Longueur du terrain : " + longueur);
        System.out.println("Largeur du terrain : " + largeur);
        System.out.println("Adresse : " + adresse);
        System.out.println("Propriété : " + propriete);
    }

    public double calculerSurface(double longueur , double largeur)
    {
        double surface = longueur * largeur;
        return surface;
    }

    public void allouer(String personne)
    { 
        // this.occupe = occupe;
        if(occupe)
        {
            System.out.println("ce terrain est déjà occupé.");
        } else {
            System.out.println("ce terrain est à " + personne);
        }
    }

    private double longueur;
    private double largeur;
    private String propriete;
    private String adresse;
    private boolean occupe ;
}