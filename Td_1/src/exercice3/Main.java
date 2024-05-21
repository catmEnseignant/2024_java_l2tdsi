package exercice3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Chien();
        Animal animal2 = new Chat();
        Chien chien = new Chien();

        System.out.println(chien.aboyer());
        System.out.println(animal.toString());
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());
        System.out.println(animal2.cri());

        Animal achat = animal2;
        Animal achien = chien;

        System.out.println(achat);
        System.out.println(achien);
    }
}
// oui ca fonctionne car la methode aboyer est definie dans la classe chien