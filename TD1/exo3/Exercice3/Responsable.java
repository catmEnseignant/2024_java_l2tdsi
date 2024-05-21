
package Exercice3;

import java.util.ArrayList;
import java.util.List;

public class Responsable extends Employe {
    private List<Employe> inferieurs;

    public Responsable(String nom, String matricule, int indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.inferieurs = new ArrayList<>();
    }

    public void ajouterInferieur(Employe employe) {
        inferieurs.add(employe);
    }

    public void afficherInferieursDirects() {
        System.out.println("Inférieurs directs de " + getNom() + ":");
        for (Employe e : inferieurs) {
            System.out.println("- " + e.getNom());
        }
    }

    public void afficherInferieursIndirects() {
        System.out.println("Inférieurs indirects de " + getNom() + ":");
        afficherInferieursIndirectsHelper(this);
    }

    private void afficherInferieursIndirectsHelper(Responsable responsable) {
        for (Employe e : responsable.inferieurs) {
            System.out.println("- " + e.getNom());
            if (e instanceof Responsable) {
                afficherInferieursIndirectsHelper((Responsable) e);
            }
        }
    }
}
