import java.util.*;
import java.lang.*;

public class TP_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TP 8 Práctica arreglos //

        // Consigna 1 //

        int[][] A = {{23, -12, -3, 4, 8}, {31, -16, -18, 21, 1}, {8, -2, -7, -6, 26}};
        int[][] B = {{8, 2, 13, -19, -2},
                {2, 16, -1, 23, -7},
                {4, 1, 3, 10, -11}};
        int[][] C = new int[3][5];


        C=sumMatrix(A, B);
        displayMatrix(C);

        // Consigna 2 //

        int[][] D = {{21, 2, -11, 7, 1},
                {31, -4, -1, 6, -4},
                {-1, -2, 9, 23, 40},
                {3, 2, 17, -24, -6}};
        int[][] E = {{8, 2, 13},
                {12, -19, -2},
                {2, 16, -1},
                {11, 23, -7},
                {4, 10, -11}};
        int[][] F = new int[3][3];

        F=multMatrices(D, E);
        displayMatrix(F);

        // Consigna 3 //

        int[][] G = {{2, -34},
                {-4, -1},
                {3, 12}};

        int[][] H = new int[G[0].length][G.length];

        H=transposeMatrix(G);
        displayMatrix(H);

        // Consigna 4 //

        int[][] J = {{-3, 5, 4},
                {5, 12, 4},
                {4, 4, -7}};

         simetryVerifier(J);

        // Consigna 5 //
        /* Se interpretó el producto de los elementos del vector por el número*/

        int[] K = {4, -2, 14, -8, -1, 14, -7, -8};
        System.out.print("A continuación ingrese el número a multiplicar el vector: ");
        int constant=sc.nextInt();
        int[] L = new int[K.length];

        L=productOfConstantByVector(K, constant);
        listPrinter(L);

        // Consigna 6 //

        int sumOfElements = 0;

        sumOfElements=sumOfElementsOfMatrix(G, sumOfElements);

        System.out.print(sumOfElements);

        // Consigna 7 //

        int maxValue;

        maxValue=maximumValueOfMatrix(E);
        System.out.print(maxValue);

        // Consigna 8 //

        int sum2, rowLimit;

        rowLimit=B.length;
        System.out.print("Introduzca la fila a sumar, teniendo en cuenta que la matriz tiene "+rowLimit+" filas: ");
        int row=sc.nextInt();
        row=row-1;

        sum2=sumOfRowFromMatrix(B, row);
        System.out.print(sum2);

        // Consigna 9 //

        int[][] M = {{1, 0, 0}, {0, -4, 0}, {0, 0, 8}};

        diagonalVerifier(M);

        // Consigna 10 //

        int n;
        System.out.print("Ingrese el tamaño de la matriz identidad a generar: ");
        n=sc.nextInt();
        int [][] O=new int [n][n];

        O=identityMatrixGenerator(n);
        displayMatrix(O);

        // Consigna 11 //

        int[] evenOdd = new int[2];

        evenOdd=evenOddCounter(J);

        System.out.print("La cantidad de números pares e impares, en ese orden, es: ");
        listPrinter(evenOdd);

        // Consigna 12 //

        int[][] P;

        P=rotateMatrix90degreesclockwise(G);
        displayMatrix(P);

        // Consigna 13 //

        System.out.print("Ingrese el número a verificar en la matriz: ");
        int num=sc.nextInt(), frec;

        frec=numberCounter(D, num);

        System.out.print("El número "+num+" aparece "+frec+" veces en la matriz");

        // Consigna 14 //

        int[][] Q;

        Q=inverseRowOrder(E);
        displayMatrix(Q);

        // Consigna 15 //

        int[] sumOfDiags;

        sumOfDiags=sumOfDiagonals(J);
        listPrinter(sumOfDiags);

        // Consigna 16 //
        /* Se aplicarán fórmulas para una matriz 3x3 */

        int[][] R = {{1, 2},
                     {2, -5}};
        int det = 0;
        int [][] adjR=new int [2][2];
        double [][] invR=new double [2][2];

        if (R.length == R[0].length) {
            det = determinantCalculatornis2(R);
            System.out.print(det);
            System.out.println(" ");
        }else{
            System.out.print("La matriz no es cuadrada");
        }

        if (det==0){
            System.out.print("La matriz no es invertible");
        }else{
            adjR=adjunctCalculatornis2(R);
            invR=inverseMatrix2x2(det, adjR);
            ortogonalVerifier(R, invR);
        }

        // Consigna 17 //

        int [] S;

        S=minimumValueFromRow(E);
        listPrinter(S);

        // Consigna 18 //

        int [][] T;

        T=multMatrixNullOption(A, B);
        displayMatrix(T);

        // Fin TP 8 //
    }
    // Métodos //

    // Realizar la suma de dos matrices //
    public static int [][] sumMatrix(int [][] A, int [][] B){
        int [][] C= new int [3][5];

        for (int a=0; a < A.length; a++){
            for (int b=0; b < A[a].length; b++){
                C[a][b]=A[a][b]+B[a][b];
            }
        }
        return C;
    }

    // Mostrar elementos de la matriz en pantalla //
    public static void displayMatrix(int [][] A){
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[i].length; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("; ");
        }
    }

    // Multiplicar dos matrices //
    public static int [][] multMatrices(int [][] A, int [][] B){
        int [][] C=new int [A.length][B[0].length];

        for (int i=0; i < A.length; i++){
            for (int j=0; j < B[i].length; j++){
                for (int k=0; k < A[i].length; k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }

    // Traspuesta de una matriz //
    public static int [][] transposeMatrix(int [][] A){
        int [][] TransposedA=new int [A[0].length][A.length];

        for (int i=0; i < A.length; i++){
            for (int j=0; j < A[i].length; j++){
                TransposedA[j][i]=A[i][j];
            }
        }
        return TransposedA;
    }

    // Verificación de simetría //
    public static void simetryVerifier(int [][] A) {
        boolean okSimetry = true;
        if (A.length == A[0].length) {
            int[][] TransposedA = new int[A.length][A[0].length];

            TransposedA = transposeMatrix(A);

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    if (i != j) {
                        if (A[i][j] != A[j][i]) {
                            okSimetry = false;
                        }
                    }
                }
            }
            if (okSimetry) {
                System.out.print("La matriz es simétrica");
            } else {
                System.out.print("La matriz no es simétrica");
            }
        } else {
            System.out.print("La matriz no es cuadrada; el concepto de simetría no aplica");
        }
    }

    // Producto de un número por los elementos de un vector //
    public static int [] productOfConstantByVector(int [] vector, int constant){
        int [] vector_times_c=new int [vector.length];

        for (int i=0; i < vector.length; i++){
            vector_times_c[i]=vector[i]*constant;
        }
        return vector_times_c;
    }
    // Mostrar en pantalla la lista //
    public static void listPrinter(int [] vector){
        System.out.print("Los valores del vector son:");
        System.out.print(" ");
        for (int i=0; i < vector.length; i++){
            System.out.print(vector[i]+" ");
        }
    }
    // Suma de elementos de una matriz //
    public static int sumOfElementsOfMatrix(int [][] A, int sum){
        for (int i=0; i < A.length; i++){
            for (int j=0; j < A[i].length; j++){
                sum=sum+A[i][j];
            }
        }
        return sum;
    }
    // Valor máximo de una matriz //
    public static int maximumValueOfMatrix(int [][] A){
        int max=A[0][0];

        for (int i=0; i < A.length; i++){
            for (int j=0; j < A[i].length; j++){
                if (A[i][j] > max){
                    max=A[i][j];
                }
            }
        }
        return max;
    }
    // Suma de elementos de una fila específica de una matriz //
    public static int sumOfRowFromMatrix(int [][] A, int row){
        int sum=0;

        for (int j=0; j < A[row].length; j++){
            sum=sum+A[row][j];
        }
        return sum;
    }
    // Verificación de matriz diagonal //
    public static void diagonalVerifier(int [][] A) {
        boolean okDiagonal = true;

        if (A.length == A[0].length) {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    if (i != j) {
                        if (A[i][j] != 0) {
                            okDiagonal = false;
                        }
                    }
                }
            }
            if (okDiagonal) {
                System.out.print("La matriz es diagonal");
            } else {
                System.out.print("La matriz no es diagonal");
            }
        } else {
            System.out.print("La matriz no es cuadrada; el concepto de diagonalidad no aplica");
        }
    }
    // Generación de matriz identidad de tamaño n //
    public static int [][] identityMatrixGenerator(int n){
        int [][] identityMatrix=new int [n][n];

        for (int i = 0; i < identityMatrix.length; i++) {
            for (int j = 0; j < identityMatrix[i].length; j++) {
                if (i == j) {
                    identityMatrix[i][j]=1;
                    }else{
                    identityMatrix[i][j]=0;
                }
            }
        }
        return identityMatrix;
    }
    // Contador de elementos pares e impares en una matriz //
    public static int [] evenOddCounter(int [][] A) {
        int evenCounter = 0, oddCounter = 0;
        int[] evenOddList={evenCounter, oddCounter};

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] % 2 == 0) {
                    evenCounter++;
                } else {
                    oddCounter++;
                }
            }
        }
        evenOddList[0]=evenCounter;
        evenOddList[1]=oddCounter;

        return evenOddList;
    }
    // Rotar una matriz 90 grados hacia la derecha //
    public static int [][] rotateMatrix90degreesclockwise(int [][] A){
        int [][] rotatedA=new int [A[0].length][A.length];

        for (int i = 0; i < rotatedA.length; i++) {
            for (int j = 0; j < rotatedA[i].length; j++) {
                rotatedA[i][j]=A[(A.length-1)-j][i];
            }
        }
        return rotatedA;
    }
    // Contador de eventos en una matriz //
    public static int numberCounter(int [][] A, int number){
        int frequency=0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == number) {
                    frequency++;
                }
            }
        }

        return frequency;
    }
    // Método que invierte el orden de las filas de una matriz //
    public static int [][] inverseRowOrder(int [][] A){
        int [][] reverseRowA=new int [A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            reverseRowA[i]=A[(A.length-1)-i];
        }
        return reverseRowA;
    }
    // Suma de diagonales de una matriz //
    public static int [] sumOfDiagonals(int [][] A){
        int [] totalSumDiag=new int [A.length];
        if (A.length==A[0].length){
            int [] mainDiag=new int [A.length], secondaryDiag=new int [A.length];

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    if (i == j){
                        mainDiag[i]=A[i][j];
                    }
                    if (i == ((A[i].length-1)-j)){
                        secondaryDiag[i]=A[i][j];
                    }
                }
            }

            for (int k=0; k < mainDiag.length; k++){
                totalSumDiag[k]=mainDiag[k]+secondaryDiag[k];
            }
        }else{
            System.out.print("La matriz no es cuadrada, no posee diagonales");
        }
        return totalSumDiag;
    }
    // Cálculo de determinante 2x2//
    public static int determinantCalculatornis2(int [][] A) {
        int det = 0;
        int positiveProd = A[0][0], negativeProd = A[0][A.length-1];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (i == j && (i != 0)) {
                    positiveProd = positiveProd * A[i][j];
                }
                if (i == ((A[i].length - 1) - j) && i != 0) {
                    negativeProd = negativeProd * A[i][j];
                }
            }
        }

        det = positiveProd - negativeProd;
        return det;
    }
    // Obtención de adjunta 2x2 //
    public static int [][] adjunctCalculatornis2(int [][] A){
        int [][] adjA=new int [2][2];

        adjA[0][0]=A[1][1];
        adjA[0][1]=-A[1][0];
        adjA[1][0]=-A[0][1];
        adjA[1][1]=A[0][0];

        return adjA;
    }
    // Cálculo de la inversa de una matriz 2x2 //
    public static double [][] inverseMatrix2x2(int det, int [][] adjA){
        double [][] invA=new double [2][2];

        for (int i=0; i < adjA.length; i++){
            for (int j=0; j < adjA.length; j++){
                invA[i][j]= (float) (adjA[i][j]) /det;
            }
        }
        return invA;
    }
    // Verificador de ortogonalidad //
    public static void ortogonalVerifier(int [][] R, double [][] invR){
        boolean ortogonal=true;
        int [][] traspR=new int [2][2];

        traspR=transposeMatrix(R);

        for (int i=0; i < R.length; i++){
            for (int j=0; j < R[i].length; j++){
                if (traspR[i][j] != invR[i][j]){
                    ortogonal=false;
                }
            }
        }

        if (ortogonal){
            System.out.print("La matriz es ortogonal");
        }else{
            System.out.print("La matriz no es ortogonal");
        }
    }
    // Valor máximo de cada fila //
    public static int [] minimumValueFromRow(int [][] A){
        int [] minValues=new int [A.length];
        int minValueLocal=0;

        for (int i=0; i<A.length; i++){
            minValueLocal=A[i][0];
            for (int j=0; j<A[i].length; j++){
                if (j != A[i].length-1){
                    if (minValueLocal > A[i][j+1]){
                        minValueLocal=A[i][j+1];
                    }
                }
            }
            minValues[i]=minValueLocal;
        }

        return minValues;
    }
    // Multiplica las matrices y entrega una nula en caso de no poder multiplicar //
    public static int [][] multMatrixNullOption(int [][] A, int [][] B){
        int [][] C=new int [A.length][B[0].length];
        if (A.length==B[0].length){
            C=multMatrices(A, B);
        }else{
            System.out.print("La matriz no puede multiplicarse");
            System.out.println(" ");
            for (int i=0; i < A.length; i++){
                for (int j=0; j < B[i].length; j++){
                    C[i][j] = 0;
                }
            }
        }
        return C;
    }
}
