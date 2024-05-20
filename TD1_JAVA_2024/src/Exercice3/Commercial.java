package Exercice3;

class Commercial extends Employe {
    private double ventesMois;
    private double tauxCommission;

    public Commercial(String nom, int matricule, int indiceSalarial, double tauxCommission) {
        super(nom, matricule, indiceSalarial);
        this.ventesMois = 0.0;
        this.tauxCommission = tauxCommission;
    }

    public void mettreAJourVentes(double ventes) {
        this.ventesMois = ventes;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + (ventesMois * tauxCommission);
    }

    @Override
    public void afficherCaracteristiques() {
        super.afficherCaracteristiques();
        System.out.println("Ventes du mois: " + ventesMois + ", Taux de commission: " + tauxCommission);
    }
}
