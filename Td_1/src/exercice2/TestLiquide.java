package exercice2;

public class TestLiquide {
    public static void main(String[] args) {

        Tasse[] tasses = new Tasse[3];

        Tasse tasse1 = new Tasse();
        Tasse tasse2 = new Tasse();
        Tasse tasse3 = new Tasse();

        tasse1.AjouterLiquide(new Cafe());
        tasse2.AjouterLiquide(new Lait());

        tasses[0] = tasse1;
        tasses[1] = tasse2;
        tasses[2] = tasse3;

        for (int i = 0; i < tasses.length; i++) {
            System.out.print("Tasse " + (i + 1) + ": ");
            tasses[i].imprimer();
        }
    }
}
