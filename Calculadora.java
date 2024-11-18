import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double numero1, numero2;
        double operación;
        double Suma, Resta, Multiplicación, División;
        System.out.println("¿Que operación matematica quieres realizar:1(Suma), 2(Resta), 3(Multiplicación), 4 (División)?");
        operación = sc.nextDouble();
        if (operación == 1) {
            System.out.println("Introduce dos numeros");
            numero1 = sc.nextDouble();
            numero2 = sc.nextDouble();
            Suma = numero1 + numero2;
            System.out.println("El resultado de la suma es " + Suma); 
        }

        if (operación == 2 ) {
            System.out.println("Introduce dos numeros");
            numero1 = sc.nextDouble();
            numero2 = sc.nextDouble();
            Resta = numero1 - numero2;
            System.out.println("El resultado de la resta es " + Resta);
        }

        if (operación == 3) {
            System.out.println("Introduce dos numeros");
            numero1 = sc.nextDouble();
            numero2 = sc.nextDouble();
            Multiplicación = numero1 * numero2;
            System.out.println("El resultado de la multiplicación es " + Multiplicación); 
        }

        if (operación == 4) {
            System.out.println("Introduce dos numeros");
            numero1 = sc.nextDouble();
            numero2 = sc.nextDouble();
            División = numero1 / numero2;
            System.out.println("El resultado de la división es " + División);
        }
        
        if (operación>4) {
            System.out.println("MATH ERROR");
            
        }


    }
}