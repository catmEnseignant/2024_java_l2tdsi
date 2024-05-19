package exercice2;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Chat();
        Animal a2 = new Chien();

        System.out.println(a1.cri());
        System.out.println(a2.cri());
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        Chien achien = new Chien();
        System.out.println(achien.aboyer());
    }
}
