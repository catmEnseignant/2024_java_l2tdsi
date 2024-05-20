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

            //Ajoutons l'instruction:
           // System.out.println(achien.aboyer());

        /*
        Cela ne  fonctionne pas car:
            * La méthode cri() est redéfinie dans les classes Chat et Chien pour générer des sons distincts selon l'animal (miaulement pour un chat, aboiement pour un chien).
            Cela permet d'utiliser des objets de ces classes de manière interchangeable, la méthode cri() s'adaptant automatiquement à l'objet réel: polymorphisme.
            Les classes Chat et Chien héritent des attributs et des méthodes de la classe Animal, y compris la méthode toString().
            Elles peuvent ensuite redéfinir cette méthode pour fournir une description plus précise de chaque type d'animal.
            Les variables achat et achien sont déclarées de type Animal mais référencent des objets Chat et Chien respectivement.
            Lors de l'appel de toString(), la méthode appropriée de la classe correspondante (soit Chat soit Chien) est exécutée.
            Ajout de l'instruction System.out.println(achien.aboyer()); : Cette instruction affiche "Haw haw !" car achien est un objet Chien et que la classe Chien définit la méthode aboyer() pour retourner cette chaîne.
            Remarque importante : 
            La méthode aboyer() n'est pas accessible aux objets Animal ou Chat car elle est spécifique à la classe Chien.
           */
    
            
        }
    }
