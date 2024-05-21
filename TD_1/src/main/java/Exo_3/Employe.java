/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo_3;

/**
 *
 * @author HP
 */
public class Employe
{
    protected String nom;
    protected String matricule;
    protected double indiceSalarial;
    protected static double baseSalaire = 300000;

    public Employe(String nom, String matricule, double indiceSalarial)
    {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    public double calculerSalaire() {
        return indiceSalarial * baseSalaire;
    }

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Matricule: " + matricule);
        System.out.println("Indice Salarial: " + indiceSalarial);
        System.out.println("Salaire: " + calculerSalaire());
    }

    public static void setBaseSalaire(double nouveauBaseSalaire)
    {
        baseSalaire = nouveauBaseSalaire;
    }
}
