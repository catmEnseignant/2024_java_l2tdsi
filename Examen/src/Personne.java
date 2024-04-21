/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author ousmane
 */
public class Personne {
   
    private String numeroTelephone;
    private String prenom;
    private String nom;
    private double surfaceOccupee = 0;

    public Personne(String numeroTelephone, String prenom, String nom) {
        this.numeroTelephone = numeroTelephone;
        this.prenom = prenom;
        this.nom = nom;
    }
    public String geNumeroTelephone(){
    return numeroTelephone;
 }
    
public String Prenom(){
    return prenom;
 }

public String getNom(){
    return nom;
 }

public double getSurfaceOccupee(){
    return surfaceOccupee;
 }

}
