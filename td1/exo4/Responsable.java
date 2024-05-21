package exo4;
import java.util.ArrayList;
import java.util.List;

public class Responsable extends Employe {
    private List<Employe> subordonnes;

    public Responsable(String nom, String matricule, int indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.subordonnes = new ArrayList<>();
    }

    public void ajouterSubordonne(Employe employe) {
        subordonnes.add(employe);
    }

    public void afficherSubordonnesDirects() {
        System.out.println("Subordonnés directs de " + getNom() + ":");
        for (Employe subordonne : subordonnes) {
            subordonne.afficherCaracteristiques();
        }
    }

    public void afficherSubordonnesIndirects() {
        System.out.println("Subordonnés directs et indirects de " + getNom() + ":");
        afficherSubordonnesIndirectsHelper(this);
    }

    private void afficherSubordonnesIndirectsHelper(Responsable responsable) {
        for (Employe subordonne : responsable.subordonnes) {
            subordonne.afficherCaracteristiques();
            if (subordonne instanceof Responsable) {
                afficherSubordonnesIndirectsHelper((Responsable) subordonne);
            }
        }
    }
}
