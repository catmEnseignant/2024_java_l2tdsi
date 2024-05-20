package exercice4;

public class Commercial extends Employe {
    private double ventesDuMois;
    private double pourcentageCommission;

    public Commercial(String nom, int matricule, double indiceSalarial, double pourcentageCommission) {
        super(nom, matricule, indiceSalarial);
        this.pourcentageCommission = pourcentageCommission;
    }

    public void mettreAJourVentes(double ventes) {
        this.ventesDuMois = ventes;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + (ventesDuMois * pourcentageCommission);
    }
}

