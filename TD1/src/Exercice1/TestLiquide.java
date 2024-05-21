package Exercice1;

/**
 * TestLiquide
 */
public class TestLiquide {
    public static void main(String[] args) {
        // Création d'un tableau de Tasses
        Tasse[] tasses = new Tasse[3];
        tasses[0] = new Tasse();
        tasses[1] = new Tasse();
        tasses[2] = new Tasse();

        // Remplissage des tasses avec différents liquides
        tasses[0].AjouterLiquide(new Cafe());
        tasses[1].AjouterLiquide(new Lait());

        // Affichage du contenu des tasses
        for (Tasse tasse : tasses) {
            tasse.imprimer();
        }
    }
}