package exercice1;

public class Liquide {

    public void imprimer() {
        System.out.println("Je suis un liquide");
    }

}

class Cafe extends Liquide {

    @Override
    public void imprimer() {
        System.out.println("Je suis un café");
    }
}

class Lait extends Liquide {

    @Override
    public void imprimer() {
        System.out.println("Je suis un lait");
    }
}

class Tasse {

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