import java.util.*;

public class TP7 {
    public static void main(String[] args){

        /* TP 7 Algoritmos de ordenación */

        Scanner sc=new Scanner(System.in);


        // Consigna 1 //

        int [] numberArray= new int [5];

        numberArray=fillingArrayInt(numberArray);

        Arrays.sort(numberArray);

        showArrayInt(numberArray);

        // Consigna 2 //

        Integer [] numberArray2=new Integer [6];

        numberArray2=fillingArrayInteger(numberArray2);

        Arrays.sort(numberArray2, Collections.reverseOrder());

        showArrayInteger(numberArray2);

        // Consigna 3 //

        Float [] numberArray3=new Float[5];

        numberArray3=fillingArrayFloat(numberArray3);

        Arrays.sort(numberArray3);

        showArrayFloat(numberArray3);

        // Consigna 4 //

        Float [] numberArray4=new Float[6];

        numberArray4=fillingArrayFloat(numberArray4);

        Arrays.sort(numberArray4, Collections.reverseOrder());

        showArrayFloat(numberArray4);

        // Consigna 5 //

        String [] stringArray={"monitor", "teclado", "ratón", "auriculares", "procesador", "tarjeta gráfica"};

        Arrays.sort(stringArray);

        System.out.println("El arreglo de cadenas de caracteres ordenado alfabéticamente es: ");
        for (int j=0; j < stringArray.length; j++){
            System.out.print(stringArray[j]+", ");
        }
        System.out.println(" ");

        // Consigna 6 //

        String [] stringArray2={"queso", "pan", "jamón crudo", "salchichón primavera", "aceitunas", "mortadela", "salamín"};

        Arrays.sort(stringArray2, Collections.reverseOrder());

        System.out.println("El arreglo de cadenas de caracteres ordenado de forma alfabética inversa es: ");
        for (int k=0; k < stringArray2.length; k++){
            System.out.print(stringArray2[k]+", ");
        }
        System.out.println(" ");

        // Consigna 7 //

        Things1 [] numberArray5=new Things1[5];

        for (int l=0; l < numberArray5.length; l++){
            Things1 numberFromThings1=new Things1(sc.nextInt());
            numberArray5[l]=numberFromThings1;
        }

        Arrays.sort(numberArray5);

        System.out.println("El arreglo de números personalizado ordenado de forma ascendente es: ");
        for (int m=0; m < numberArray5.length; m++){
            System.out.print(numberArray5[m]+", ");
        }
        System.out.print(" ");

        // Consigna 8 //

        Things2 [] stringArray3=new Things2 [6];

        for (int n=0; n < stringArray3.length; n++){
            Things2 wordsFromThings2=new Things2(sc.next());
            stringArray3[n]=wordsFromThings2;
        }

        Arrays.sort(stringArray3, Collections.reverseOrder());

        System.out.println("El arreglo de palabras personalizado ordenado de forma descendente es: ");
        for (int o=0; o < stringArray3.length; o++){
            System.out.print(stringArray3[o]+", ");
        }
        System.out.print(" ");

        // Consigna 9 //

        int [] numberArray6=new int[7];

        numberArray6=fillingArrayInt(numberArray6);

        numberArray6=BubbleOrdering(numberArray6);

        showArrayInt(numberArray6);

        // Consigna 10 //

        int [] numberArray7=new int[7];

        numberArray7=fillingArrayInt(numberArray7);

        numberArray7=selectionOrdering(numberArray7);

        showArrayInt(numberArray7);

        // Consigna 11 //


        // Fin TP 7 //
    }

    // Métodos //
    public static int [] fillingArrayInt(int [] a){
        Scanner sc=new Scanner(System.in);

        for (int i=0; i < a.length; i++){
            System.out.println("Ingrese el valor del arreglo de la posición "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        System.out.println(" ");

        return a;
    }

    public static void showArrayInt(int [] a){
        System.out.println("El arreglo de números enteros de menor a mayor: ");
        for (int i=0; i < a.length; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println(" ");
    }

    public static Integer [] fillingArrayInteger(Integer [] a){
        Scanner sc=new Scanner(System.in);

        for (int i=0; i < a.length; i++){
            System.out.println("Ingrese el valor del arreglo de la posición "+i+": ");
            a[i]=sc.nextInt();
        }
        System.out.println(" ");

        return a;
    }

    public static void showArrayInteger(Integer [] a){
        System.out.println("El arreglo de números enteros de menor a mayor: ");
        for (int i=0; i < a.length; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println(" ");
    }

    public static Float [] fillingArrayFloat(Float [] a){
        Scanner sc=new Scanner(System.in);

        for (int i=0; i < a.length; i++){
            System.out.println("Ingrese el valor del arreglo de la posición "+i+": ");
            a[i]=sc.nextFloat();
        }
        System.out.println(" ");

        return a;
    }

    public static void showArrayFloat(Float [] a) {
        System.out.println("El arreglo de números enteros de menor a mayor: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(" ");
    }

    /* Método Burbuja */

    public static int [] BubbleOrdering(int [] numbers){
        int i, j, aux;
        for (i = 0; i < numbers.length - 1; i++) {
            for (j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    aux = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }

        return numbers;
    }

    /* Método de ordenación por selección */

    public static int [] selectionOrdering(int [] numbers){
        int i, j, menor, pos, tmp;
        for (i = 0; i < numbers.length - 1; i++) {
            menor = numbers[i];
            pos = i;
            for (j = i + 1; j < numbers.length; j++){
                if (numbers[j] < menor) {
                    menor = numbers[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = numbers[i];
                numbers[i] = numbers[pos];
                numbers[pos] = tmp;
            }
        }

        return numbers;
    }

    /* Método de ordenación por mezcla o merge */
    public static void mergesort(int [] A, int izq, int der){
        if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);
            merge(A,izq, m, der);
        }
    }

    public static void merge(int [] A,int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length];
        for (i=izq; i<=der; i++)
            B[i]=A[i];

        i=izq; j=m+1; k=izq;

        while (i<=m && j<=der)
            if (B[i]<=B[j])
                A[k++]=B[i++];
            else
                A[k++]=B[j++];

        while (i<=m)
            A[k++]=B[i++];
    }
    }

    // Clases //

class Things1 {
    int numbers;

public Things1(int numbers){
    this.numbers=numbers;
}
}

class Things2{
    public String productFromStore;
    public Things2(String productFromStore){
        this.productFromStore=productFromStore;
    }
}