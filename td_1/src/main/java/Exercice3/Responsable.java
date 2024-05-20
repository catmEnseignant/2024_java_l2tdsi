/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice3;

import java.util.ArrayList;
import java.util.List;

public class Responsable extends Employer {
    private List<Employer> inferieursDirects;

    public Responsable(String nom, String matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.inferieursDirects = new ArrayList<>();
    }

    public void ajouterInferieur(Employer employer) {
        inferieursDirects.add(employer);
    }

    public void afficherInferieursDirects() {
        for (Employer e : inferieursDirects) {
            e.afficher();
        }
    }

    public void afficherInferieursTotaux() {
        afficherInferieursDirects();
        for (Employer e : inferieursDirects) {
            if (e instanceof Responsable) {
                ((Responsable) e).afficherInferieursTotaux();
            }
        }
    }
}
