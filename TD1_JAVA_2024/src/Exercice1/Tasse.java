package Exercice1;

public class Tasse {
    private Liquide Liquide;

    public void AjouterLiquide(Liquide li) {
        this.Liquide = li;
    }
    public void imprimer() {
        if (Liquide != null) {
            Liquide.imprimer();
        } else {
            System.out.println("La tasse est vide");
        }
    }
}