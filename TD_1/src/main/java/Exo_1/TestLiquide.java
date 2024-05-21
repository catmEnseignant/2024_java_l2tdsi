/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo_1;

/**
 *
 * @author HP
 */
public class TestLiquide {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Cafe cafe = new Cafe();
        Lait lait = new Lait();
        Liquide liquide = new Liquide();
        
        Tasse tasse_1 = new Tasse();
        tasse_1.Ajouter_liquide(liquide);
        
        Tasse tasse_2 = new Tasse();
        tasse_2.Ajouter_liquide(lait);
        
        Tasse tasse_3 = new Tasse();
        tasse_3.Ajouter_liquide(cafe);
        
        Tasse tasse_4 = new Tasse();
        
        
        Tasse[] tasses = {tasse_1, tasse_2, tasse_3};
        
        for(Tasse tasse : tasses){
            tasse.imprimer();
        }
    }
    } 

