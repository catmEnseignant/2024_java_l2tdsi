package exo2;

public class TestAnimaux {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Chat chat = new Chat();
        Chien chien = new Chien();
        
        System.out.println(animal);
        System.out.println(chat);
        System.out.println(chien);
        
        System.out.println(animal.cri());
        System.out.println(chat.cri());
        // Cela ne marche pas parcequ'il n'y a pas de method cri dans chien
      //  System.out.println(chien.cri());
        chien.aboyer(); 

        Animal achat = chat;
        Animal achien = chien;
        
        System.out.println(achat); 
        System.out.println(achien); 
        
        //  l'objet achien est de type Animal, et la classe Animal ne possède pas la méthode aboyer.
      //  System.out.println(achien.aboyer());
        
    }
}
