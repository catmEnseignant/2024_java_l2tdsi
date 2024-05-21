package exo3;

public class Commercial extends Employe {
    private double ventesMois;

    public Commercial(String nom, String matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.ventesMois = 0;
    }

    public void setVentesMois(double ventesMois) {
        this.ventesMois = ventesMois;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + (0.05 * ventesMois); // Exemple d'intéressement à hauteur de 5%
    }

	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}
}
