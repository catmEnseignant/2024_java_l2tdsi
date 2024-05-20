package exercice3;

public class Employe {

    private String nom;
    private int matricule;
    private double indiceSalarial;

    public Employe(String nom, int matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public double getIndiceSalarial() {
        return indiceSalarial;
    }

    public void setIndiceSalarial(double indiceSalarial) {
        this.indiceSalarial = indiceSalarial;
    }

    public double calculerSalaire() {
        return indiceSalarial * 380; // Assuming a base salary of 380€ per month
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", matricule=" + matricule +
                ", indiceSalarial=" + indiceSalarial +
                '}';
    }
    public double calculerSommeSalaire() {
        // Add your logic here to calculate the total salary. 
        // This could involve adding bonuses, commissions, etc. based on your requirements.
        return calculerSalaire(); // Assuming this is a placeholder for now
    }       

    public Employe[] getSubordonnesDirects() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getSubordonnesDirects'");
    }
}
