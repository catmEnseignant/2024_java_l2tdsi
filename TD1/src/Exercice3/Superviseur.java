package Exercice3;

import java.util.ArrayList;
import java.util.List;

public class Superviseur extends Employe {

    private final List<Employe> subordonnesDirects;

    public Superviseur(String nom, int numeroIdentification, float indiceSalaire) {
        super(nom, numeroIdentification, indiceSalaire);
        this.subordonnesDirects = new ArrayList<>();
    }

    public void addDirectReport(Employe employe) {
        subordonnesDirects.add(employe);
    }

    public void displayDirectReports() {
        if (subordonnesDirects.isEmpty()) {
            System.out.println("Cet employé n'a pas de subordonnés directs.");
        } else {
            System.out.println("Subordonnés directs :");
            for (Employe employe : subordonnesDirects) {
                employe.displayCharacteristics();
            }
        }
    }

    public void displayReports(boolean recursive) {
        displayDirectReports();

        if (recursive) {
            for (Employe employe : subordonnesDirects) {
                if (employe instanceof Superviseur) {
                    ((Superviseur) employe).displayReports(true);
                } else {
                    System.out.println("L'employé " + employe.getNom() + " n'est pas un superviseur.");
                }
            }
        }
    }
}
