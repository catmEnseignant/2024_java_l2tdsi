/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo_1;

/**
 *
 * @author HP
 */
public class Tasse {
    private Liquide liquide ;
    public void Ajouter_liquide( Liquide liquide){
        this.liquide = liquide;
    }
    public void imprimer (){
        if (liquide != null){
            liquide.imprimer();
        } else {
            System.out.println("la tasse est vide.");
        }
    }
    
}