package exo3;

public class Employe {
    protected String nom;
    private String matricule;
    private double indiceSalarial;
    private static double valeurSalaire = 1000; // Exemple de valeur pour le salaire

    public Employe(String nom, String matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public void afficherCaracteristiques() {
        System.out.println("Nom : " + nom);
        System.out.println("Matricule : " + matricule);
        System.out.println("Indice salarial : " + indiceSalarial);
    }

    public double calculerSalaire() {
        return indiceSalarial * valeurSalaire;
    }
}

