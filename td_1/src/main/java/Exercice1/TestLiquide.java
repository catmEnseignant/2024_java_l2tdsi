/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Exercice1;

public class TestLiquide {

    public static void main(String args[]) 
    {
        Tasse[] tasses = new Tasse[3];
        tasses[0] = new Tasse();
        tasses[0].ajouterLiquide(new Cafe());

        tasses[1] = new Tasse();
        tasses[1].ajouterLiquide(new Lait());

        tasses[2] = new Tasse();
        tasses[2].ajouterLiquide(new Liquide());

        for (Tasse tasse : tasses) {
            tasse.imprimer();
        }   
    }
}

