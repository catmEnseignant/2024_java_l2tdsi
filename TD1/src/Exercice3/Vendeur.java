/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice3;

public class Vendeur extends Employe {

    private float ventesMensuelles;

    public Vendeur(String nom, int numeroIdentification, float indiceSalaire, float ventesMensuelles) {
        super(nom, numeroIdentification, indiceSalaire);
        this.ventesMensuelles = ventesMensuelles;
    }

    public void updateMonthlySales(float ventesMensuelles) {
        this.ventesMensuelles = ventesMensuelles;
    }

    @Override
    public float calculateSalary() {
        if (valeurIndice == 0) {
            throw new IllegalArgumentException("La valeur de l'indice salarial n'est pas définie.");
        } else {
            float salaireBase = indiceSalaire * valeurIndice;
            // Calcul de l'intéressement (à implémenter selon les règles de l'entreprise)
            float commission = 0.0f; // Exemple: 5% des ventes
            return salaireBase + commission;
        }
    }

    // Méthode ajoutée pour obtenir le nom de l'employé
    @Override
    public String getNom() {
        return this.nom;
    }

    String nom;

    public float getVentesMensuelles() {
        return ventesMensuelles;
    }

}
