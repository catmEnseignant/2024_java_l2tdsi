public class TestAnimaux {
    public static void main(String[] args) {
        // Créez des instances des différentes classes et testez-les ici
        Animal animal = new Animal();
        Chat chat = new Chat();
        Chien chien = new Chien();

        Animal achat = chat;
        Animal achien = chien;
        
        System.out.println(animal.toString()); 
        System.out.println(chat.toString()); 
        System.out.println(chien.toString());
        
        System.out.println(animal.cri());
        System.out.println(chat.cri());  
        System.out.println(chien.aboyer());  

        System.out.println(achat.toString());
        System.out.println(achien.toString());

        System.out.println(achien.aboyer());
    }
}
/*L'erreur indique qu'on ne peut pas trouver la méthode aboyer() dans la classe Animal. 
Cela est du au fait que la référence achien est de type Animal, qui ne possède pas cette méthode. */
