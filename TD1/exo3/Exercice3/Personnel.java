
package Exercice3;

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

    public double calculerTotalSalaires() {
        double total = 0.0;
        for (Employe e : employes) {
            total += e.calculerSalaire();
        }
        return total;
    }
}
