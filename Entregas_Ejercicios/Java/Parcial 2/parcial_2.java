import java.util.*;
import java.util.regex.*;

public class parcial_2 {
    public static void main(String[] args){

        // Se debe verificar el ADN de un sujeto. Se hará con una lista de strings //

        ArrayList<String> dnaList=new ArrayList<>(6);
        subject ind1=new subject(dnaList), builtInd1;
        boolean mutant;

        builtInd1=subject.dna_filler(ind1);
        //subject.showMatrix(builtInd1);
        mutant=subject.isMutant(builtInd1);

        if (mutant){
            System.out.println("El individuo es mutante");
            System.out.print(" ");
        }else{
            System.out.println("El individuo no es mutante");
            System.out.print(" ");
        }
    }
    public static class subject{
        private ArrayList<String> dna;
        public subject(ArrayList<String> dna){
            this.dna=dna;
        }
        static subject dna_filler(subject dna){
            Scanner sc=new Scanner(System.in);
            ArrayList<String> newDna=new ArrayList<>(6);

            System.out.println("A continuación deberá ingresar secuencias genéticas válidas a la lista de strings");
            System.out.print(" ");
            System.out.println("Sólo se permiten las secuencias \"A\", \"T\", \"C\", \"G\".");
            System.out.print(" ");

            String regexDna="^[ATCG]+$";
            boolean ok_input;
            String dnaLine;

            Pattern dnaCheck=Pattern.compile(regexDna);

            for (int i=0; i < 6; i++){
                ok_input=false;
                while (!ok_input){
                    System.out.println("Ingrese la secuencia correspondiente al string de posición "+(i+1)+ ": ");
                    System.out.print(" ");
                    dnaLine=sc.next();

                    Matcher okDna=dnaCheck.matcher(dnaLine);
                    boolean strike= okDna.find();

                    if (strike) {
                        newDna.add(dnaLine);
                        ok_input=true;
                    }else{
                        System.out.println("La secuencia no es válida, ingrésela de nuevo");
                        System.out.print(" ");
                    }
                }
            }

            dna=new subject(newDna);

            return dna;
        }
        public static void showMatrix(subject dnaList){
            for (int i=0; i < 6; i++){
                System.out.println(dnaList.dna.get(i)+",");
                System.out.print(" ");
            }
        }
        public static boolean isMutant(subject dnaData){
            boolean mutant=false, okSecuence=false;
            int matchCounter=0, v=0;
            String mutantCheck=".*(A{4}|C{4}|G{4}|T{4}).*", verticalSec="";
            Pattern mutantRule=Pattern.compile(mutantCheck);
            String [] verticalSecuences=new String[6];

            // Verificador horizontal //
            for (int i=0; i < dnaData.dna.size(); i++){
                Matcher dnaSearchHor= mutantRule.matcher(dnaData.dna.get(i));
                if (dnaSearchHor.matches()){
                    matchCounter++;
                }
            }
            if (matchCounter > 1){
                mutant=true;
            }

            // Verficador vertical //
            if (!mutant) {
                while (v < 6) {
                    for (int j = 0; j < dnaData.dna.size(); j++) {
                        verticalSec = verticalSec.concat(String.valueOf((dnaData.dna.get(j)).charAt(v)));
                    }
                    verticalSecuences[v] = verticalSec;
                    v++;
                }

                for (int k = 0; k < dnaData.dna.size(); k++) {
                    Matcher dnaSearchVert = mutantRule.matcher(verticalSecuences[k]);
                    if (dnaSearchVert.matches()) {
                        matchCounter++;
                    }
                }
                if (matchCounter > 1) {
                    mutant = true;
                }
            }
                // Verificador diagonal //
            if (!mutant){
                for (int l=0; l < dnaData.dna.size()-3; l++){
                    for (int m=0; m < dnaData.dna.size()-3; m++){
                        if (String.valueOf((dnaData.dna.get(l)).charAt(m)).equals(String.valueOf((dnaData.dna.get(l+1)).charAt(m+1)))){
                            if (String.valueOf((dnaData.dna.get(l+1)).charAt(m+1)).equals(String.valueOf((dnaData.dna.get(l+2)).charAt(m+2)))){
                                if (String.valueOf((dnaData.dna.get(l+2)).charAt(m+2)).equals(String.valueOf((dnaData.dna.get(l+3)).charAt(m+3)))){
                                    matchCounter++;
                                }
                            }
                        }
                    }
                }
                if (matchCounter > 1) {
                    mutant = true;
                }
            }

            // Verificador diagonal inversa //
            if (!mutant){
                for (int n=0; n < dnaData.dna.size()-3; n++){
                    for (int o=dnaData.dna.size()-1; o > -1; o--){
                        if (String.valueOf((dnaData.dna.get(n)).charAt(o)).equals(String.valueOf((dnaData.dna.get(n+1)).charAt(o-1)))){
                            if (String.valueOf((dnaData.dna.get(n+1)).charAt(o-1)).equals(String.valueOf((dnaData.dna.get(n+2)).charAt(o-2)))){
                                if (String.valueOf((dnaData.dna.get(n+2)).charAt(o-2)).equals(String.valueOf((dnaData.dna.get(n+3)).charAt(o-3)))){
                                    matchCounter++;
                                }
                            }
                        }
                    }
                }
                if (matchCounter > 1) {
                    mutant = true;
                }
            }

            return mutant;
        }
    }
}