package exercice3;

public class TestAnimaux {
    public static void main(String[] args) {
        Animal unAnimal = new Animal();
        Animal unChat = new Chat();
        Animal unChien = new Chien();

        System.out.println(unAnimal.toString());
        System.out.println(unChat.toString());
        System.out.println(unChat.cri());
        System.out.println(unChien.toString());

        // Ajout de l'instruction pour appeler aboyer()
        Chien chien = (Chien) unChien;
        System.out.println(chien.aboyer());//En ajoutant directement System.out.println(unChien.aboyer()); sans casting, le code ne fonctionnera pas car la méthode aboyer() n'est pas définie dans la classe Animal. Pour appeler aboyer(), vous devez effectuer un casting explicite vers la classe Chien, car unChien est en réalité une instance de Chien
    }
}

