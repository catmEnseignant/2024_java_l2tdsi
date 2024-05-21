/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice3;

/**
 *
 * @author pc
 */
public class Employe {




    private String nom;
    private String matricule;
    private double indiceSalarial;
    private static double valeurSalaireBase = 2000.0; 
   
    public Employe(String nom, String matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    // Méthode pour calculer le salaire
    public double calculerSalaire() {
        return indiceSalarial * valeurSalaireBase;
    }

  
    public void afficherCaracteristiques() {
        System.out.println("Nom : " + nom);
        System.out.println("Matricule : " + matricule);
        System.out.println("Indice Salarial : " + indiceSalarial);
        System.out.println("Salaire : " + calculerSalaire());
    }

   
}
