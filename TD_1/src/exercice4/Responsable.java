package exercice4;

import java.util.ArrayList;
import java.util.List;

public class Responsable extends Employe {
    private List<Employe> subordonnes;

    public Responsable(String nom, int matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.subordonnes = new ArrayList<>();
    }

    public void ajouterSubordonne(Employe e) {
        subordonnes.add(e);
    }

    public void afficherSubordonnesDirects() {
        for (Employe e : subordonnes) {
            e.afficher();
        }
    }

    public void afficherTousSubordonnes() {
        afficherSubordonnesDirects();
        for (Employe e : subordonnes) {
            if (e instanceof Responsable) {
                ((Responsable) e).afficherTousSubordonnes();
            }
        }
    }
}

