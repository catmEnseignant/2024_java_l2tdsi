package Examen;

public class Personne {
    private String numeroTelephone;
    private String prenom;
    private String nom;
    private double surfaceOccupee = 0;

    public Personne(String numeroTelephone, String prenom, String nom) {
        this.numeroTelephone = numeroTelephone;
        this.prenom = prenom;
        this.nom = nom;
    }

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

 public String informationsPersonne(){
    return " mon numero  " + this.numeroTelephone + "   je m'appelle  " + this.prenom + "  ans  mon  nom " + this.nom;
}
