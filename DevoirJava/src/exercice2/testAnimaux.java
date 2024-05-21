package exercice2;

public class testAnimaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal animal = new Animal();
	        Animal chat = new Chat();
	        Animal chien = new Chien();

	        System.out.println(animal);
	        System.out.println(chat);
	        System.out.println(chien);
	        System.out.println(chat.Cri());
	      
	     // si l'on essaier d'appeller à la méthode aboyer
	        // System.out.println(chien.aboyer()); // Ceci ne fonctionnera pas parce que le caste n'a pas ete fait.

	        
	        
	}

}
