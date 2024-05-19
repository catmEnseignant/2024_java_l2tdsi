package exercice1;

public class TestLiquide {
    public static void main(String[] args) {
        Tasse[] tasses = new Tasse[3];
        tasses[0] = new Tasse();
        tasses[1] = new Tasse();
        tasses[2] = new Tasse();

        tasses[0].AjouterLiquide(new Cafe());
        tasses[1].AjouterLiquide(new Lait());
        tasses[2].AjouterLiquide(new Liquide());

        for (Tasse tasse : tasses) {
            tasse.imprimer();
        }
    }
}
