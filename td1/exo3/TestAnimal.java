package exo3;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Chat chat = new Chat();
        Chien chien = new Chien();

        System.out.println(animal);
        System.out.println(chat);
        System.out.println(chien);

        System.out.println("Animal cri: " + animal.cri());
        System.out.println("Chat cri: " + chat.cri());
        System.out.println("Chien cri: " + chien.cri());
        System.out.println("Chien aboie: " + chien.aboyer());

        Animal achat = chat;
        Animal achien = chien;

        System.out.println("achat: " + achat);
        System.out.println("achien: " + achien);
    }
}
