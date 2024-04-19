import java.util.Scanner;

public class Examen
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Exercice 3

        /*

        int entier , i , compteur ;
        do {
            System.out.print("Entrer un entier strictement positif : ");
            entier = input.nextInt();
        } while(entier<=0);

        compteur = 0;

        for (i=1 ; i<= entier; i++)
        {
            if(entier % i == 0)
            {
                compteur++;
            }
        }
        System.out.println();

        if(compteur==2)
        {
            System.out.println(entier + " est premier. \n");
        } else {
            System.out.println(entier + " n'est pas premier. \n");
        }

        System.out.print("Les diviseurs de " + entier + " sont : ");
        for(i=1; i<entier ;i++)
        {
            if(entier % i ==0)
                System.out.print(i + " , ");
        }
        System.out.println(entier + ".\n");
        
        */

        //Exercice 4

        /*

        Terrain terrain1 = new Terrain(20.45 , 15.32 , "bye" , "Keur Mbaye Fall", false);
        Terrain terrain2 = new Terrain(80.45 , 35.32 , "délibération" , "Niague", false);

        Personne personne1 = new Personne("+221 785554220" , "Demba" , "Sow" , terrain1.calculerSurface(20.45,15.32));
        Personne personne2 = new Personne("+221 767955480" , "Abou" , "Traika" , terrain2.calculerSurface(80.45 , 35.32));

        personne1.affichage();
        terrain1.affiche();

        System.out.println();

        personne2.affichage();
        terrain2.affiche();

        System.out.println();

        */

        input.close();
        
    }
}