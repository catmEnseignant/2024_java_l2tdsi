/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo_3;

/**
 *
 * @author HP
 */

import java.util.ArrayList;

class Personnel
{
    private ArrayList<Employe> employes;

    public Personnel() {
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e)
    {
        employes.add(e);
    }

    public double calculerSommeSalaires()
    {
        double somme = 0.0;
        for (Employe e : employes)
        {
            somme += e.calculerSalaire();
        }
        return somme;
    }
}

