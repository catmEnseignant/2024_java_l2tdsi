/**
 * Personne
 */
public class Personne {

    private String numeroTelephone;
    private String prenom;
    private String nom;
    double surfaceOccupee = 0;

     // Constructeur paramétré.
     Personne(String numeroTelephone, String prenom, String nom){
        this.numeroTelephone = numeroTelephone;
        this.prenom = prenom;
        this.nom = nom;
     }
    

    public String getPrenom() {
        return prenom;
    }
    public String getNom() {
        return nom;
    }
    public String getNumeroTelephone() {
        return numeroTelephone;
    }

}             


