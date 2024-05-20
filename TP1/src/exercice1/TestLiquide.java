package exercice1;

public class TestLiquide
{
    public static void main(String[] args)
    {
        Cafe cafe = new Cafe();
        Lait lait = new Lait();
        Liquide liquide = new Liquide();

        // Creation des tasses et ajout des liquides
        Tasse tasse1 = new Tasse();
        Tasse tasse2 = new Tasse();
        Tasse tasse3 = new Tasse();

        tasse1.ajouterLiquide(cafe);
        tasse2.ajouterLiquide(lait);
        tasse3.ajouterLiquide(liquide);

        // Creation d'un tableau de tasses
        Tasse[] tasses = {tasse1, tasse2, tasse3};

        // Affichage du contenu de chaque tasse
        for (Tasse tasse : tasses)
        {
            tasse.imprimer();
        }
    }
}
