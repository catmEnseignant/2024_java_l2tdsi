import java.util.Scanner;

public class AppelTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();

        // Créer un tableau de la taille saisie
        int[] tab = new int[size];

        // Demander à l'utilisateur de saisir les éléments du tableau
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < size; i++) {
            tab[i] = scanner.nextInt();
        }

        // Créer une instance de TriTab et trier le tableau
        TriTab triTab = new TriTab(tab);
        triTab.tri();

        // Afficher le tableau trié
        System.out.println("Tableau trié :");
        for (int num : tab) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
