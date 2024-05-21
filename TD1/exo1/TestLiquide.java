
import Exercice1.*;

public class TestLiquide {
    public static void main(String[] args) {
        // Création d'un tableau de Tasses contenant différents liquides
        Tasse[] tasses = new Tasse[3];
        tasses[0] = new Tasse();
        tasses[1] = new Tasse();
        tasses[2] = new Tasse();

        // Ajout des liquides dans les tasses
        tasses[0].ajouterLiquide(new Cafe());
        tasses[1].ajouterLiquide(new Lait());
        tasses[2].ajouterLiquide(new Liquide()); // Vous pouvez aussi ajouter un liquide générique

        // Affichage des liquides dans les tasses
        for (int i = 0; i < tasses.length; i++) {
            System.out.print("Tasse " + (i + 1) + ": ");
            tasses[i].imprimer();
        }
    }
}

