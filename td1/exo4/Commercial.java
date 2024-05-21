package exo4;
public class Commercial extends Employe {
    private double ventesDernierMois;
    private double fixe;

    public Commercial(String nom, String matricule, int indiceSalarial, double fixe) {
        super(nom, matricule, indiceSalarial);
        this.fixe = fixe;
        this.ventesDernierMois = 0.0;
    }

    public void mettreAJourVentes(double ventes) {
        this.ventesDernierMois = ventes;
    }

    @Override
    public double calculerSalaire() {
        return fixe + ventesDernierMois * 0.05;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Nom: " + getNom() + ", Matricule: " + getMatricule() + ", Salaire: " + calculerSalaire() + ", Ventes du dernier mois: " + ventesDernierMois);
    }
}
