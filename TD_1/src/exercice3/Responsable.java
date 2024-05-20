package exercice3;

import java.util.Arrays;

public class Responsable extends Employe {

    private Employe[] subordonnesDirects;

    public Responsable(String nom, int matricule, double indiceSalarial, Employe[] subordonnesDirects) {
        super(nom, matricule, indiceSalarial);
        this.subordonnesDirects = subordonnesDirects;
    }

    
    @Override
    public Employe[] getSubordonnesDirects() {
        return subordonnesDirects;
    }

    public void setSubordonnesDirects(Employe[] subordonnesDirects) {
        this.subordonnesDirects = subordonnesDirects;
    }

    public void afficherSubordonnesDirects() {
        System.out.println("Subordonnés directs de " + getNom() + " :");
        for (Employe subordonne : subordonnesDirects) {
            System.out.println("- " + subordonne);
        }
    }

    public void afficherSubordonnesTousNiveaux() {
        afficherSubordonnesRecrusivement(this);
    }

    private void afficherSubordonnesRecrusivement(Employe responsable) {
        System.out.println("Subordonnés de " + responsable.getNom() + " :");
        for (Employe subordonne : responsable.getSubordonnesDirects()) {
            System.out.println("- " + subordonne);
            afficherSubordonnesRecrusivement(subordonne);
        }
    }
        @Override
    public String toString() {
        return "Responsable{" +
                "nom='" + getNom() + '\'' +
                ", matricule=" + getMatricule() +
                ", indiceSalarial=" + getIndiceSalarial() +
                ", subordonnesDirects=" + Arrays.toString(subordonnesDirects) +
                '}';
    }
    
    }
