import java.util.ArrayList;
import java.util.List;

public class Responsable extends Employe {
    private List<Employe> inferieursDirects;

    public Responsable(String nom, String matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.inferieursDirects = new ArrayList<>();
    }

    public void ajouterInferieur(Employe employe) {
        inferieursDirects.add(employe);
    }

    public void afficherInferieursDirects() {
        System.out.println("Inférieurs directs de " + this.nom + ":");
        for (Employe e : inferieursDirects) {
            e.afficherCaracteristiques();
        }
    }

    public void afficherInferieursIndirects() {
        System.out.println("Inférieurs directs ou indirects de " + this.nom + ":");
        afficherInferieursRecursivement(this);
    }

    private void afficherInferieursRecursivement(Responsable responsable) {
        for (Employe e : responsable.inferieursDirects) {
            e.afficherCaracteristiques();
            if (e instanceof Responsable) {
                afficherInferieursRecursivement((Responsable) e);
            }
        }
    }
}
