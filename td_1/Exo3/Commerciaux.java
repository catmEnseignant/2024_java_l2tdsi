package Exo3;
public class Commerciaux extends Employer {
    
    private double ventesDuMois;

    public Commerciaux(String nom, String matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.ventesDuMois = 0.0;
    }

    public void mettreAJourVentes(double ventes) {
        this.ventesDuMois = ventes;
    }

    @Override
    public double calculerSalaire() {
        // Salaire composé du fixe et d'un intéressement de 5% sur les ventes
        return super.calculerSalaire() + (0.05 * this.ventesDuMois);
    }
}
