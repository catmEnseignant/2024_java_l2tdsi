public class TestAnimaux {
    public static void main(String[] args) {
        Animal unAnimal = new Animal();
        Animal unChat = new Chat();
        Animal unChien = new Chien();

        System.out.println(unAnimal.toString());
        System.out.println(unAnimal.cri());

        System.out.println(unChat.toString());
        System.out.println(unChat.cri());

        System.out.println(unChien.toString());
        System.out.println(unChien.cri());

        // Tentative d'appel à la méthode aboyer
        // System.out.println(unChien.aboyer()); // Cette ligne provoque une erreur de compilation
    }
}
 