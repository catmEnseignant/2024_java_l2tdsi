public class Terrain
{
    private double longueur;
    private double largeur;
    private String typePropriete;
    private String adresse;
    private boolean occupe;

    public Terrain(double longueur, double largeur, String typePropriete, String adresse)
    {
        this.longueur = longueur;
        this.largeur = largeur;
        this.typePropriete = typePropriete;
        this.adresse = adresse;
        this.occupe = false;
    }
    public double calculerSurface()
    {
        return this.largeur*this.longueur;
    }

    public void allouer(Personne personne)
    {
        if (this.occupe)
        {
            this.occupe = false;
        }
        else
        {
            this.occupe = true;
        }
    }

    public boolean getOccupe()
    {
        return this.occupe;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public double getLargeur()
    {
        return largeur;
    }

    public double getLongueur()
    {
        return longueur;
    }

    public String getTypePropriete()
    {
        return typePropriete;
    }
    
    public void affiche()
    {
        System.err.println("caractérstiques du terrain : " +
                            "\n longueur = " + this.longueur +
                            "\n largeur = " +this.largeur + 
                            "\n Type = " + this.typePropriete + 
                            "\n address = " + this.adresse +
                            "\n Disponiblite: " + this.occupe);
    }

}