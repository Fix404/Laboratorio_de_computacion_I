import java.util.Random;
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

        for (int k=0; k < numbers_2.length; k++){
            System.out.println("Ingrese el número entero correspondiente a la posición "+k+": ");
            numbers_2[k]=sc.nextInt();

            if (k%2 == 0){
                even_position_sum=even_position_sum+numbers_2[k];
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

        for (int q=0; q < n; q++){
            System.out.println("Ingrese el número entero de la posición "+q+": ");
            studentsGrades[q]=sc.nextDouble();
            gradesSum=gradesSum+studentsGrades[q];
        }
        classAverage=gradesSum/n;

        for (int r=0; r < studentsGrades.length; r++){
            if (studentsGrades[r] > classAverage){
                System.out.println("El estudiante "+(r+1)+" posee una nota de "+studentsGrades[r]+ " superior al promedio de la clase que es de "+classAverage);
            }
        }

        // Consigna 4 //

        float [] evenArray=new float[20];
        float number_3;
        int n_2=0;

        do {
            System.out.println("Ingrese un número, si es par será almacenado hasta contar 20 elementos: ");
            number_3=sc.nextFloat();
            if (number_3%2 == 0){
                evenArray[n]=number_3;
                n_2++;
            }
        } while (n_2<=20);
        System.out.println("Se han alcanzado los 20 números pares, estos son: "+evenArray);

        // Consigna 5 //

        int positive_counter_1=0, negative_counter_1=0, zero_counter_1=0;
        int [] numbers_4=new int[10];

        for (int s=0; s < 10; ++s){
            System.out.println("Ingrese un número entero: ");
            numbers_4[s]=sc.nextInt();

            if (numbers_4[s] > 0){
                ++positive_counter_1;
            }else if (numbers_4[s] < 0){
                ++negative_counter_1;
            }else{
                ++zero_counter_1;
            }
        }

        System.out.println("La cantidad de números positivos es de "+positive_counter_1+", la de negativos es "+negative_counter_1+" y la cantidad de ceros es "+zero_counter_1);

        // Consigna 6 //

        double [] numbers_5=new double[10];
        double negative_sum_2=0, negative_counter_2=0, positive_sum_2=0, positive_counter_2=0;
        double negative_average_2, positive_average_2;

        for (int t=0; t < 10; ++t){
            System.out.println("Ingrese un número: ");
            numbers_5[t]=sc.nextDouble();

            if (numbers_5[t] < 0){
                negative_sum_2=negative_sum_2+numbers_5[t];
                ++negative_counter_2;
            }else{
                positive_sum_2=positive_sum_2+numbers_5[t];
                ++positive_counter_2;
            }
        }
        if (positive_counter_2 == 0){
            System.out.println("No se ingresaron números positivos");
        }

        if (negative_counter_2 == 0){
            System.out.println("No se ingresaron números negativos");
        }

        if (positive_counter_2 != 0){
            positive_average_2=positive_sum_2/positive_counter_2;
            System.out.println("El promedio de los números positivos es "+positive_average_2);
        }

        if (negative_counter_2 != 0){
            negative_average_2=negative_sum_2/negative_counter_2;
            System.out.println("El promedio de los números negativos es "+negative_average_2);
        }

        // Consigna 7 //

        int N;

        System.out.println("Ingrese el número de personas a analizar: ");
        N=sc.nextInt();

        double [] heights=new double[N];
        double heightsSum=0, heightsAverage=0;
        int above_average_height_counter=0, below_average_height_counter=0;

        for (int l=0; l < N; ++l){
            System.out.println("Ingrese la altura del alumno "+(l+1)+": ");
            heights[l]=sc.nextDouble();
            heightsSum=heightsSum+heights[l];
        }
        heightsAverage=heightsSum/N;

        for (int m=0; m < N; ++m){
            if (heights[m] < heightsAverage){
                ++above_average_height_counter;
            } else if (heights[m] > heightsAverage){
                ++below_average_height_counter;
            }
        }
        System.out.println("Las personas con una altura superior al promedio de "+heightsAverage+" metros suman un total de "+above_average_height_counter+" y las personas por debajo del promedio son "+below_average_height_counter);

        // Consigna 8 //

        String [] employeeName=new String[5];
        double [] employeeSalary=new double[5];
        double highestPay=0;
        int highestSalaryPosition=0;

        for (int o=0; o < 5; ++o){
            System.out.println("Ingrese el nombre del empleado: ");
            employeeName[o]=sc.next();
            System.out.println("Ingrese el salario del empleado: ");
            employeeSalary[o]=sc.nextDouble();
        }
        highestPay=employeeSalary[0];

        for (int p=1; p < 5; ++p){
            if (employeeSalary[p] > highestPay){
                highestPay=employeeSalary[p];
                highestSalaryPosition=p;
            }
        }

        System.out.println("El empleado con el mayor salario es "+employeeName[highestSalaryPosition]+" con un sueldo de "+highestPay+" pesos.");

        // Consigna 9 //

        int amountOfRandomNumbers, lowerLimit, upperLimit;

        System.out.println("Ingrese la cantidad de números aleatorios a generar: ");
        amountOfRandomNumbers=sc.nextInt();

        System.out.println("Ingrese el límite inferior: ");
        lowerLimit=sc.nextInt();

        System.out.println("Ingrese el límite superior: ");
        upperLimit=sc.nextInt();

        int [] randomNumbersArrayPrincipal= new int[amountOfRandomNumbers];

        randomNumbersArrayPrincipal=randomNumberArray(lowerLimit, upperLimit, amountOfRandomNumbers);

        System.out.println("Los números aleatorios son: ");
        for (int u=0; u<amountOfRandomNumbers; ++u){
            System.out.print(randomNumbersArrayPrincipal[u]+", ");
        }
        System.out.println(" ");

        // Consigna 10 //
        /* Forma A) */

        int matrixRows, matrixColumns;

        System.out.println("Introduzca la cantidad de filas: ");
        matrixRows=sc.nextInt();
        System.out.println("Introduzca la cantidad de columnas: ");
        matrixColumns=sc.nextInt();

        int [][] A=new int[matrixRows][matrixColumns];
        int [][] B=new int[matrixRows][matrixColumns];
        int [][] C=new int[matrixRows][matrixColumns];

        System.out.println("Ingrese los valores de la matriz A: ");
        for (int v = 0; v < A.length; v++) {
            for (int w = 0; w < A[v].length; w++) {
                System.out.print("Elemento[" + v + "][" + w + "] = ");
                A[v][w] = sc.nextInt();
            }
        }

        System.out.println("Ingrese los valores de la matriz B: ");
        for (int x = 0; x < B.length; x++) {
            for (int y = 0; y < B[x].length; y++) {
                System.out.print("Elemento[" + x + "][" + y + "] = ");
                B[x][y] = sc.nextInt();
            }
        }

        for (int z = 0; z < A.length; z++) {
            for (int a = 0; a < A[z].length; a++) {
                C[z][a] = A[z][a] + B[z][a];
            }
        }

        System.out.println("matriz Suma:");
        for (int b = 0; b < C.length; b++) {
            for (int d = 0; d < C[b].length; d++) {
                System.out.printf("%3d", C[b][d]);
            }
            System.out.println();
        }

        /* Forma B) */

        int matrixRows_2, matrixColumns_2;

        System.out.println("Introduzca la cantidad de filas: ");
        matrixRows_2=sc.nextInt();
        System.out.println("Introduzca la cantidad de columnas: ");
        matrixColumns_2=sc.nextInt();

        int[][] D = matrixBuilding(matrixRows_2, matrixColumns_2);
        int[][] E = matrixBuilding(matrixRows_2, matrixColumns_2);

        System.out.println("Introduzca los valores de la primer matriz: ");
        matrixFilling(D);
        System.out.println("Introduzca los valores de la segunda matriz: ");
        matrixFilling(E);

        int [][] F = matrixSum(D, E);

        System.out.println("La matriz suma es: ");
        showMatrix(F);

        // Consigna 11 //

        int [][] G= new int [2][4];
        matrixFilling(G);

        int [][] Gt = transposeMatrix(G);

        System.out.println("La matriz transpuesta");
        showMatrix(Gt);
        }
        public static int [] randomNumberArray(int a, int b, int c){
        int [] randomNumbersArray= new int[c];
        Random rnd=new Random();

        for (int i=0; i < c; ++i){
            randomNumbersArray[i]=rnd.nextInt(b-a+1)+a;
        }

        return randomNumbersArray;
        }

        public static int [][] matrixBuilding(int a, int b){
        int [][] M=new int[a][b];
        return M;
        }

        public static int valueReading(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
        }

        public static void matrixFilling(int [][] M){
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    System.out.print("Elemento[" + i + "][" + j + "] = ");
                    M[i][j] = valueReading();
                }
            }
        }

        public static int[][] matrixSum(int[][] a, int[][] b) {
            int[][] c = matrixBuilding(a.length, a[0].length);
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            return c;
        }

        public static void showMatrix(int [][] M){
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    System.out.printf("%3d", M[i][j]);
                }
                System.out.println();
            }
        }

        public static int [][] transposeMatrix(int [][] a){
            int[][] t = new int[a[0].length][a.length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    t[j][i] = a[i][j];
                }
            }
            return t;
        }
    }