package Exercice4;
public class Employe {
    private String nom;
    private String matricule;
    private int indiceSalarial;
    private static double valeurSalaire = 1000.0;

    public Employe(String nom, String matricule, int indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public double calculerSalaire() {
        return indiceSalarial * valeurSalaire;
    }

    public void afficherCaracteristiques() {
        System.out.println("Nom: " + nom);
        System.out.println("Matricule: " + matricule);
        System.out.println("Indice Salarial: " + indiceSalarial);
        System.out.println("Salaire: " + calculerSalaire());
    }

    public static void setValeurSalaire(double nouvelleValeur) {
        valeurSalaire = nouvelleValeur;
    }
}
