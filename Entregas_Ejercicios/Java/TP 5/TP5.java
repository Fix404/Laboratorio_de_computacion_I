import java.util.*;
public class TP5 {
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);

                // Consigna 1 //
                System.out.print("Ingrese un número entero para saber si es par o impar: ");
                int number=sc.nextInt();

                if (number%2==0){
                        System.out.print("El número ingresado es par");
                }else{
                        System.out.print("El número ingresado es impar");
                }

                // Conisgna 2 //
                System.out.print("Ingrese un número entero para saber si es múltiplo de diez: ");
                int number_2=sc.nextInt();

                if (number_2%10==0){
                        System.out.print("El número ingresado es múltiplo de diez");
                }else{
                        System.out.print("El número ingresado no es múltiplo de diez");
                }

                // Consigna 3 //
                System.out.print("Ingrese una sola letra: ");
                char letter=sc.next().charAt(0);

                if (letter >= 65 && letter <= 90) {
                        System.out.print("La letra está en mayúscula");

                }else{
                        System.out.print("La letra no está en mayúscula");
                }

                // Consigna 4 //
                System.out.print("Ingrese el primer número entero: ");
                int number_3=sc.nextInt();
                System.out.print("Ingrese el segundo número entero: ");
                int number_4=sc.nextInt();

                if (number_3 == number_4){
                        System.out.print("Los números ingresados son iguales");
                }else{
                        System.out.print("Los números ingresados no son iguales");
                }

                // Consigna 5 //
                System.out.print("Introduzca un número entero: ");
                int number_5=sc.nextInt();
                System.out.print("Introduzca un segundo número entero: ");
                int number_6=sc.nextInt();

                if (number_5 > number_6){
                        System.out.print("El número "+number_5+" es mayor que "+number_6);
                }else if (number_5 < number_6){
                        System.out.print("El número "+number_6+" es mayor que "+number_5);
                }else{
                        System.out.print("Los números son iguales");
                }

                // Consigna 6 //
                System.out.print("Ingrese un número entero: ");
                int number_7=sc.nextInt();
                System.out.print("Ingrese otro número entero: ");
                int number_8=sc.nextInt();

                if (number_7%10==number_8%10){
                        System.out.print("Los números tienen la misma última cifra");
                }else{
                        System.out.print("Los números no poseen la misma última cifra");
                }

                // Consigna 7 //
                System.out.print("Ingrese un número entero: ");
                int number_9=sc.nextInt();

                if (number_9%3==0 && number_9%5==0){
                        System.out.print("El número ingresado es múltiplo de tres y de cinco");
                }else{
                        System.out.print("El número ingresado no es múltiplo de tres y cinco a la vez");
                }

                // Consigna 8 //
                System.out.print("Ingrese un número entero: ");
                int number_10=sc.nextInt();

                if (number_10%2==0 || number_10%3==0){
                        System.out.print("El número ingresado es múltiplo de dos o de tres");
                }else{
                        System.out.print("El número ingresado no es múltiplo de dos ni de tres");
                }

                // Consigna 9 //
                System.out.print("Ingrese un único caracter: ");
                char letter_2=sc.next().charAt(0);
                System.out.print("Ingrese un único caracter por segunda vez: ");
                char letter_3=sc.next().charAt(0);

                if (letter_2==letter_3){
                        System.out.print("Los caracteres ingresados son iguales");
                }else{
                        System.out.print("Los caracteres ingresados no son iguales");
                }

                // Consigna 10 //
                System.out.print("Ingrese una única letra: ");
                char letter_4=sc.next().charAt(0);
                System.out.print("Ingrese una única letra por segunda vez: ");
                char letter_5=sc.next().charAt(0);

                if ((letter_4 >= 97 && letter_5 >= 97) && (letter_4 <= 122 && letter_5 <= 122)){
                        System.out.print("Los números ingresados están en minúsculas");
                }else{
                        System.out.print("Los números ingresados no están en minúsculas al mismo tiempo");
                }

                //Consigna 11 //
        }
}