package exercice1;
import java.util.*;
public class AppelTri
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int indice;
        do {
            System.out.println("Veuillez entrer le nombre d'element de votre tableau");
            indice = read.nextInt();
            if (indice <= 2) {
                System.out.println("Le nombre d'element doit etre superieur ou egal a 2.");
            }
        }while( indice <=2);

        int[] tab= new int[indice];
        for (int i = 0; i < indice; i++)
        {
            System.out.println("Veuillez entrer l'indice "+ i +" de votre tableau:");
            tab[i] = read.nextInt();
        }
        System.out.println("Le tebleau avant tri:");
        for (int i = 0; i < indice; i++) {
            System.out.print(tab[i]);
            if (i != indice-1)
            {
                System.out.print(" - ");
            }
        }

        TriTab tab1 = new TriTab(tab);
        tab1.tri();
        System.out.println(" ");
        System.out.println("Le tableau apres le tri:");
        tab1.Afficher();
    }
}
