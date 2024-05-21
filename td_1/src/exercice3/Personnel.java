package exercice3;

import java.util.*;

public class Personnel {
    private List<Employe> employes;

    public Personnel() {
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe pers) {
        this.employes.add(pers);
    }

    public float calculerSommeSalaires() {
        float somme = 0.0f;
        for (Employe pers : employes) {
            somme += pers.getSalaire();
        }
        return somme;
    }

    public void afficherEmployes() {
        for (Employe pers : employes) {
            pers.afficher();
        }
    }
}
