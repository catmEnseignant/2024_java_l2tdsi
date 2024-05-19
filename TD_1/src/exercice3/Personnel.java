package exercice3;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    private List<Employe> employes;

    public Personnel() {
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    public double calculerTotalSalaires() {
        double total = 0;
        for (Employe e : employes) {
            total += e.calculerSalaire();
        }
        return total;
    }
}
