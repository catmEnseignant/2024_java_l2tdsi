import java.util.Scanner;


public class Examen
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        // Exercice3

        /*
        
        int entier, i, j = 0;
        
        do {
            System.out.println("Saisir un entier strictement positif");
            entier = read.nextInt();
        } while (entier < 1);

        for (i = 1; i <= entier; i++)
        {
            if (entier % i == 0)
            {
                j++;
            }
        }
        
        int tab[] = new int [j];

        j = 0;
        
        for (i = 1; i <= entier; i++)
        {
            if (entier % i == 0)
            {
                tab[j] = i;
                j++;
            }
        }
        
        if (j==2)
        {
            System.out.println(entier +" est premier");
        }
        else
        {
            System.out.println(entier +" n'est pas premier");
        }
        
        System.out.println("Les diviseurs de l'entier "+ entier +" sont:");
        
        System.out.print(tab[0]);
        
        for (int h = 1; h < j; h++)
        {
            System.out.print(" , "+tab[h]);
        }
        
        */
        
        // Exercice4
        
        Terrain t1 = new Terrain(30, 8, "ttf", "Dakar");
        Terrain t2 = new Terrain(35, 50, "tnf", "Mbour");
        
        Personne p1 = new Personne("708380727", "SALOMON", "MBENGUE");
        Personne p2 = new Personne("705769464", "SALIMATA", "DIOUF");
        
        t1.allouer(p1);
        t2.allouer(p2);
        
        double surf = t1.calculerSurface();
        p1.setSurfaceOccupe(surf);
        
        surf = t2.calculerSurface();
        p2.setSurfaceOccupe(surf);
        
        t1.affiche();
        t2.affiche();
        
        p1.print();
        p2.print();
        
        
        read.close();
    }

}