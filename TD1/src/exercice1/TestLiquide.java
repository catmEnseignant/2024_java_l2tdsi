package exercice1;

public class TestLiquide {
    public static void main(String[] args) {
        // Création des objets Liquide, Cafe, et Lait
        Liquide eau = new Liquide();
        Cafe cafe = new Cafe();
        Lait lait = new Lait();

        // Création du tableau de Tasses
        Tasse[] tasses = new Tasse[3];
        tasses[0] = new Tasse();
        tasses[1] = new Tasse();
        tasses[2] = new Tasse();

        // Ajout des liquides aux tasses
        tasses[0].ajouterLiquide(eau);
        tasses[1].ajouterLiquide(cafe);
        tasses[2].ajouterLiquide(lait);

        // Impression du contenu des tasses
        for (Tasse tasse : tasses) {
            tasse.imprimer();
        }
    }

}
