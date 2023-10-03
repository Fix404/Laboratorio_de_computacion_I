import java.util.Scanner;
public class TP6 {
    public static void main(String[] args){
        /* TP 6 Arreglos y matrices */
        Scanner sc=new Scanner(System.in);

        // Consigna 1 //
        float [] numbers= new float[10];
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Ingrese el número entero de la posición "+i+": ");
            numbers[i]=sc.nextInt();git add .
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
    }
}