package exercice1;

public class TestLiquide {
    public static void main(String[] args) {
        
        Liquide eau = new Liquide();
        Cafe cafe = new Cafe();
        Lait lait = new Lait();

        Tasse[] tasses = new Tasse[3];
        tasses[0] = new Tasse();
        tasses[1] = new Tasse();
        tasses[2] = new Tasse();

        tasses[0].ajouterLiquide(eau);
        tasses[1].ajouterLiquide(cafe);
        tasses[2].ajouterLiquide(lait);

        for (Tasse tasse : tasses) {
            tasse.imprimer();
        }
    }

}
