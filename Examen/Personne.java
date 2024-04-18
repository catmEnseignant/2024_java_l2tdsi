public class Personne 
{
    private String numeroTelephone;
    private String nom;
    private double surfaceOccupee = 0;
    private Terrain terrain = null;

    public Personne(String numeroTelephone, String nom)
    {
        this.numeroTelephone = numeroTelephone;
        this.nom = nom;
    }

    public Terrain getTerrain()
    {
        return this.terrain;
    }

    public void setTerrain(Terrain terrain)
    {
        this.terrain = terrain;
    }

    public void setSurfaceOccupee(double surfaceOccupee) 
    {
        this.surfaceOccupee = surfaceOccupee;
    }

    public String getNom() 
    {
        return this.nom;
    }

    public String toString()
    {
        return "Nom: " + this.nom + "\n" +
        "Numero Telephone: " + this.numeroTelephone + "\n" + 
        "Terrain: " + this.terrain +
        "Surface occupee: " +  this.surfaceOccupee + "\n";
    }
}
