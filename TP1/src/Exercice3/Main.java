
package Exercice3;

public class Main {
    public static void main(String[] args) {
        Amimal unchat = new Chat();
        System.out.println(unchat.Cri()); 
        System.out.println(unchat.toString()); 
       Amimal achien = new Chien();
        System.out.println(achien.Cri()); 
        System.out.println(achien.toString()); 
       
        System.out.println(((Chien) achien).aboyer()); 
    }
}
