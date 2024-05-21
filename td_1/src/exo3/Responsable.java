package exo3;

import java.util.*;

public class Responsable extends Employe {
    private ArrayList<Employe> subordonnes;

    public Responsable(String nom, String matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        subordonnes = new ArrayList<>();
    }

    public void ajouterSubordonne(Employe subordonne) {
        subordonnes.add(subordonne);
    }

    public void afficherSubordonnesDirects() {
        System.out.println("Subordonnés directs de " + super.nom + ":");
        for (Employe subordonne : subordonnes) {
            System.out.println(subordonne.nom);
        }
    }

    public void afficherTousSubordonnes() {
        System.out.println("Subordonnés de " + super.nom + ":");
        for (Employe subordonne : subordonnes) {
            System.out.println(subordonne.nom);
            if (subordonne instanceof Responsable) {
                ((Responsable) subordonne).afficherTousSubordonnes();
            }
        }
    }
}
