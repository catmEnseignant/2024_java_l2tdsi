
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 5; // Nombre pour lequel calculer le factoriel
        
        Version factorialCalculator = new Version();
        long result = factorialCalculator.calculateFactorial(number);
        
        System.out.println("Le factoriel de " + number + " est : " + result); 
	}

}
