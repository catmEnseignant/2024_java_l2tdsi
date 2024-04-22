import java.util.Scanner;

/**
 * Examen
 */
public class Examen {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {
       
       // Création des deux terrains.
    Terrain terrain1 = new Terrain(22, 44, "deliberation", "Parcelle", false);
    Terrain terrain2 = new Terrain(33, 66, "deliberation", "Unite3", true);

    // Création des deux Personnes.
    Personne perso1 = new Personne("708658180", "Mouhamed", "Ndiaye");
    Personne perso2 = new Personne("763968739", "Penda", "Diop");

    // Allocation des terrains.
    terrain1.allouer(perso1);
    terrain2.allouer(perso2);


    // Affichage des informations détaillées.
    System.out.println("\nAffichage des informations détaillées de la person1`\n");
    System.out.println(perso1.getPrenom() + " " + perso1.getNom() + " " + perso1.getNumeroTelephone() );
    System.out.println(terrain1.toString());
    terrain1.allouer(perso1);
    //
    System.out.println("\nAffichage des informations détaillées de la person2`\n");
    System.out.println( perso2.getPrenom()  +" "+ perso2.getNom()  +" " + perso2.getNumeroTelephone() );
    System.out.println(terrain2.toString());
    terrain2.allouer(perso2);
       
       
       
       
       
        /*  
        
        //Exercice 3.
        int n;
        // Test du signe de n.
        do {
            System.out.println("Entrer un entier strictement positif :");
            n = sc.nextInt();
        } while (n <= 0);

        int[] tabEntiers = new int[n]; // Déclaration d'un tableau
        int compt = 0; // Compteur

        // Vérification des diviseurs.
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tabEntiers[compt] = i;
                compt++;
            }
        }

        // Vérification de la primalité.
        if (compt == 2) {
            System.out.println(n + " est un nombre premier");
        } else {
            System.out.println(n + " n'est pas un nombre premier");
        }

        System.out.println("Les diviseurs de " + n + " sont :");

        for (int j = 0; j < compt; j++) {
            System.out.print(tabEntiers[j] + ",");
        } */

    }
}
