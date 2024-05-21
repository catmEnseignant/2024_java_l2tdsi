package exercice4;

public class Commerciaux extends Employe {
    public double VenteDerniersmois;
    public static final double POURCENTAGE_VENTES = 0.1;

    public Commerciaux(String nom, String matricule, int indice, double VenteDerniersmois) {
        super(nom, matricule, indice);
        this.VenteDerniersmois = VenteDerniersmois;
    }

    @Override
    public double calculer() {
        return super.calculer() + (VenteDerniersmois * POURCENTAGE_VENTES);

    }

    public void Mettre_a_jour(double newValue) {
        this.VenteDerniersmois = newValue;
    }
}
