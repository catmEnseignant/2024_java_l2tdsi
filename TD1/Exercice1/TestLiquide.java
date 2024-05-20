import java.util.*;

public class TestLiquide
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int nbreTasse, i;
        System.out.print("\nEntrer le nombre de tasses : ");
        do {
            nbreTasse = sc.nextInt();
            if (nbreTasse <= 0) {
                System.out.print("Le nombre de tasses doit être >= 3 : ");
            }
        } while (nbreTasse < 3);

        System.out.println();

        Tasse[] tasse = new Tasse[nbreTasse];

        for (i=0 ; i<tasse.length ; i++) {
            tasse[i] = new Tasse();
        }

        Liquide[] liquide = {new Cafe(), new Lait(), new Liquide()};

        for (i=0 ; i<liquide.length ; i++){
            tasse[i].AjouterLiquide(liquide[i]);
        }

        for(Tasse tasses : tasse){
            tasses.imprimer();
        }

        System.out.println();

        sc.close();
    }
}