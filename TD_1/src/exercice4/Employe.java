package exercice4;

public class Employe {
    private String nom;
    private int matricule;
    private double indiceSalarial;
    private static double valeurSalaire = 1000.0; // Valeur de base pour le calcul des salaires

    public Employe(String nom, int matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public double calculerSalaire() {
        return indiceSalarial * valeurSalaire;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Matricule: " + matricule + ", Salaire: " + calculerSalaire());
    }

    public static void setValeurSalaire(double nouvelleValeur) {
        valeurSalaire = nouvelleValeur;
    }
}

