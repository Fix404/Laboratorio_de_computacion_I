import java.util.*;

public class TP_9 {
    public static void main(String[] args){
        // TP 9 Colecciones //
        Scanner sc=new Scanner(System.in);

        // Consigna 1 //

        ArrayList<Integer> numbers=new ArrayList<>();
        int newNumber;

        for (int i=0; i < 5; i++){
            System.out.println("Ingrese un número entero a la lista: ");
            newNumber=sc.nextInt();
            numbers.add(newNumber);
        }

        System.out.println("Los números enteros en la lista son: ");
        for (int j=0; j < 5; j++){
            System.out.println(numbers.get(j));
        }

        // Consigna 2 //

        ArrayList<String> words=new ArrayList<>(3);
        String newWord;

        for (int i=0; i < 3; i++){
            System.out.println("Ingrese un nombre a la lista: ");
            newWord=sc.next();
            words.add(newWord);
        }


        System.out.println("Los nombres en la lista son: ");
        for (int j=0; j < 3; j++){
            System.out.println(words.get(j));
        }

        // Consigna 3 //

        System.out.println("Los números enteros en la lista son: ");
        for (int j=0; j < 5; j++){
            System.out.println(numbers.get(j));
        }

        // Consigna 4 //

        int amountOfWords=words.size();

        System.out.println("La cantidad de palabras es de: "+amountOfWords);

        // Consigna 5 //

        words.remove(2);
        System.out.println("Los nombres en la lista son: ");
        for (String string : words) {
            System.out.println(string);
        }

        // Consigna 6 //

        ArrayList<Integer> listOfNumbers= new ArrayList<>(4);

        System.out.print("Si desea ingresar un número entero escriba SI: ");
        String yesNumber=sc.next();

        if (yesNumber.equals("SI")){
            System.out.print("Ingrese un número: ");
            listOfNumbers.add(sc.nextInt());
        }

        boolean checkEmpty=listOfNumbers.isEmpty();

        if (checkEmpty){
            System.out.println("La lista está vacía");
        }else {
            System.out.println("La lista no está vacía");
        }

        // Consigna 7 //

        ArrayList<Integer> listOfNumbers2= new ArrayList<>(4);
        listOfNumbers2.add(0, 23);
        listOfNumbers2.add(1, -12);
        listOfNumbers2.add(2, 25);
        listOfNumbers2.add(3, 0);
        Integer biggest=listOfNumbers2.get(0);

        for (int i=0; i < listOfNumbers2.size()-1; i++){
            if (listOfNumbers2.get(i+1) > biggest){
                biggest=listOfNumbers2.get(i+1);
            }
        }
        System.out.println("El mayor número de la lista es "+biggest);
        System.out.print("");

        // Consigna 8 //

        ArrayList<Integer> copyOfListOfNumbers2= new ArrayList<>(listOfNumbers2.size());

        copyOfListOfNumbers2.addAll(listOfNumbers2);

        System.out.println(copyOfListOfNumbers2);
        System.out.print("");

        // Consigna 9 //

        ArrayList<Integer> reversedListOfNumbers2=new ArrayList<>(4);

        for (int j=0; j < listOfNumbers2.size(); j++){
            reversedListOfNumbers2.add(j, listOfNumbers2.get(listOfNumbers2.size()-1-j));
        }
        System.out.println(reversedListOfNumbers2);
        System.out.print("");

        // Consigna 10 //

        ArrayList<Integer> listOfNumbers3=new ArrayList<>(5);
        listOfNumbers3.add(0, 67);
        listOfNumbers3.add(1, 128);
        listOfNumbers3.add(2, -41);
        listOfNumbers3.add(3, -5);
        listOfNumbers3.add(4, 8);

        ArrayList<Integer> listOfNumbers4=new ArrayList<>(listOfNumbers2.size()+listOfNumbers3.size());

        listOfNumbers4.addAll(listOfNumbers2);
        listOfNumbers4.addAll(listOfNumbers3);

        System.out.println(listOfNumbers4);
        System.out.print("");

        // Consigna 11 //

        ArrayList<Integer> listOfNumbers5=new ArrayList<>(4);
        listOfNumbers5.add(12);
        listOfNumbers5.add(19);
        listOfNumbers5.add(133);
        listOfNumbers5.add(-4);

        for (int k=0; k < listOfNumbers5.size(); k++){
            if (listOfNumbers5.get(k)%2==0){
                listOfNumbers5.remove(k);
            }
        }

        System.out.println(listOfNumbers5);
        System.out.print("");

        // Consigna 12 //

        ArrayList<String> listOfStrings2=new ArrayList<>(5);
        listOfStrings2.add("Conejo");
        listOfStrings2.add("Jirafa");
        listOfStrings2.add("Lobo");
        listOfStrings2.add("Erizo");
        listOfStrings2.add("Pulpo");

        int indexOfString=listOfStrings2.indexOf("Lobo");

        System.out.println("El elemento "+listOfStrings2.get(2)+" posee el índice "+indexOfString);
        System.out.print("");

        // Consigna 13 //

        ArrayList<String> listOfStrings3=new ArrayList<>(5);
        listOfStrings3.add("Conejo");
        listOfStrings3.add("Jirafa");
        listOfStrings3.add("Erizo");
        listOfStrings3.add("Lobo");
        listOfStrings3.add("Pulpo");

        for (int l=0; l < listOfStrings3.size(); l++){
            if (listOfStrings2.get(l).equals(listOfStrings3.get(l))){
                continue;
            }else{
                System.out.println("Las listas no son exactamente iguales");
                System.out.print("");
                break;
            }
        }

        // Consigna 14 //

        int smallest=listOfNumbers3.get(0);

        for (int m=0; m < listOfNumbers3.size()-1; m++){
            if (listOfNumbers3.get(m+1) < smallest){
                smallest=listOfNumbers3.get(m+1);
            }
        }
        System.out.println("El menor número de la lista es "+smallest);
        System.out.print("");

        // Consigna 15 //

        ArrayList<Integer> listOfNumbers6=new ArrayList<>(6);
        listOfNumbers6.add(-8);
        listOfNumbers6.add(11);
        listOfNumbers6.add(-3);
        listOfNumbers6.add(22);
        listOfNumbers6.add(19);
        listOfNumbers6.add(-12);

        int sumOfIntegers=0;

        for (Integer integer : listOfNumbers6) {
            sumOfIntegers += integer;
        }
        System.out.println("La suma de la lista de números es "+sumOfIntegers);
        System.out.print("");

        // Consigna 16 //

        ArrayList<String> listOfStrings4=new ArrayList<>(4);
        listOfStrings4.add("El");
        listOfStrings4.add(" ");
        listOfStrings4.add("perro");
        listOfStrings4.add(" ");
        listOfStrings4.add("blanco");

        String phrase="";

        for (String string : listOfStrings4) {
            phrase += string;
        }
        System.out.println("La frase completa es: "+phrase);
        System.out.print("");

        // Consigna 17 //

        ArrayList<String> listOfStrings5=new ArrayList<>(4);
        listOfStrings5.add("Elefante");
        listOfStrings5.add("Armadillo");
        listOfStrings5.add("Armadillo");
        listOfStrings5.add("Nutria");
        listOfStrings5.add("Elefante");

        boolean noCopies=false;

        while (!noCopies){
            noCopies=true;
            for (int p=0; p < listOfStrings5.size(); p++){
                if (listOfStrings5.indexOf(listOfStrings5.get(p)) != listOfStrings5.lastIndexOf(listOfStrings5.get(p))){
                    listOfStrings5.remove(p);
                    noCopies=false;
                }
            }
        }
        System.out.println("La lista sin copias es: ");
        for (String word:listOfStrings5){
            System.out.print(word+", ");
        }
        System.out.println(" ");

        // Consigna 18 //

        ArrayList<Integer> listOfNumbers7=new ArrayList<>(5);
        listOfNumbers7.add(2);
        listOfNumbers7.add(-14);
        listOfNumbers7.add(4);
        listOfNumbers7.add(22);
        listOfNumbers7.add(-17);

        int sumOfIntegers2=listOfNumbers7.get(0);

        for (int q=0; q < listOfNumbers7.size(); q++){
            if (listOfNumbers7.indexOf(q)%2 == 0){
                sumOfIntegers2+=listOfNumbers7.get(q);
            }
        }
        System.out.println("La suma de la lista de números de índice par es "+sumOfIntegers2);
        System.out.print("");

        // Consigna 19 //

        System.out.println("Ingrese el número a verificar en la lista: ");
        Integer numberCheck= Integer.valueOf(sc.next());

        boolean integerCheck=listOfNumbers7.contains(numberCheck);

        if (integerCheck){
            System.out.println("El número "+numberCheck+" está en la lista");
        }else{
            System.out.println("El número "+numberCheck+" no está en la lista");
        }

        // Consigna 20 //

        String longestWord=listOfStrings3.get(0);

        for (String longComparizon:listOfStrings3){
            if (longComparizon.length() > longestWord.length()){
                longestWord=longComparizon;
            }
        }
        System.out.println("La palabra de mayor longitud en la lista es "+longestWord );
        System.out.print(" ");

        // Consigna 21 //

        int sumOfIntegers3=0;
        float averageValue;

        for (Integer integer : listOfNumbers7) {
            sumOfIntegers3 += integer;
        }
        averageValue= (float) sumOfIntegers3 /listOfNumbers7.size();

        System.out.println("El promedio de los valores en la lista es "+averageValue);
        System.out.print(" ");

        // Consigna 22 //

        ArrayList<Integer> listOfNumbers8=new ArrayList<>(6);
        listOfNumbers8.add(-3);
        listOfNumbers8.add(-8);
        listOfNumbers8.add(15);
        listOfNumbers8.add(31);
        listOfNumbers8.add(-21);
        listOfNumbers8.add(6);

        Collections.sort(listOfNumbers8);

        System.out.println("La lista de números ordenada de forma ascendente es ");
        for (Integer numbers8:listOfNumbers8){
            System.out.print(numbers8+", ");
        }
        System.out.println(" ");

        // Consigna 23 //

        ArrayList<Integer> listOfNumbers9=new ArrayList<>(7);
        listOfNumbers9.add(2);
        listOfNumbers9.add(23);
        listOfNumbers9.add(-4);
        listOfNumbers9.add(-5);
        listOfNumbers9.add(7);
        listOfNumbers9.add(19);
        listOfNumbers9.add(22);

        System.out.println("Ingrese el entero para filtrar la lista: ");
        Integer numberFilter=sc.nextInt();
        boolean filtered=false;

        while (!filtered) {
            filtered=true;
            for (int s = 0; s < listOfNumbers9.size(); s++) {
                if (listOfNumbers9.get(s) > numberFilter) {
                    listOfNumbers9.remove(s);
                    filtered=false;
                }
            }
        }
        System.out.println("La lista de números filtrada es ");
        for (Integer showl:listOfNumbers9){
            System.out.print(showl+", ");
        }
        System.out.println(" ");

        // Consigna 24 //

        int copiesCounter=0;
        listOfStrings5.add("Armadillo");

        System.out.println("La palabra a buscar: ");
        String wordToCount=sc.next();

        for (String countingWord:listOfStrings5){
            if (countingWord.equals(wordToCount)){
                copiesCounter+=1;
            }
        }

        System.out.println("La palabra "+wordToCount+" aparece "+copiesCounter+" veces en la lista");
        System.out.print(" ");

        // Consigna 25 //

        ArrayList<String> listOfStrings7=new ArrayList<>(6);
        listOfStrings7.add("Camión");
        listOfStrings7.add("Avioneta");
        listOfStrings7.add("Avión");
        listOfStrings7.add("Lancha");
        listOfStrings7.add("Colectivo");
        listOfStrings7.add("Tranvía");

        Collections.sort(listOfStrings7);

        System.out.println("La lista de palabras ordenada alfabéticamente es: ");
        for (String moreWords:listOfStrings7){
            System.out.print(moreWords+", ");
        }
        System.out.println(" ");

        // Fin TP 9 //
    }
}
