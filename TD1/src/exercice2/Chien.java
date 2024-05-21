package exercice2;

public class Chien extends Animal{
    public String aboyer() {
        return "Haw haw !";
    }

    @Override
    public String toString() {
        return "Je suis un chien !";
    }
}
