import java.util.ArrayList;
import java.util.List;

public class Responsable extends Employe {
    private List<Employe> subordonnes;

    public Responsable(String nom, String matricule, int indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.subordonnes = new ArrayList<>();
    }

    public void ajouterSubordonne(Employe subordonne) {
        subordonnes.add(subordonne);
    }

    public void afficherInferieursDirects() {
        System.out.println("Subordonnés directs de " + getNom() + ":");
        for (Employe sub : subordonnes) {
            sub.afficherCaracteristiques();
        }
    }

    public void afficherInferieursIndirects() {
        System.out.println("Subordonnés directs et indirects de " + getNom() + ":");
        afficherInferieursIndirectsHelper(subordonnes);
    }

    private void afficherInferieursIndirectsHelper(List<Employe> subordonnes) {
        for (Employe sub : subordonnes) {
            sub.afficherCaracteristiques();
            if (sub instanceof Responsable) {
                ((Responsable) sub).afficherInferieursIndirectsHelper(((Responsable) sub).subordonnes);
            }
        }
    }
}
