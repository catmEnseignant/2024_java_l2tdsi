package exercice3;

public class Employe {
    private String nom;
    private int matricule;
    private double indiceSalairial;
    private static double valeurSalaire;

    public Employe(String nom, int matricule, double indiceSalairial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalairial = indiceSalairial;
    }

    public void afficherCaracteristiques() {
        System.out.println("Nom: " + nom);
        System.out.println("Matricule: " + matricule);
        System.out.println("Indice salarial: " + indiceSalairial);
    }

    public double calculerSalaire() {
        return indiceSalairial * valeurSalaire;
    }

    public static void setValeurSalaire(double valeur) {
        valeurSalaire = valeur;
    }

}
