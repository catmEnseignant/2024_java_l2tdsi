package Exercice4;
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
        double somme = 0.0;
        for (Employe employe : employes) {
            somme += employe.calculerSalaire();
        }
        return somme;
    }

    public void afficherEmployes() {
        for (Employe employe : employes) {
            employe.afficherCaracteristiques();
            System.out.println();
        }
    }
}
