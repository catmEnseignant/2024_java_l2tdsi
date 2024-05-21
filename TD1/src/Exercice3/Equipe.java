
package Exercice3;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private final List<Employe> employes;

    public Equipe() {
        this.employes = new ArrayList<>();
    }

    public void addEmployee(Employe employe) {
        employes.add(employe);
    }

    public float calculateTotalSalary() {
        float totalSalary = 0.0f;
        for (Employe employe : employes) {
            totalSalary += employe.calculateSalary();
        }
        return totalSalary;
    }

}