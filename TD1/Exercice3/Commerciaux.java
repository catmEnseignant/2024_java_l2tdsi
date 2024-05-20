public class Commerciaux extends Employes {
    
    public Commerciaux(String matricule, String nom, double indiceSalarial, double ventesDernierMois , double tauxCommission) {
        super(matricule, nom, indiceSalarial, tauxCommission);
        this.ventesDernierMois = ventesDernierMois;
        this.tauxCommission = tauxCommission;
    }

    public void mettreAJourVentes(double ventes) {
        this.ventesDernierMois = ventes;
    }

    public double calculerSalaire() {
        return super.calculerSalaire() + (this.ventesDernierMois * this.tauxCommission);
    }

    public void afficherInfos(){
        super.afficherInfos();
        System.out.println("Ventes du dernier mois : " + this.ventesDernierMois + ".\n");
    }
    
    protected double ventesDernierMois;
    protected double tauxCommission; // 10% de commission sur les ventes
}
