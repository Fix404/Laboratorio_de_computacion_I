import java.util.Scanner;

public class Ejercicio_repaso_parcial {
    public static void main(String[] args){

        // Programa A //

        Scanner sc=new Scanner(System.in);

        // Declaración de variables //
        System.out.println("Ingrese un número entero: ");
        int number_1=sc.nextInt();
        System.out.println("Ingrese otro número entero: ");
        int number_2=sc.nextInt();

        // Condición lógica de verificación de última cifra //
        if (number_1%10==number_2%10){
            System.out.println("La última cifra de los números ingresados coincide");
        }else{
            System.out.println("La última cifra de los números ingresados no coincide");
        }

        // Programa B //

        // Declaración de variables //
        System.out.println("Ingrese un número entero: ");
        int number_3=sc.nextInt();

        // Condición lógica de tres cifras //
        if (number_3<1000 && number_3>99){

            // Condición lógica de capicúa //
            if (number_3%10==number_3/100){
                System.out.println("El número ingresado es capicúa");
            }else{
                System.out.println("El número ingresado no es capicúa");
            }
        }else{
            System.out.println("El número ingresado no posee tres cifras");
        }
    }
}