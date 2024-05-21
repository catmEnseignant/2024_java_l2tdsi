import java.util.ArrayList;

public class Personnel {
    private ArrayList<Employe> employes;

    public Personnel() {
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public double calculerSommeSalaires() {
        double somme = 0;
        for (Employe employe : employes) {
            somme += employe.calculerSalaire();
        }
        return somme;
    }

    public void afficherTousEmployes() {
        for (Employe employe : employes) {
            employe.afficher();
            System.out.println("Salaire: " + employe.calculerSalaire());
        }
    }
}
