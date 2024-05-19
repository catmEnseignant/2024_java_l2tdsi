package exercice3;

import java.util.ArrayList;
import java.util.List;

public class Responsable extends Employe {
    private List<Employe> inferieurs;

    public Responsable(String nom, String matricule, int indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.inferieurs = new ArrayList<>();
    }

    public void ajouterInferieur(Employe e) {
        inferieurs.add(e);
    }

    public void afficherInferieursDirects() {
        for (Employe e : inferieurs) {
            e.afficherCaracteristiques();
        }
    }

    public void afficherTousInferieurs() {
        for (Employe e : inferieurs) {
            e.afficherCaracteristiques();
            if (e instanceof Responsable) {
                ((Responsable) e).afficherTousInferieurs();
            }
        }
    }
}
