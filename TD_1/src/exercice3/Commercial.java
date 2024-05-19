package exercice3;

public class Commercial extends Employe {
    private double ventesDernierMois;
    private static double tauxCommission = 0.1;

    public Commercial(String nom, String matricule, int indiceSalarial, double ventesDernierMois) {
        super(nom, matricule, indiceSalarial);
        this.ventesDernierMois = ventesDernierMois;
    }

    public void mettreAJourVentes(double ventes) {
        this.ventesDernierMois = ventes;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + ventesDernierMois * tauxCommission;
    }
}
