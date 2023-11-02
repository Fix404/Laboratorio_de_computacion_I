import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class TP_12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Datos para prueba //
        // RegEx grupal //
        String regex= "\\b(\\d{2})(\\d{3})(\\d{7})\\b";

        Pattern numeroTelef = Pattern.compile(regex);
        String phones="542612332138, 12345123, perro";
        Matcher searcher = numeroTelef.matcher(phones);

        while (searcher.find()) {
            System.out.println("Código de país: " + searcher.group(1) +
                    ", código de área: " + searcher.group(2) +
                    ", número celular: " + searcher.group(3));
        }

        // Verificación de datos simple //
        System.out.print("Ingrese una dirección de correo electrónico válida: ");
        String email=sc.next();
        ArrayList <String> emails=new ArrayList<>(2);

        Pattern verifyEmail=Pattern.compile(".@");

        Matcher checkEmail = verifyEmail.matcher(email);

        boolean okEmail=checkEmail.find();

        if (okEmail){
            emails.add(email);
            System.out.print(emails);
        }else{
            System.out.print("Usted no ingresó una dirección válida");
        }

        // Ejemplo de aplicación de RegEx simple //
        ArrayList<Pattern> wordsInText=new ArrayList<>(5);

        Pattern patron = Pattern.compile("dragón", Pattern.CASE_INSENSITIVE);


        Matcher matcher = patron.matcher("El jinete cabalga en el ocaso");

        boolean coincidencia = matcher.find();

        if (coincidencia){
            wordsInText.add(patron);
            System.out.print(wordsInText);
        }else{
            System.out.print("La palabra "+patron+" no se encuentra en el texto");
        }

        // Fin TP 12 //
    }
}
