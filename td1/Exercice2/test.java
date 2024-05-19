// Test.java
public class test {
      public static void main(String[] args) {
          animal animal = new animal();
          System.out.println(animal);
  
          chat chat = new chat();
          System.out.println(chat);
          System.out.println(chat.cri()); // "Miaaaw!"
  
          chien chien = new chien();
          System.out.println(chien);
          // System.out.println(chien.aboyer()); // Ne fonctionne pas
      }
  }
  