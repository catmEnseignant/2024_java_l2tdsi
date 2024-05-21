public class Employe {
    private String nom;
    private String matricule;
    private double indiceSalarial;
    private static double valeurIndice = 1000.0; // valeur de l'indice salarial

    public Employe(String nom, String matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Matricule: " + matricule + ", Indice Salarial: " + indiceSalarial);
    }

    public double calculerSalaire() {
        return indiceSalarial * valeurIndice;
    }

    public static void setValeurIndice(double valeur) {
        valeurIndice = valeur;
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
}
