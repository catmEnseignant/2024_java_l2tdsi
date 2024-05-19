public class Main {
    public static void main(String[] args) {
        Tasse[] tasses = new Tasse[3];

        tasses[0] = new Tasse();
        tasses[0].AjouterLiquide(new cafe());

        tasses[1] = new Tasse();
        tasses[1].AjouterLiquide(new Lait());

        tasses[2] = new Tasse();
        // On laisse la troisième tasse vide pour montrer le cas d'une tasse sans liquide

        for (Tasse tasse : tasses) {
            tasse.imprimer();
        }
    }
}
