/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice3;

public class Employe {

    private String nom;
    private final int numeroIdentification;
    protected float indiceSalaire;
    public static float valeurIndice; // Valeur de l'indice salarial pour tous les employés

    public Employe(String nom, int numeroIdentification, float indiceSalaire) {
        this.nom = nom;
        this.numeroIdentification = numeroIdentification;
        this.indiceSalaire = indiceSalaire;
    }

    public void displayCharacteristics() {
        System.out.println("Nom: " + nom);
        System.out.println("Numéro d'identification: " + numeroIdentification);
        System.out.println("Indice salaire: " + indiceSalaire);
        System.out.println("Salaire: " + calculateSalary());
    }

    public float calculateSalary() {
        if (valeurIndice == 0) {
            throw new IllegalArgumentException("Salary value not set.");
        } else {
            return indiceSalaire * valeurIndice;
        }
    }

    public static void setSalaryValue(float salaryValue) {
        Employe.valeurIndice = salaryValue;
    }

    /**
     * @return
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumeroIdentification() {
        return numeroIdentification;
    }
}
