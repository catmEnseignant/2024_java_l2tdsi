package exercice2;

public class TestTasses {
    public static void main(String[] args) {
        // Création d'un tableau de Tasse
        Tasse[] tasses = new Tasse[3];

        // Initialisation des tasses
        tasses[0] = new Tasse();
        tasses[1] = new Tasse();
        tasses[2] = new Tasse();

        // Création des liquides
        Liquide liquide = new Liquide();
        Cafe cafe = new Cafe();
        Lait lait = new Lait();

        // Ajout des liquides aux tasses
        tasses[0].AjouterLiquide(liquide);
        tasses[1].AjouterLiquide(cafe);
        tasses[2].AjouterLiquide(lait);

        // Affichage des contenus des tasses
        for (Tasse tasse : tasses) {
            tasse.imprimer();
        }
    }
}

