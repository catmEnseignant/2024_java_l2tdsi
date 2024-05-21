import java.util.Scanner;
public class Examen {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in) ;
 
/* Exercice 3:
 a. test de primalite
         int m = 0; 
        for (; m <= 0 ;) {
            System.out.print("Entrer un entier strictement positif : ");
            m = scanner.nextInt();
        }
      boolean y = true;
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                y = false;
                break;
            }
        }
        if (y) {
            System.out.println("\n" + m + " est premier");
        } else {
            System.out.println("\n" + m + " n'est pas premier");
        }
        
        scanner.close();
    }
}


b.lister les diviseurs de l'entier saisi

        System.out.print("Les diviseurs de " + m + " sont : ");
        boolean p = true;
        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                if (!p) {
                    System.out.print(", ");
                }
                System.out.print(i);
                p = false;
            }
        }
        
 A./Execution du programme de l'exercice 3
         int m = 0;

       
        for (; m <= 0; ) {
            System.out.print("Entrer un entier strictement positif : ");
            m = scanner.nextInt();
        }

       
        boolean y = true;
        for (int i = 2; i <= m; i++) {
            if (m % i == 0) {
                y = true;
                break;
            }
        }

       
        if (y) {
            System.out.println(m + " est premier");
        } else {
            System.out.println(m + " n'est pas premier");
        }

       
        System.out.print("Les diviseurs de " + m + " sont : ");
        boolean p = true;
        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                if (!p) {
                    System.out.print(", ");
                }
                System.out.print(i);
                p = false;
            }
        }

        scanner.close();
    }
}       
*/         
    }
}
      