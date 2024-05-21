package exercice3;
import java.util.ArrayList;
import java.util.List;

public class Responsable extends Employe {
    private List<Employe> inferieurs;

    public Responsable(String nom, int matricule, double indiceSalairial) {
        super(nom, matricule, indiceSalairial);
        inferieurs = new ArrayList<>();
    }

    public void ajouterInferieur(Employe employe) {
        inferieurs.add(employe);
    }

    public void afficherInferieursDirects() {
        System.out.println("Inférieurs directs de " + super.toString() + ":");
        for (Employe employe : inferieurs) {
            employe.afficherCaracteristiques();
        }
    }

    public void afficherTousInferieurs() {
        System.out.println("Tous les inférieurs de " + super.toString() + ":");
        for (Employe employe : inferieurs) {
            employe.afficherCaracteristiques();
            if (employe instanceof Responsable) {
                ((Responsable) employe).afficherTousInferieurs();
            }
        }
    }
}
