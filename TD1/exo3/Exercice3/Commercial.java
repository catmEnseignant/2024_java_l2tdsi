
package Exercice3;

public class Commercial extends Employe {
    private double ventesMois;
    private double tauxInteressement;

    public Commercial(String nom, String matricule, int indiceSalarial, double tauxInteressement) {
        super(nom, matricule, indiceSalarial);
        this.tauxInteressement = tauxInteressement;
    }

    public void mettreAJourVentes(double ventesMois) {
        this.ventesMois = ventesMois;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + (ventesMois * tauxInteressement);
    }

    @Override
    public void afficherCaracteristiques() {
        super.afficherCaracteristiques();
        System.out.println("Ventes du mois: " + ventesMois + ", Taux d'intéressement: " + tauxInteressement);
    }
}
