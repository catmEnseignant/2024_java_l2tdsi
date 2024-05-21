package exercice4;

import java.util.ArrayList;
import java.util.Arrays;

public class Responsable extends Employe {

    private Employe[] subordonnesDirects;

    public Responsable(String nom, String matricule, int indice) {
        super(nom, matricule, indice);
        this.subordonnesDirects = subordonnesDirects;

    }

    public void Afficher_inf() {

    }

    public void Afficher_subordonnes() {
        System.out.println("Les subordonnees sont:" + this.nom);

    }

}
