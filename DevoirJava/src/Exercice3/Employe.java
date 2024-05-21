package Exercice3;

public class Employe {
	protected String nom;
    protected int matricule;
    protected double indiceSalarial;
    private static double valeurSalariale = 1000.0; // Valeur de base pour l'indice salarial
    public Employe(String nom, double salaire) {
        // Initialisation avec des paramètres
    }
    public Employe(String nom, int matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public double calculerSalaire() {
        return indiceSalarial * valeurSalariale;
    }

    public void afficherCaracteristiques() {
        System.out.println("Nom: " + nom + ", Matricule: " + matricule + ", Salaire: " + calculerSalaire());
    }

    public static void setValeurSalariale(double valeur) {
        valeurSalariale = valeur;
    }
}
