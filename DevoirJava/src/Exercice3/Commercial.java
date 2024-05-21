package Exercice3;

public class Commercial extends Employe{
	private double ventesDuMois;
    private static double tauxCommission = 0.05;

    public Commercial(String nom, int matricule, double indiceSalarial, double ventesDuMois) {
        super(nom, matricule, indiceSalarial);
        this.ventesDuMois = ventesDuMois;
    }

    public void mettreAJourVentes(double nouvellesVentes) {
        this.ventesDuMois = nouvellesVentes;
    }

    @Override
    public double calculerSalaire() {
        double salaireFixe = super.calculerSalaire();
        double commission = ventesDuMois * tauxCommission;
        return salaireFixe + commission;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Nom: " + nom + ", Matricule: " + matricule + ", Salaire: " + calculerSalaire() + ", Ventes du mois: " + ventesDuMois);
    }
}
