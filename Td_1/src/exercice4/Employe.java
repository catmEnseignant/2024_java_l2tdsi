package exercice4;

public class Employe {
    public String nom;
    public String matricule;
    public int indice;
    static double valeurIndice;

    public Employe(String nom, String matricule, int indice) {
        this.nom = nom;
        this.matricule = matricule;
        this.indice = indice;
    }

    public void Afficher() {
        System.out.println("Nom:" + this.nom);
        System.out.println("Matricule:" + this.matricule);
        System.out.println("l'indice est:" + this.indice);

    }

    public double calculer() {
        return this.indice * valeurIndice;

    }
}
