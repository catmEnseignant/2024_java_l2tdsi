package exercice3;

public class Employe {
    private String nom;
    private String matricule;
    private int indiceSalarial;
    private static double valeurIndice = 1000.0;

    public Employe(String nom, String matricule, int indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public double calculerSalaire() {
        return indiceSalarial * valeurIndice;
    }

    public void afficherCaracteristiques() {
        System.out.println("Nom: " + nom + ", Matricule: " + matricule + ", Indice Salarial: " + indiceSalarial + ", Salaire: " + calculerSalaire());
    }

    public static void setValeurIndice(double nouvelleValeurIndice) {
        valeurIndice = nouvelleValeurIndice;
    }
}
