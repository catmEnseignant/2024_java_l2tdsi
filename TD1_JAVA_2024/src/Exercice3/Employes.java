package Exercice3;

class Employe {
    private String nom;
    private int matricule;
    private int indiceSalarial;
    private static double valeurIndiceSalarial = 100.0; // valeur par défaut de l'indice salarial

    public Employe(String nom, int matricule, int indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public double calculerSalaire() {
        return indiceSalarial * valeurIndiceSalarial;
    }

    public void afficherCaracteristiques() {
        System.out.println("Nom: " + nom + ", Matricule: " + matricule + ", Indice Salarial: " + indiceSalarial + ", Salaire: " + calculerSalaire());
    }

    public static void setValeurIndiceSalarial(double valeur) {
        valeurIndiceSalarial = valeur;
    }

    public String getNom() {
        return nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public int getIndiceSalarial() {
        return indiceSalarial;
    }
}