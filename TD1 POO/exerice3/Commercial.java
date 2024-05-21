public class Commercial extends Employe {
    private double ventesDernierMois;
    private static final double POURCENTAGE_INTERESSEMENT = 0.05;

    public Commercial(String nom, String matricule, double indiceSalarial, double ventesDernierMois) {
        super(nom, matricule, indiceSalarial);
        this.ventesDernierMois = ventesDernierMois;
    }

    public void mettreAJourVentes(double ventes) {
        this.ventesDernierMois = ventes;
    }

    @Override
    public double calculerSalaire() {
        double salaireFixe = super.calculerSalaire();
        double interessement = ventesDernierMois * POURCENTAGE_INTERESSEMENT;
        return salaireFixe + interessement;
    }
}
