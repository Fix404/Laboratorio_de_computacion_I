import java.util.*;
public class TP5 {
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);

                // Consigna 1 //
                System.out.println("Ingrese un número entero para saber si es par o impar: ");
                int number=sc.nextInt();

                if (number%2==0){
                        System.out.println("El número ingresado es par");
                }else{
                        System.out.println("El número ingresado es impar");
                }

                // Conisgna 2 //
                System.out.println("Ingrese un número entero para saber si es múltiplo de diez: ");
                int number_2=sc.nextInt();

                if (number_2%10==0){
                        System.out.println("El número ingresado es múltiplo de diez");
                }else{
                        System.out.println("El número ingresado no es múltiplo de diez");
                }

                // Consigna 3 //
                System.out.println("Ingrese una sola letra: ");
                char letter=sc.next().charAt(0);

                if (letter >= 65 && letter <= 90) {
                        System.out.println("La letra está en mayúscula");

                }else{
                        System.out.println("La letra no está en mayúscula");
                }

                // Consigna 4 //
                System.out.println("Ingrese el primer número entero: ");
                int number_3=sc.nextInt();
                System.out.println("Ingrese el segundo número entero: ");
                int number_4=sc.nextInt();

                if (number_3 == number_4){
                        System.out.println("Los números ingresados son iguales");
                }else{
                        System.out.println("Los números ingresados no son iguales");
                }

                // Consigna 5 //
                System.out.println("Introduzca un número entero: ");
                int number_5=sc.nextInt();
                System.out.println("Introduzca un segundo número entero: ");
                int number_6=sc.nextInt();

                if (number_5 > number_6){
                        System.out.println("El número "+number_5+" es mayor que "+number_6);
                }else if (number_5 < number_6){
                        System.out.println("El número "+number_6+" es mayor que "+number_5);
                }else{
                        System.out.println("Los números son iguales");
                }

                // Consigna 6 //
                System.out.println("Ingrese un número entero: ");
                int number_7=sc.nextInt();
                System.out.println("Ingrese otro número entero: ");
                int number_8=sc.nextInt();

                if (number_7%10==number_8%10){
                        System.out.println("Los números tienen la misma última cifra");
                }else{
                        System.out.println("Los números no poseen la misma última cifra");
                }

                // Consigna 7 //
                System.out.println("Ingrese un número entero: ");
                int number_9=sc.nextInt();

                if (number_9%3==0 && number_9%5==0){
                        System.out.println("El número ingresado es múltiplo de tres y de cinco");
                }else{
                        System.out.println("El número ingresado no es múltiplo de tres y cinco a la vez");
                }

                // Consigna 8 //
                System.out.println("Ingrese un número entero: ");
                int number_10=sc.nextInt();

                if (number_10%2==0 || number_10%3==0){
                        System.out.println("El número ingresado es múltiplo de dos o de tres");
                }else{
                        System.out.println("El número ingresado no es múltiplo de dos ni de tres");
                }

                // Consigna 9 //
                System.out.println("Ingrese un único caracter: ");
                char letter_2=sc.next().charAt(0);
                System.out.println("Ingrese un único caracter por segunda vez: ");
                char letter_3=sc.next().charAt(0);

                if (letter_2==letter_3){
                        System.out.println("Los caracteres ingresados son iguales");
                }else{
                        System.out.println("Los caracteres ingresados no son iguales");
                }

                // Consigna 10 //
                System.out.println("Ingrese una única letra: ");
                char letter_4=sc.next().charAt(0);
                System.out.println("Ingrese una única letra por segunda vez: ");
                char letter_5=sc.next().charAt(0);

                if ((letter_4 >= 97 && letter_5 >= 97) && (letter_4 <= 122 && letter_5 <= 122)){
                        System.out.println("Las letras ingresadas están en minúsculas");
                }else{
                        System.out.println("Los letras ingresadas no están en minúsculas al mismo tiempo");
                }

                // Consigna 11 //
                System.out.println("Ingrese un único caracter: ");
                char letter_6=sc.next().charAt(0);

                if (letter_6 >= 48 && letter_6 <= 57){
                        System.out.println("El caracter ingresado es algún número del 0 al 9");
                }else{
                        System.out.println("El caracter ingresado no es un número entre 0 y 9");
                }

                // Consigna 12 //
                System.out.println("Ingrese un número: ");
                double number_11=sc.nextDouble();
                System.out.println("Ingrese un segundo número: ");
                double number_12=sc.nextDouble();

                if (number_12 != 0) {
                        System.out.println("La división de "+number_11+" por "+number_12+" es igual a "+(number_11/number_12));
                }else{
                        System.out.println("El número divisor es cero, no se puede resolver la división");
                }

                // Consigna 13 //
                System.out.println("Ingrese un año para saber si es bisiesto: ");
                int anno=sc.nextInt();

                if ((anno%4 == 0 && anno%100 != 0) || (anno%400 == 0)){
                        System.out.println("El año ingresado es bisiesto");
                }else{
                        System.out.println("El año ingresado no es bisiesto");
                }

                // Consigna 14 //
                System.out.println("Ingrese un número entero de tres cifras: ");
                int number_13=sc.nextInt();

                if (number_13 > 99 && number_13 < 1000){
                        if (number_13%10 == number_13/100){
                                System.out.println("El número ingresado es capicúa.");
                        }else{
                                System.out.println("El número ingresado no es capicúa.");
                        }
                }else{
                        System.out.println("EL número ingresado no posee tres dígitos");
                }

                // Consigna 15 //
                System.out.println("Para verificar el horario, ingrese la cantidad de horas: ");
                int H=sc.nextInt();
                System.out.println("Ingrese la cantidad de minutos: ");
                int M=sc.nextInt();
                System.out.println("Ingrese la cantidad de segundos: ");
                int S=sc.nextInt();

                if ((H <= 23 && H >= 0) && (M < 60 && M >= 0) && (S < 60 && S > 0)){
                        System.out.println("El horario ingresado "+H+":"+M+":"+S+" es válido");
                }else{
                        System.out.println("El horario ingresado no es válido");
                }

                // Consigna 16 //
                System.out.println("Ingrese un mes del año: ");
                int month=sc.nextInt();

                if (month <13 && month > 0){
                        if (month == 4 || month == 6 || month == 9 || month == 11){
                                System.out.println("El mes ingresado tiene treinta y un días");
                        }else if (month == 2){
                                System.out.println("El mes ingresado tiene 28 días");
                        }else{
                                System.out.println("El mes ingresado tiene treinta días");
                        }
                }else{
                        System.out.println("El número ingresado no corresponde a un mes válido ");
                }

                // Consigna 17 //
                System.out.println("Ingrese una calificación válida: ");
                double grade=sc.nextDouble();

                if (grade > 0 && grade <11){
                        if (grade < 5){
                                System.out.println("Insuficiente");
                        }else if (grade < 6){
                                System.out.println("Suficiente");
                        }else if (grade < 7){
                                System.out.println("Bien");
                        }else if (grade < 9){
                                System.out.println("Notable");
                        }else if (grade <= 10){
                                System.out.println("Sobresaliente");
                        }
                }

                // Consigna 18 //
                int count=1;

                while (count <= 100){
                        System.out.println(count+" ");
                        count+=1;
                }
                System.out.println("Ejecución finalizada");

                // Consigna 19 //
                int count_2=1;

                do {System.out.println(count_2+" ");
                        count_2+=1;
                }while(count_2 <= 100);
                System.out.println("Ejecución finalizada");

                // Consigna 20 //
                int i;

                for (i = 1; i <= 100; i++){
                        System.out.println(i+" ");
                }
                System.out.println("Ejecución finalizada");

                // Consigna 21 //
                int count_3=100;

                while (count_3 >= 1){
                        System.out.println(count_3+" ");
                        count_3-=1;
                }
                System.out.println("Ejecución finalizada");

                // Consigna 22 //
                int count_4=100;

                do {System.out.println(count_4+" ");
                        count_4-=1;
                }while(count_4 >= 1);
                System.out.println("Ejecución finalizada");

                // Consigna 23 //
                int j;

                for (j = 100; j >= 1; j--){
                        System.out.println(j+" ");
                }
                System.out.println("Ejecución finalizada");

                // Consigna 24 //
                /// Solución for ///
                System.out.println("Ingrese un número entero: ");
                int number_14=sc.nextInt(), k;

                for (k = 1; k <= number_14; k++){
                        System.out.println(k+" ");
                }
                System.out.println("Ejecución finalizada");

                /// Solución while ///
                int count_5=1;

                while (count_5 <= number_14){
                        System.out.println(count_5+" ");
                        count_5+=1;
                }
                System.out.println("Ejecución finalizada");

                /// Solución do..while ///
                int count_6=1;

                do {System.out.println(count_6+" ");
                        count_6+=1;
                }while(count_6 <= number_14);
                System.out.println("Ejecución finalizada");

                // Consigna 25 //
                /// Solución for ///
                System.out.println("Ingrese un número entero: ");
                int number_15=sc.nextInt(), l;

                for (l = number_15; l >= 1 ; l--){
                        System.out.println(l+" ");
                }
                System.out.println("Ejecución finalizada");

                /// Solución while ///
                int count_7=number_15;

                while (count_7 >= 1){
                        System.out.println(count_7+" ");
                        count_7-=1;
                }
                System.out.println("Ejecución finalizada");

                /// Solución do..while ///
                int count_8=number_15;

                do {System.out.println(count_8+" ");
                        count_8-=1;
                }while(count_8 >= 1);
                System.out.println("Ejecución finalizada");

                // Consigna 26 //
                /// Solución do..while ///

                int number_16, number_17, major, minor, m ;

                while (true) {
                        System.out.println("Ingrese un número entero: ");
                        number_16=sc.nextInt();
                        System.out.println("Ingrese un segundo número entero: ");
                        number_17=sc.nextInt();

                        if (number_16 != number_17){
                                if (number_16 > number_17){
                                        major=number_16;
                                        minor=number_17;
                                }else{
                                        major=number_17;
                                        minor=number_16;
                                }

                                for (m=minor; m <= major; m++){
                                        System.out.println(m+" ");
                                }

                                break;
                        }else{
                                System.out.println("No es posible operar con números enteros iguales. Inténtelo de nuevo");
                        }
                }
                System.out.println("Ejecución finalizada");

                // Consigna 27 //

                while (true) {
                        System.out.println("Ingrese un número entero: ");
                        int A = sc.nextInt();
                        System.out.println("Ingrese un segundo número entero: ");
                        int B = sc.nextInt(), n;

                        if (A < B){
                                for (n=A; n <= B; n++){
                                        if (n%2 == 0){
                                                System.out.println(n+" ");
                                        }
                                }
                                break;
                        }else{
                                System.out.println("El primer número no es menor al segundo. Inténtelo nuevamente");
                        }
                }
                System.out.println("Ejecución finalizada");

                // Consigna 28 //

                while (true){
                        System.out.println("Ingrese un número entero positivo: ");
                        int N = sc.nextInt();
                        System.out.println("Ingrese un segundo número entero positivo: ");
                        int M_1 = sc.nextInt(), o;

                        if ((N < M_1) && (N > 0)){
                                for (o = 1; o <= M_1; o++){
                                        if (o%N == 0){
                                                System.out.println(o+" ");
                                        }
                                }
                                break;
                        }else{
                                System.out.println("Los números ingresados no son válidos. Inténtelo de nuevo");
                        }
                }
                System.out.println("Ejecución finalizada");

                // Consigna 29 //

                while (true){
                        System.out.println("Ingrese una distancia en millas o bien cero para terminar: ");
                        float miles=sc.nextFloat();
                        double kilom;

                        if (miles != 0){
                                kilom=(miles*1.6093);
                                System.out.println("La distancia en kilómetros es: ");
                                System.out.printf("%.2f", kilom);
                                System.out.println("---");
                        }else{
                                break;
                        }
                }
                System.out.println("Ejecución finalizada");

                // Fin TP 5 //
        }
}