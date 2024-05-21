package Exercice3;

import java.util.ArrayList;

public class Responsable extends Employe{
	 private ArrayList<Employe> subordonnes;

	    public Responsable(String nom, int matricule, double indiceSalarial) {
	        super(nom, matricule, indiceSalarial);
	        this.subordonnes = new ArrayList<>();
	    }

	    public void ajouterSubordonne(Employe employe) {
	        subordonnes.add(employe);
	    }

	    public void afficherSubordonnesDirects() {
	        System.out.println("Subordonnés directs de " + nom + ":");
	        for (Employe e : subordonnes) {
	            e.afficherCaracteristiques();
	        }
	    }

	    public void afficherSubordonnesIndirects() {
	        System.out.println("Subordonnés directs et indirects de " + nom + ":");
	        afficherSubordonnesIndirects(this);
	    }

	    private void afficherSubordonnesIndirects(Responsable responsable) {
	        for (Employe e : responsable.subordonnes) {
	            e.afficherCaracteristiques();
	            if (e instanceof Responsable) {
	                afficherSubordonnesIndirects((Responsable) e);
	            }
	        }
	    }
}
