
public class Personne
{
    public Personne(String numeroTelephone , String prenom ,  String nom , double surfaceOccupee)
    {
        this.numeroTelephone = numeroTelephone;
        this.prenom = prenom;
        this.nom = nom;
        this.surfaceOccupee = surfaceOccupee;
    }

    public void affichage()
    {
        System.out.println("Prénom : " + prenom);
        System.out.println("Nom : " + nom);
        System.out.println("Numéro téléphone : " + numeroTelephone);
        System.out.println("Aire de son terrain : " + surfaceOccupee);
    }

    private String numeroTelephone;
    private String prenom;
    private String nom;
    private double surfaceOccupee = 0.0;
}