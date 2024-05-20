package Exercice3;
import java.util.ArrayList;
import java.util.List;
class Personnel {
    private List<Employe> employes;

    public Personnel() {
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    public double calculerSommeSalaires() {
        double somme = 0;
        for (Employe e : employes) {
            somme += e.calculerSalaire();
        }
        return somme;
    }

    public void afficherPersonnel() {
        for (Employe e : employes) {
            e.afficherCaracteristiques();
        }
    }
}
