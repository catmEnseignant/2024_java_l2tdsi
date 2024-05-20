package exercice1;

public class Tasse {
    private Liquide liquide;

    public void ajouterLiquide(Liquide li) {
        this.liquide = li;
    }

    public void imprimer() {
        if (liquide != null) {
            liquide.imprimer();
        } else {
            System.out.println("La tasse est vide");
        }
    }

}
