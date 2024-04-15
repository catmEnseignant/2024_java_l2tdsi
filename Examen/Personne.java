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

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
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

    public double getSurfaceOccupee() {
        return surfaceOccupee;
    }

    public void setSurfaceOccupee(double surfaceOccupee) {
        this.surfaceOccupee = surfaceOccupee;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "numeroTelephone='" + numeroTelephone + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", surfaceOccupee=" + surfaceOccupee +
                '}';
    }
}
