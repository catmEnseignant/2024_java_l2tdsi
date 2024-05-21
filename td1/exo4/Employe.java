package exo4;
public class Employe {
    private String nom;
    private String matricule;
    private int indiceSalarial;
    private static double valeurIndice = 1.0; 

    public Employe(String nom, String matricule, int indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public String getNom() {
        return nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public int getIndiceSalarial() {
        return indiceSalarial;
    }

    public static void setValeurIndice(double nouvelleValeur) {
        valeurIndice = nouvelleValeur;
    }

    public double calculerSalaire() {
        return indiceSalarial * valeurIndice;
    }

    public void afficherCaracteristiques() {
        System.out.println("Nom: " + nom + ", Matricule: " + matricule + ", Indice Salarial: " + indiceSalarial + ", Salaire: " + calculerSalaire());
    }
}
