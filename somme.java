package TD3;
import java.util.Scanner;

public class somme {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("saisissez la valeur de n: ");
		int n =scr.nextInt();
		int j=0;
		int i;
		for (i = 1 ; i<=n ; i++) {
			j = j+i;
			
			
		}

		System.out.println("la somme des " + n + " premiers nombres est: " + j);
		

	}

}
