package Exo3;

public class Employer {
    
    private String nom;
    private String matricule;
    private double indiceSalarial;
    private static double valeurSalaire = 10000;  

    public Employer(String nom, String matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public static void setValeurSalaire(double Valeur) {
        valeurSalaire = Valeur;
    }

    public String getNom() {
        return nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public double getIndiceSalarial() {
        return indiceSalarial;
    }

    public static double getValeurSalaire() {
        return valeurSalaire;
    }

    public double calculerSalaire() {
        return this.indiceSalarial * valeurSalaire;
    }

    public void afficher() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Matricule: " + this.matricule);
        System.out.println("Indice Salarial: " + this.indiceSalarial);
        System.out.println("Salaire: " + calculerSalaire());
    }

}
