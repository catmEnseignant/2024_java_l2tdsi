public class Employes {

    public Employes(String nom, String matricule, double indiceSalarial, double SalaireNormal) {
        this.matricule = matricule;
        this.nom = nom;
        this.indiceSalarial = indiceSalarial;
        this.SalaireNormal = SalaireNormal;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public double getIndiceSalarial() {
        return indiceSalarial;
    }

    public void setSalaireNormale(double valeur){
        this.SalaireNormal = valeur;
    }

    public double calculerSalaire() {
        return this.SalaireNormal * this.indiceSalarial;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Matricule : " + this.matricule);
        System.out.println("Indice salarial : " + this.indiceSalarial);
        System.out.println("Salaire : " + calculerSalaire());
    }


    protected String matricule;
    protected String nom;
    protected double indiceSalarial;
    protected double SalaireNormal;
}