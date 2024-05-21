public class TestLiquide {
    public static void main(String[] args) {
        Tasse[] tasses = new Tasse[3];

        // Initialiser les tasses
        for (int i = 0; i < tasses.length; i++) {
            tasses[i] = new Tasse();
        }

        // Créer les différents liquides
        Liquide liquide = new Liquide();
        Cafe cafe = new Cafe();
        Lait lait = new Lait();

        // Ajouter les liquides aux tasses
        tasses[0].ajouterLiquide(liquide);
        tasses[1].ajouterLiquide(cafe);
        tasses[2].ajouterLiquide(lait);

        // Imprimer le contenu des tasses
        for (Tasse tasse : tasses) {
            tasse.imprimer();
        }
    }
}
