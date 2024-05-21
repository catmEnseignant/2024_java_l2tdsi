/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo_3;

/**
 *
 * @author HP
 */

class Commercial extends Employe
{
    private double ventesDuMois;
    private static final double POURCENTAGE_INTERESSEMENT = 0.05;

    public Commercial(String nom, String matricule, double indiceSalarial, double ventesDuMois)
    {
        super(nom, matricule, indiceSalarial);
        this.ventesDuMois = ventesDuMois;
    }

    public void mettreAJourVentes(double nouvellesVentes)
    {
        this.ventesDuMois = nouvellesVentes;
    }

    public double calculerSalaire()
    {
        return super.calculerSalaire() + ventesDuMois * POURCENTAGE_INTERESSEMENT;
    }
}
