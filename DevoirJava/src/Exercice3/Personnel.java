package Exercice3;

import java.util.ArrayList;

public class Personnel extends Employe {
    protected ArrayList<Employe> employes;

    public Personnel() {
    	 // J'appel explicite à un constructeur de la classe Employe
        super("NomParDefaut", 0.0); // Remplacez par des valeurs appropriées
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public double calculerSommeSalaires() {
        double somme = 0;
        for (Employe e : employes) {
            somme += e.calculerSalaire();
        }
        return somme;
    }

    public void afficherTousLesEmployes() {
        for (Employe e : employes) {
            e.afficherCaracteristiques();
        }
    }
}
