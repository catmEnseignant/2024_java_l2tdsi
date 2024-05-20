package Exercice2;

public class TestAnimaux {

	public static void main(String[] args) {
		//Creation d'un animal, un chat et un chien
		Animal animal = new Animal();
        Chat chat = new Chat();
        Chien chien = new Chien();

        //Affichage des trois animaux (toString)
        System.out.println(animal.toString());         
        System.out.println(chat.toString()); 
        System.out.println(chien.toString()); 
      
       // Affichage des cris des animaux 
        System.out.println(animal.cri()); 
        System.out.println(chat.cri()); 
        System.out.println(chien.cri()); 
        System.out.println(chien.aboyer());    
        
        
        //On considere le chat et le Chien comme  etant deux animaux 
        Animal achat = chat;
        Animal achien = chien;
        
        System.out.println(achat);
        System.out.println(achien);
        
        
        //System.out.println(achien.aboyer(); // Cela ne fonctionne pas car la methode aboyer() n'est pas defini pour un type animal
        
        
    

	}

}
