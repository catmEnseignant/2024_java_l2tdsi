/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice3;

/**
 *
 * @author pc
 */



public class Commercial extends Employe {

    private double ventesDernierMois;
    private double tauxInteressement;

    
    public Commercial(String nom, String matricule, double indiceSalarial, double tauxInteressement) {
        super(nom, matricule, indiceSalarial);
        this.ventesDernierMois = 0.0;
        this.tauxInteressement = tauxInteressement;
    }


    public void mettreAJourVentes(double ventes) {
        this.ventesDernierMois = ventes;
    }


 
    public double calculerSalaire() {
        double salaireFixe = getIndiceSalarial() * getValeurSalaireBase();
        double interessement = ventesDernierMois * tauxInteressement;
        return salaireFixe + interessement;
    }

   
    private double getValeurSalaireBase() {
        try {
            java.lang.reflect.Field field = Employe.class.getDeclaredField("valeurSalaireBase");
            field.setAccessible(true);
            return field.getDouble(null);
        } catch (Exception e) {
            e.printStackTrace();
            return 2000.0; 
        }
    }

   
    @Override
    public void afficherCaracteristiques() {
        super.afficherCaracteristiques();
        System.out.println("Ventes du dernier mois : " + ventesDernierMois);
        System.out.println("Salaire total : " + calculerSalaire());
    }

   
}

