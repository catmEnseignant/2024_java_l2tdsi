package Exercice2;

class Chien extends Animal {
    @Override
    public String toString() {
        return "Je suis un chien !"; 
    }

    String aboyer() {
        return "Haw haw !"; 
    }
}
