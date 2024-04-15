import java.util.Scanner;
public class ExamenL1TDSI_2022 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int nombre;
        do{
            System.out.println("veuillez saisir un nombre structement positif: ");
             nombre= scanner.nextInt();
        }while(nombre<0);
        int n=0;
        for(int i=2;i<=nombre-1;i++){
           if(nombre%i==0){
            n=n+1;
            System.out.println("les diviseurs sont: ",i);
           }
        }
        if(nombre<3 || n>=2){
            System.out.println(nombre+" n'est pas un nombrepremier ");
            System.out.println("les diviseur de "+nombre+" sont 1 ,:+i ");

        }else{
            System.out.println(nombre+" est un nombre premier ");
            System.out.println("les diviseur de "+nombre+" sont 1 et: "+nombre);

        }
        scanner.close();
    }
   
}
