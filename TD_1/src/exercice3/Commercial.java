package exercice3;

public class Commercial extends Employe {

    private double ventesDernierMois;
    private double fixe;

    public Commercial(String nom, int matricule, double indiceSalarial, double ventesDernierMois, double fixe) {
        super(nom, matricule, indiceSalarial);
        this.ventesDernierMois = ventesDernierMois;
        this.fixe = fixe;
    }

    public double getVentesDernierMois() {
        return ventesDernierMois;
    }

    public void setVentesDernierMois(double ventesDernierMois) {
        this.ventesDernierMois = ventesDernierMois;
    }

    public double getFixe() {
        return fixe;
    }

    public void setFixe(double fixe) {
        this.fixe = fixe;
    }

    @Override
    public double calculerSalaire() {
        double commission = ventesDernierMois * 0.05; // Assuming a 5% commission rate
        return fixe + commission;
    }

    public void mettreAJourVentes(double nouvellesVentesDernierMois) {
        if (nouvellesVentesDernierMois < 0) {
            throw new IllegalArgumentException("Les ventes ne peuvent pas être négatives.");
        }
        this.ventesDernierMois = nouvellesVentesDernierMois;
    }
}

