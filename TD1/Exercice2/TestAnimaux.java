public class TestAnimaux {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Chat chat = new Chat();
        Chien chien = new Chien();

        // Affichage des trois animaux.
        System.out.println(animal);
        System.out.println(chat);
        System.out.println(chien);
        
        // Affichage des trois animaux.
        System.out.println(animal.cri());
        System.out.println(chat.cri());
        System.out.println(chien.cri());
        System.out.println(chien.aboyer());

        Animal achat = chat;
        Animal achien = chien;

        System.out.println(achat);
        System.out.println(achien);
        
        System.out.println(" \nL'instruction \"achien.aboyer()\" ne marchera pas, l'erreur va meme afficher avant la compilation.\n"); // L'instruction ne marchera pas, l'erreur va meme afficher avant la compilation.
 
        System.out.println("\t\t--------------- Explication du non fonction de l'instruction -----------------\n");
        System.out.println("achien est une référence de type Animal, même si elle pointe vers un objet de type Chien.");
        System.out.println("Le type de la référence (Animal) détermine les méthodes qui peuvent être appelées sur cette référence. Puisque aboyer n'est pas une méthode définie dans la classe Animal, nous ne pouvons pas l'appeler sur une référence de type Animal. Animal est la classe mère héritée par la classe Chien qui contient la méthode aboyer() ; c'est pourquoi l'instruction achien.aboyer() ne poura pas marché.");
        

        System.out.println();
    }
    
}
