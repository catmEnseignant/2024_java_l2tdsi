package Exercice4;
import java.util.ArrayList;

public class Responsable extends Employe {
    private ArrayList<Employe> subordonnes;

    public Responsable(String nom, String matricule, int indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.subordonnes = new ArrayList<>();
    }

    public void ajouterSubordonne(Employe employe) {
        subordonnes.add(employe);
    }

    public void afficherSubordonnesDirects() {
        System.out.println("Subordonnés directs de " + super.nom + ":");
        for (Employe subordonne : subordonnes) {
            System.out.println(" - " + subordonne.nom);
        }
    }

    public void afficherSubordonnesIndirects() {
        System.out.println("Subordonnés directs et indirects de " + super.nom + ":");
        afficherSubordonnesIndirectsHelper(this);
    }

    private void afficherSubordonnesIndirectsHelper(Responsable responsable) {
        for (Employe subordonne : responsable.subordonnes) {
            System.out.println(" - " + subordonne.nom);
            if (subordonne instanceof Responsable) {
                afficherSubordonnesIndirectsHelper((Responsable) subordonne);
            }
        }
    }
}
