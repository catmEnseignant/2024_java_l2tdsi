
package Exercice1;

public class Tasse {
    private Liquide liquide;

    public void ajouterLiquide(Liquide liquide) {
        this.liquide = liquide;
    }

    public void imprimer() {
        if (liquide != null) {
            System.out.print("Dans la tasse, ");
            liquide.imprimer();
        } else {
            System.out.println("La tasse est vide");
        }
    }
}
