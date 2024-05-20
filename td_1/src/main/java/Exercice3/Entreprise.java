/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice3;

public class Entreprise {
    public static void main(String[] args) {
        Employer e1 = new Employer("Mariam", "E001", 1.2);
        Employer e2 = new Employer("Amadou", "E002", 1.3);

        Responsable r1 = new Responsable("Aissa", "R001", 1.5);
        r1.ajouterInferieur(e1);
        r1.ajouterInferieur(e2);

        Commercial c1 = new Commercial("Fatima", "C001", 1.1, 0.05);
        c1.mettreAJourVentes(5000);
        
        Personnel personnel = new Personnel();

        System.out.println("Somme des salaires : " + personnel.calculerSommeSalaires(1000));
      
    }
}

