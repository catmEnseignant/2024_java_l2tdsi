package exercice1;
import java.lang.*;
public class TestLiquide {
    public static void main(String[] args)
    {
        Tasse[] tasse = new Tasse[3];

        for (int i = 0; i < 3; i++) {
            tasse[i]=new Tasse();
        }
        tasse[0].AjouterLiquide(new Liquide());
        tasse[1].AjouterLiquide(new Cafe());
        tasse[2].AjouterLiquide(new Lait());


        for (int i = 0; i < 3; i++) {
            tasse[i].imprimer();
        }
    }
}
