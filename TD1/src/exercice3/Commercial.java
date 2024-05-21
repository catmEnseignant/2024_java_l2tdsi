package exercice3;

public class Commercial extends Employe{
    private double venteMois;

    public Commercial(String nom, int matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
    }

    public void setVenteMois(double venteMois) {
        this.venteMois = venteMois;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + venteMois * 0.1;
    }
}
