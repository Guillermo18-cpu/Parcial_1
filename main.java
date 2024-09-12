import java.util.Scanner;
public class main  { 
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    double numero_1, numero_2;
    System.out.println("Digite el numero 1");
    numero_1= sc.nextDouble();
    System.out.println("Digite el numero 2");
    numero_2= sc.nextDouble();

    
    sub1(numero_1, numero_2);
    
    }   

    public static void sub1(double numero_1, double numero_2){ 

        if (numero_1 == 0 || numero_2 == 0) {
            System.out.println("Uno o ambos números son cero, no se puede determinar la multiplicación.");
        } else if (numero_1 % numero_2 == 0) {
            System.out.println(numero_1 + " es múltiplo de " + numero_2);
        } else if (numero_2 % numero_1 == 0) {
            System.out.println(numero_2 + " es múltiplo de " + numero_1);
        } else {
            System.out.println("Ninguno de los números es múltiplo del otro");
        }
    }
     
}
 
  
