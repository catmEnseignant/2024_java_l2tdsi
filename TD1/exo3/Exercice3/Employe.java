
package Exercice3;

public class Employe {
    private String nom;
    private String matricule;
    private int indiceSalarial;
    private static double valeurSalaireBase = 1000.0; // Valeur par défaut pour l'indice salarial
    
    public Employe(String nom, String matricule, int indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public String getNom() { return nom;}

    public String getMatricule() { return matricule;}

    public int getIndiceSalarial() {return indiceSalarial; }

    public double calculerSalaire() {return indiceSalarial * valeurSalaireBase;}

    public void afficherCaracteristiques() {
        System.out.println("Nom: " + nom + ", Matricule: " + matricule + ", Indice Salarial: " + indiceSalarial + ", Salaire: " + calculerSalaire());
    }

    public static void setValeurSalaireBase(double nouvelleValeur) {
        valeurSalaireBase = nouvelleValeur;
    }
}
