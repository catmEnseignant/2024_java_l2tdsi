/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;

public class TestAnimaux {
    public static void main(String[] args) {
        // Creation d'un animal, un chat et un chien
        Animal animal = new Animal();
        Chat chat = new Chat();
        Chien chien = new Chien();

        // Affichage des trois animaux (toString)
        System.out.println(animal);
        System.out.println(chat);
        System.out.println(chien);
        
        // Affichage des cris des animaux
        System.out.println(animal.Cri());
        System.out.println(chat.Cri());
        System.out.println(chien.Aboyer()); 

        // REMARQUE
        //Nous remarquons que la methode aboyer marche correctement meme si elle n'est pas definit dans la classe Animal

        //on considere le chat et le chien comme etant des animaux
        Animal achat = chat ;
        Animal achien = chien ;
        
        System.out.println(achat);
        System.out.println(achien);

    //Ajoutons

    // System.out.println(achien.Aboyer());
    }
    //si nous ajoutons Systeme.out.println(achien.Aboyer()) ;cele affichera une erreur
    //Explication
    //La variable achien est déclarée de type Animal, ce qui signifie que le compilateur n'a pas connaissance des méthodes spécifiques à la classe Chien, telles que Aboyer(). 
    //La classe Animal ne définit pas cette méthode. Donc, lorsque vous essayez d'appeler achien.aboyer(), le compilateur générera une erreur car il ne peut pas trouver la méthode Aboyer() dans la classe Animal.
}

