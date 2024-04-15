/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author flexTech
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

    void SetTerrain(Terrain aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Personne{" + "numeroTelephone=" + numeroTelephone + ", prenom=" + prenom + ", nom=" + nom + ", surfaceOccupee=" + surfaceOccupee + '}';
    }   
    
}

