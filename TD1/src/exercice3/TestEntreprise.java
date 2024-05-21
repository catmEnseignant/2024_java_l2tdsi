package exercice3;

public class TestEntreprise {
    public static void main(String[] args) {
        Employe.setValeurSalaire(2000);

        Employe employe1 = new Employe("Mamoudou", 101, 1.5);
        Employe employe2 = new Employe("Amina", 102, 2.0);
        Responsable responsable1 = new Responsable("Ibrahima", 201, 2.5);
        Commercial commercial1 = new Commercial("Ndiame", 301, 2.0);

        employe1.afficherCaracteristiques();
        System.out.println("Salaire d'employé: " + employe1.calculerSalaire());

        employe2.afficherCaracteristiques();
        System.out.println("Salaire d'employé: " + employe2.calculerSalaire());

        responsable1.ajouterInferieur(employe1);
        responsable1.ajouterInferieur(employe2);
        responsable1.ajouterInferieur(commercial1);
        responsable1.afficherInferieursDirects();

        commercial1.setVenteMois(5000);
        System.out.println("Salaire de commercial: " + commercial1.calculerSalaire());
    }
}
