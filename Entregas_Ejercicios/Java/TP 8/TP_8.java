import java.util.*;

public class TP_8 {
    public static void Main(String[] args){
        // TP 8 Práctica arreglos //

        // Consigna 1 //

        int [][] A= {{23, -12, -3, 4, 8},
                {31, -16, -18, 21, 1},
                {8, -2, -7, -6, 26}};
        int [][] B= {{8, 2, 13, -19, -2},
                {2, 16, -1, 23, -7},
                {4, 1, 3, 10, -11}};
        int [][] C= new int [3][5];

        C=sumMatrix(A, B);
    }
    // Métodos //

    public static int [][] sumMatrix(int [][] A, int [][] B){
        int [][] C= new int [3][5];

        for (int a=0; a < 3; a++){
            for (int b=0; b < 5; b++){
                C[a][b]=A[a][b]+B[a][b];
            }
        }

        return C;
    }
}
