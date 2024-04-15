package examen;

public class Personne {
    private String numeroTelephone;
    private String prenom;
    private String nom;
    private double surfaceOccupee = 0;

    public Personne(String numero, String prenom, String nom, double surface) {
        this.numeroTelephone = numero;
        this.prenom = prenom;
        this.nom = nom;
        this.surfaceOccupee = surface;
    }

    public String getNumero() {
        return numeroTelephone;
    }

    public void setNumero(String numero) {
        this.numeroTelephone = numero;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
