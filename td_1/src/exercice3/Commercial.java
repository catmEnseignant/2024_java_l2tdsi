package exercice3;

public class Commercial extends Employe {
    private float ventesDernierMois;
    private float tauxInt;

    public Commercial(String nom, int mat, int indice, float tauxInt) {
        super(nom, mat, indice);
        this.ventesDernierMois = 0.0f;
        this.tauxInt = tauxInt;
    }

    public void mettreAJourVentes(float ventes) {
        this.ventesDernierMois = ventes;
    }

    @Override
    public float getSalaire() {
        return Salaire;
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public void calculSalaire() {
        float salaireInt = ventesDernierMois * tauxInt;
        this.Salaire = this.indiceS * getValeurS() + salaireInt;
    }

    @Override
    public void afficher() {
        System.out.println("Le commercial " + getNom() + " avec la matricule " + this.matricule + " a un salaire de " + this.Salaire + ".");
        System.out.println("Ventes du dernier mois: " + this.ventesDernierMois);
        System.out.println("Taux d'intéressement: " + this.tauxInt);
    }
}
