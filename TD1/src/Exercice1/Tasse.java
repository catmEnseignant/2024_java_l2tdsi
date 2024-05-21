package Exercice1;

/**
 * Tasse
 */
class Tasse {
    Liquide liquide;

    void AjouterLiquide(Liquide li) {
        this.liquide = li;
    }

    void imprimer() {
        if (liquide != null) {
            System.out.print("Tasse contenant ");
            liquide.imprimer();
        } else {
            System.out.println("Tasse vide");
        }
    }
}
