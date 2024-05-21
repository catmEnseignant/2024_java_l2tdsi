package exercice2;

public class TestAnimaux
{
    public static void main (String[] args)
    {
        // Création d'un animal, un chat et un chien.
        Animal animal = new Animal();
        Chat chat = new Chat ();
        Chien chien = new Chien() ;

        // Affichage des trois animaux (toString)
        System.out.println(animal);
        System.out.println (chat);
        System.out.println(chien) ;

        // Affichage des cris des animaux
        System.out.println(animal.cri());
        System.out.println(chat.cri());
        System.out.println(chien.cri()) ;
        System.out.println(chien.aboyer());

        //On considère le chat et le chien comme étant des animaux
        Animal achat = chat;
        Animal achien = chien;
        System.out.println(achat);
        System.out.println(achien);

        // Tentative d'appel de la méthode aboyer sur achien
        // System.out.println(achien.aboyer());

        /*
            chien.cri() retourne une chaîne vide (car la méthode cri n'a pas été redéfinie dans Chien).
            chien.aboyer() retourne "Haw haw !".
            Polymorphisme et conversion de type :

            achat et achien sont des références de type Animal, mais pointent respectivement vers un objet de type Chat et Chien.
            Lorsqu'on appelle System.out.println(achat) et System.out.println(achien), la méthode toString appropriée pour Chat et
            Chien est appelée grâce au polymorphisme.

            Tentative d'appel de la méthode aboyer() sur une référence de type Animal :
            La ligne System.out.println(achien.aboyer()); est commentée car elle ne fonctionnera pas.
            La méthode aboyer() n'existe pas dans la classe Animal, donc l'appel à aboyer() sur une référence de type Animal(même si elle pointe
            vers un objet de type Chien) provoque une erreur de compilation.
        */
    }
}




