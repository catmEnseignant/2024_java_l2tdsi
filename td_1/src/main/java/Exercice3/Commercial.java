/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice3;

public class Commercial extends Employer {
    private double ventesDernierMois;
    private double tauxInteressement;

    public Commercial(String nom, String matricule, double indiceSalarial, double tauxInteressement) {
        super(nom, matricule, indiceSalarial);
        this.tauxInteressement = tauxInteressement;
    }

    public void mettreAJourVentes(double ventes) {
        this.ventesDernierMois = ventes;
    }

    @Override
    public double calculerSalaire(double valeurIndice) {
        return super.calculerSalaire(valeurIndice) + (ventesDernierMois * tauxInteressement);
    }
}
