import java.util.Scanner;
public class Examen
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Exercice 3:
        
        int entier;
        int[] diviseurs;
        int i;
        int j;
        do 
        {
            System.out.println("Entrez un entier strictement positif: ");
            entier = sc.nextInt();
        }while(entier <= 0);
        sc.close();
        
        int d = 0;
        int k = 0;
        
        for(i = 1; i <= entier; i++)
        {
            if(entier % i == 0)
            {
                d++;                
            }
        }
        diviseurs = new int[d];
        for(j = 1; j <= entier; j++)
        {
            if(entier % j == 0)
            {
                diviseurs[k] = j;
                k++;
            }
        }
        if(d == 2)
        {
            System.out.println(entier + " est un nombre premier");
        }
        else
        {
            System.out.println(entier + " n'est pas un nombre premier");
        }    
    
        System.out.println("Les diviseurs de " + entier + " sont: ");
        for(int a = 0; a < d - 1; a++)
        {
            System.out.print(diviseurs[a]+" , ");
        }
        System.out.println(diviseurs[d - 1]);
        


        //Exercice 4:


        
        
        Terrain t1 = new Terrain(10.1, 10.1, "bye", "Dakar", false);
        Terrain t2 = new Terrain(20.2, 20.2, "titre foncier", "Tamba", false);

        Personne p1 = new Personne("776495472", "DIOUF");
        Personne p2 = new Personne("779425335", "SECK");

        t1.allouer(p1);
        t2.allouer(p2);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(p1);
        System.out.println(p2);
        
        
    }
}