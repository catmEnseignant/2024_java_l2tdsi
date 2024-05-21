package exo4;
import java.util.ArrayList;
import java.util.List;

public class Personnel {
    private List<Employe> employes;

    public Personnel() {
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public double calculerSommeSalaires() {
        double somme = 0.0;
        for (Employe employe : employes) {
            somme += employe.calculerSalaire();
        }
        return somme;
    }
}
