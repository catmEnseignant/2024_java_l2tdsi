package exercice4;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
    private List<Employe> employes;

    public Entreprise() {
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    public double calculerSommeSalaires() {
        double somme = 0;
        for (Employe e : employes) {
            somme += e.calculerSalaire();
        }
        return somme;
    }

    public void afficherEmployes() {
        for (Employe e : employes) {
            e.afficher();
        }
    }
}

    
