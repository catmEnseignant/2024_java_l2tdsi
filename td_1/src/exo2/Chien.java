package exo2;

public class Chien extends Animal {
    @Override
    public String toString(){
        return "Je suis un chien";
    }
    

    public void aboyer() {
        System.out.println("haw haw");
    }
}
