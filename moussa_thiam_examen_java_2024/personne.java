
public class personne {
    public static void main(string[]args) {
        
        
//A. declarez une classe personne avec les attributs prives 
       private String numeroTelephone;
       private String prenom;
       private String nom;
       private double surfaceOccupee;
       
       //. ajout d'un constructeur qui permet d'initialiser une personne
       public Personne(String numeroTelephone, String prenom, String nom) {
           this.numeroTelephone = numeroTelephone;
           this.prenom = prenom;
           this.nom = nom;
           this.surfaceOccupee = 0.0; 
       }
   
    }
}
