public class Terrain 
{
    private double longueur;     
    private double largeur;
    private String typePropriete;
    private String adresse;
    private boolean occupe;

    public Terrain(double longueur, double largeur, String typePropriete, String adresse, boolean occupe)
    {
        this.longueur = longueur;
        this.largeur = largeur;
        this.typePropriete = typePropriete;
        this.adresse = adresse;
        this.occupe = occupe;
    }

    public double calculerSurface()
    {
        return this.longueur * this.largeur;
    }

    public void allouer(Personne personne)
    {
        if(this.occupe == false)
        {
            personne.setTerrain(this);
            this.occupe = true; 
            personne.setSurfaceOccupee(this.calculerSurface());
        }
        else
        {
            System.out.println("Le terrain est occupe");
        }
    }

    public String toString()
    {
        return "Longueur Terrain: " + this.longueur + "\n" +
        "Largeur Terrain: " + this.largeur + "\n" +
        "Type de Propriete: " + this.typePropriete + "\n" +
        "Adresse Terrain: " + this.adresse + "\n" +
        "Occupation: " + this.occupe + "\n";
    }

}
