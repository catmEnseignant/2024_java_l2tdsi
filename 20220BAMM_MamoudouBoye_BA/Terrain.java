/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author flexTech
 */

public class Terrain {
    private double longueur;
    private double largeur;
    private   String typePropriete ;
    private String addresse;
    private boolean occupe;

    public Terrain(double longueur, double largeur, String typePropriete, String addresse, boolean occupe) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.typePropriete = typePropriete;
        this.addresse = addresse;
        this.occupe = occupe;
    }
     public double calculerSurface() {
        return longueur * largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public String getTypePropriete() {
        return typePropriete;
    }

    public void setTypePropriete(String typePropriete) {
        this.typePropriete = typePropriete;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public boolean isOccupe() {
        return occupe;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }
    @Override
    public String toString() {
        return "Terrain{" + "longueur=" + longueur + ", largeur=" + largeur + ", typePropriete=" + typePropriete + ", addresse=" + addresse + ", occupe=" + occupe + '}';
    } 
}

   
     /*
      public void allouer(Personne personne){
          if(this.occupe == false){
              personne.SetTerrain(this);
              this.occupe =true;
              personne.SetSurfaceOccupe(this.calculerSurface());
              
          }
          else{
               System.out.println("le terrain est occupe");
          }
      }
    ne decommenter pas le allouer
*/

   

  
    
    

   

