/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice1;

/**
 *
 * @author pc
 */
public class TestLiquide {
  


    public static void main(String[] args) {
        Tasse[] tasses = new Tasse[3];

       
        for (int i = 0; i < tasses.length; i++) {
            tasses[i] = new Tasse();
        }

        // Ajouter des liquides aux tasses
        tasses[0].AjouterLiquide(new Cafe());
        tasses[1].AjouterLiquide(new Lait());
        tasses[2].AjouterLiquide(new Liquide());

        
        for (int i = 0; i < tasses.length; i++) {
            System.out.print("Tasse " + (i + 1) + ": ");
            tasses[i].imprimer();
        }
    }
}

    

