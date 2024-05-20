/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice3;

public class Employer {
    private String nom;
    private String matricule;
    private double indiceSalarial;

    public Employer(String nom, String matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public double calculerSalaire(double valeurIndice) {
        return indiceSalarial * valeurIndice;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Matricule: " + matricule + ", Indice Salarial: " + indiceSalarial);
    }
}
