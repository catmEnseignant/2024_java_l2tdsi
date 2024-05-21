package exercice2;

public class TestAnimaux {
    public static void main(String[] args) {

        // Création d’un animal, un chat et un chien.
        Animal animal = new Animal();
        Chat chat = new Chat();
        Chien chien = new Chien();

        // Affichage des trois animaux (toString)
        System.out.println(animal);
        System.out.println(chat);
        System.out.println(chien);

        // Affichage des cris des animaux
        System.out.println(animal.cri());
        System.out.println(chat.cri());
        System.out.println(chien.cri());
        System.out.println(chien.aboyer());

        // On considère le chat et le chien comme étant des animaux
        Animal achat = chat;
        Animal achien = chien;

        System.out.println(achat);
        System.out.println(achien);

        // Ajout de l'instruction System.out.println(achien.aboyer);
        /*
        if (achien instanceof Chien)
        {
            System.out.println((Chien) achien.aboyer());
        }
        else
        {
            System.out.println("achien n'est pas une instance de chien.");
        }
        */


        /*
            Cela ne marche pas Car achien est declaré comme animal donc n'est pas une instance de Chien et vu que
            chien est un animal on peut l'affecter à chien mais achien ne pourra pas hériter des methode
            de Chien mais de animal.
            Il pourra utiliser les methodes de Chien lorsqu'on fera un casting explicite.
        */
    }
}