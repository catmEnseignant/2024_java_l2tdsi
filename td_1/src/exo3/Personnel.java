package exo3;

import java.util.*;

public class Personnel {
    private ArrayList<Employe> employes;

    public Personnel() {
        employes = new ArrayList<>();
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
}

