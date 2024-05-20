
package Exercice2;

public class Main {
    public static void main(String[] args) {
     Tasse[] tasses = {new Tasse(), new Tasse(), new Tasse()};

       
        Liquide[] liquides = {new Café(), new Lait()};

       
        for (int i = 0; i < tasses.length; i++) {
           
            tasses[i].ajouterLiquide(liquides[i % liquides.length]);
        }

      
        for (Tasse tasse : tasses) {
           
            tasse.imprimer();
        }
    }
}