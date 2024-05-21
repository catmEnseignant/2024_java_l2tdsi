package exo3;

public class Chien extends Animal {
    public String aboyer() {
        return "haw haw";
    }

    @Override
    public String cri() {
        return "haw haw"; // Optionally, to have Chien respond with a different cry
    }

    @Override
    public String toString() {
        return "je suis un Chien";
    }
}
