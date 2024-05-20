package Exercice3;
import java.util.ArrayList;
import java.util.List;
class Responsable extends Employe {
    private List<Employe> inferieurs;

    public Responsable(String nom, int matricule, int indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.inferieurs = new ArrayList<>();
    }

    public void ajouterInferieur(Employe e) {
        inferieurs.add(e);
    }

    public void afficherInferieursDirects() {
        System.out.println("Inferieurs directs de " + getNom() + ":");
        for (Employe e : inferieurs) {
            System.out.println(" - " + e.getNom());
        }
    }

    public void afficherTousInferieurs() {
        System.out.println("Tous les inferieurs de " + getNom() + ":");
        afficherTousInferieursRec(this);
    }

    private void afficherTousInferieursRec(Responsable r) {
        for (Employe e : r.inferieurs) {
            System.out.println(" - " + e.getNom());
            if (e instanceof Responsable) {
                afficherTousInferieursRec((Responsable) e);
            }
        }
    }
}
