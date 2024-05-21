package Exercice2;

public class TestAnimaux {
    public static void main(String[] args) {
        //Creation d'un animal, un chat et un chien.
        Animal animal = new Animal();
        Chat chat = new Chat();
        Chien chien = new Chien();
        
        //Affichage des trois animaux (toString) 
        System.out.println(animal);
        System.out.println(chat);
        System.out.println(chien);
        
        // Affichage des cris des animaux
        System.out.println(animal.cri());
        System.out.println(chat.cri());
        System.out.println(chien.cri());
        System.out.println(chien.aboyer());

        // On considere le chat et chien et le chien comme etant des animaux
        Animal achat = chat;
        Animal achien = chien;

        System.out.println(chat);
        System.out.println(chien);


         

    }
    
}



/*On remarque que Les classes Chat et Chien héritent de la classe Animal.
 Cela signifie qu'elles bénéficient des propriétés et méthodes définies dans la classe Animal,
  tout en pouvant les redéfinir pour un comportement spécifique.
  raison pour la quelle System.out.println(chien.cri()); // affiche une chaîne vide ("")  (hérite de la méthode cri() d'Animal) */




  /*L'instruction System.out.println(chien.aboyer()); fonctionne uniquement pour les instances de la classe Chien car elle appelle une méthode spécifique à cette classe.
Pour les instances d'autres classes, cette instruction déclenchera une exception car la méthode aboyer() n'est pas définie.
Autrement dit La méthode aboyer() est spécifique à la classe Chien. Elle n'est accessible qu'aux instances de Chien et n'est pas disponible aux autres classes.*/
