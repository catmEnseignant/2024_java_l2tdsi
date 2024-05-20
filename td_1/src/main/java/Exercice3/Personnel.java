/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice3;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    private List<Employer> employers;

    public Personnel() {
        employers = new ArrayList<>();
    }

    public void ajouterEmployer(Employer employer) {
        employers.add(employer);
    }

    public double calculerSommeSalaires(double valeurIndice) {
        double somme = 0;
        for (Employer e : employers) {
            somme += e.calculerSalaire(valeurIndice);
        }
        return somme;
    }
}
