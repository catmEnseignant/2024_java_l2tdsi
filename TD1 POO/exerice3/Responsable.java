import java.util.ArrayList;

public class Responsable extends Employe {
    private ArrayList<Employe> inferieurs;

    public Responsable(String nom, String matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.inferieurs = new ArrayList<>();
    }

    public void ajouterInferieur(Employe employe) {
        inferieurs.add(employe);
    }

    public void afficherInferieursDirects() {
        System.out.println("Inférieurs directs de " + getNom() + " :");
        for (Employe employe : inferieurs) {
            System.out.println(employe.getNom());
        }
    }

    public void afficherTousInferieurs() {
        System.out.println("Tous les inférieurs de " + getNom() + " :");
        afficherTousInferieursRecursively(this);
    }

    private void afficherTousInferieursRecursively(Responsable responsable) {
        for (Employe employe : responsable.inferieurs) {
            System.out.println(employe.getNom());
            if (employe instanceof Responsable) {
                afficherTousInferieursRecursively((Responsable) employe);
            }
        }
    }
}
