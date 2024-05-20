package Exo3;

import java.util.ArrayList;
import java.util.List;

public class Responsable extends Employer {
    private List<Employer> subordonnes;

    public Responsable(String nom, String matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.subordonnes = new ArrayList<>();
    }

    public void ajouterSubordonne(Employer subordonne) {
        this.subordonnes.add(subordonne);
    }

    public void afficherSubordonnesDirects() {
        System.out.println("Les subordonnés directs de " + this.getNom() + " sont :");
        for (Employer subordonne : this.subordonnes) {
            System.out.println(subordonne.getNom());
        }
    }

    public void afficherTousSubordonnes() {
        System.out.println("Les subordonnés directs et indirects de " + this.getNom() + " sont :");
        afficherSubordonnesDirects();
        for (Employer subordonne : this.subordonnes) {
            if (subordonne instanceof Responsable) {
                ((Responsable) subordonne).afficherTousSubordonnes();
            }
        }
    }
}

