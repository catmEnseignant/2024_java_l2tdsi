package exo2;

public class Test {
    public static void main(String[] args) {
        Liquide liquide = new Liquide();
        cafe caf = new cafe();
        lait lai = new lait();

        Tasse[] tasses = new Tasse[3];
        for (int i = 0; i < tasses.length; i++) {
            tasses[i] = new Tasse();
        }

        tasses[0].AjouterLiquide(liquide);
        tasses[1].AjouterLiquide(caf);
        tasses[2].AjouterLiquide(lai);

        for (Tasse tasse : tasses) {
            tasse.imprimer();
        }
    }
}
