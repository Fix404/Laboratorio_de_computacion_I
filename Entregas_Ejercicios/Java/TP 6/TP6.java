import java.util.Scanner;
public class TP6 {
    public static void main(String[] args){
        /* TP 6 Arreglos y matrices */
        Scanner sc=new Scanner(System.in);

        // Consigna 1 //
        float [] numbers= new float[10];
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Ingrese el número entero de la posición "+i+": ");
            numbers[i]=sc.nextInt();
        }

        float negative_sum=0, negative_counter=0, positive_sum=0, positive_counter=0;
        float negative_average, positive_average;

        for (int j=0; j < numbers.length; j++){
            if (numbers[j] < 0) {
                negative_sum=negative_sum+numbers[j];
                negative_counter++;
            } else if (numbers[j] > 0) {
                positive_sum=positive_sum+numbers[j];
                positive_counter++;
            }
        }

        if (negative_counter == 0){
            System.out.println("No se ingresaron números negativos");
        } else if (positive_counter == 0) {
            System.out.println("No se ingresaron números positivos");
        }

        if (negative_counter != 0){
            negative_average=negative_sum/negative_counter;
            System.out.println("El promedio de los números negativos ingresados es de "+negative_average);
        }

        if (positive_counter != 0) {
            positive_average=positive_sum/positive_counter;
            System.out.println("El promedio de los números positivos ingresados es de "+positive_average);
        }

        // Consigna 2 //
        float [] numbers_2= new float[10];
        float even_position_sum=0, even_position_average=0;
        int even_position_counter=0;

        for (int i=0; i < numbers_2.length; i++){
            System.out.println("Ingrese el número entero correspondiente a la posición "+i+": ");
            numbers_2[i]=sc.nextInt();

            if (i%2 == 0){
                even_position_sum=even_position_sum+numbers_2[i];
                ++even_position_counter;
            }
        }
        even_position_average=even_position_sum/even_position_counter;
        System.out.println("El promedio de los números ingresados que se encuentran en las posiciones pares es de "+even_position_average);

        // Consigna 3 //
        int n;

        System.out.println("A continuación ingrese el número de alumnos en la clase: ");
        n=sc.nextInt();

        double [] studentsGrades= new double [n];
        double gradesSum=0, classAverage=0;

        for (int i=0; i < n; i++){
            System.out.println("Ingrese el número entero de la posición "+i+": ");
            studentsGrades[i]=sc.nextDouble();
            gradesSum=gradesSum+studentsGrades[i];
        }
        classAverage=gradesSum/n;

        for (int i=0; i < studentsGrades.length; i++){
            if (studentsGrades[i] > classAverage){
                System.out.println("El estudiante "+(i+1)+" posee una nota de "+studentsGrades[i]+ " superior al promedio de la clase que es de "+classAverage);
            }
        }

        // Consigna 4 //
        float [] evenArray=new float[20];
        float number_3;
        int n=0;

        do {
            System.out.println("Ingrese un número, si es par será almacenado hasta contar 20 elementos: ");
            number_3=sc.nextFloat();
            if (number_3%2=0){
                evenArray[n]=number_3;
                ++n;
            }
        } while (n<=20)
        System.out.println("Se han alcanzado los 20 números pares, estos son: "+evenArray);

        // Consigna 5 //
        double [] numbers_4=new double[10];
        double negative_sum=0, negative_counter=0, positive_sum=0, positive_counter=0;
        double negative_average, positive_average;

        for (int i=0; i < 10; ++i){
            System.out.println("Ingrese un número: ");
            numbers_4[i]=sc.nextDouble();

            if (numbers_4[i] < 0){
                negative_sum=negative_sum+numbers_4[i];
                ++negative_counter;
            }else{
                positive_sum=positive_sum+numbers_4[i];
                ++positive_counter;
            }
        }
        if (positive_counter == 0){
            System.out.println("No se ingresaron números positivos");
        }

        if (negative_counter == 0){
            System.out.println("No se ingresaron números negativos");
        }

        if (positive_counter != 0){
            positive_average=positive_sum/positive_counter;
            System.out.println("El promedio de los números positivos es "+positive_average);
        }

        if (negative_counter != 0){
            negative_average=negative_sum/negative_counter;
            System.out.println("El promedio de los números negativos es "+negative_average);
        }

        }
    }