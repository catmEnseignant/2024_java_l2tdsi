package exercice3;

class Commercial extends Employe
{
    private double ventesDuMois;
    private static final double POURCENTAGE_INTERESSEMENT = 0.05;

    public Commercial(String nom, String matricule, double indiceSalarial, double ventesDuMois)
    {
        super(nom, matricule, indiceSalarial);
        this.ventesDuMois = ventesDuMois;
    }

    public void mettreAJourVentes(double nouvellesVentes)
    {
        this.ventesDuMois = nouvellesVentes;
    }

    public double calculerSalaire()
    {
        return super.calculerSalaire() + ventesDuMois * POURCENTAGE_INTERESSEMENT;
    }
}

