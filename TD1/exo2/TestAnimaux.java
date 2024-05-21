// TD/exercice2/TestAnimaux.java
import Exercice2.*;

public class TestAnimaux {
    public static void main(String[] args) {
        // Création d'un animal, un chat et un chien
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

        //REPONSE AUX QUESTIONS
        /*
         1. Que remarquez-vous ?

         Lorsque nous exécutons le programme, nous observons les comportements suivants :

Les méthodes toString() des objets animal, chat, et chien retournent les chaînes spécifiques définies dans leurs classes respectives :

-animal.toString() retourne "Je suis un animal".
-chat.toString() retourne "Je suis un chat !".
-chien.toString() retourne "Je suis un chien !".
Les méthodes cri() des objets animal, chat, et chien retournent les chaînes définies dans leurs classes respectives :

animal.cri() retourne une chaîne vide "".
chat.cri() retourne "Miaaaw !".
chien.cri() retourne "Haw haw !" car chien.cri() appelle chien.aboyer().
Lorsqu'on considère achat (un Chat) et achien (un Chien) comme des Animal :

achat.toString() retourne "Je suis un chat !".
achien.toString() retourne "Je suis un chien !".
Les méthodes redéfinies toString() et cri() des sous-classes sont appelées, démontrant le polymorphisme.


2)Essayez d’ajouter l’instrucDon System.out.println(achien.aboyer()); à la 
fin du code. Est-ce que ça foncDonne ? Pourquoi ?

Si nous ajoutons l'instruction System.out.println(achien.aboyer()); à la fin du code, cela ne fonctionne pas.
La ligne provoquera une erreur de compilation car achien est déclaré comme un Animal, et la classe Animal ne possède pas de méthode aboyer(). Même si achien est en réalité un objet de type Chien, le type de référence (Animal) détermine les méthodes qui peuvent être appelées sur cet objet. En Java, le compilateur vérifie les méthodes disponibles en fonction du type de la référence et non du type réel de l'objet.

 le polymorphisme permet d'utiliser les méthodes redéfinies, mais l'appel de méthodes spécifiques à une sous-classe nécessite de caster l'objet au type approprié.
         */
    }
}
