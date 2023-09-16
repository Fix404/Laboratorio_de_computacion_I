import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        // Consigna 1 //
        
        Scanner scan=new Scanner(System.in);
        int A, B;
        System.out.println("Introduzca un número entero: ");
        A=scan.nextInt();
        System.out.println("Introduzca otro número entero: ");
        B=scan.nextInt();
        System.out.println("El primer número ingresado es "+A+" y el segundo número es "+B);
        scan.nextLine();

        // Consigna 2 //

        String name;
        System.out.println("Ingrese un nombre: ");
        name=scan.nextLine();
        System.out.println("El nombre es: "+name);

        // Consigna 3 //

        int C, D, E;
        System.out.println("Introduzca un número entero: ");
        C=scan.nextInt();
        D=C*2;
        E=C*3;
        System.out.println("El doble del número "+C+" es de "+D+" y el triple es de "+E);
        scan.reset();

        // Consigna 4 //

        double tempC, tempF;
        System.out.println("Introduzca una temperatura en grados Celsius: ");
        tempC=scan.nextDouble();
        tempF=(tempC*9.0/5)+32;
        System.out.println("La temperatura en grados Fahrenheit es de "+tempF);
        scan.nextLine();

        // Consigna 5 //

        double radio, perim, area;
        System.out.println("Introduzca el radio de la circunferencia: ");
        radio=scan.nextDouble();
        perim=Math.PI*2*radio;
        area=Math.PI*Math.pow(radio, 2);
        System.out.println("El perímetro de la circunferencia vale "+perim+" metros y su área "+area+" metros cuadrados.");
        scan.nextLine();

        // Consigna 6 //

        double vel_km_h, vel_m_s;
        System.out.println("Introduzca una velocidad en kilómetros por hora: ");
        vel_km_h=scan.nextDouble();
        vel_m_s=vel_km_h*(1000.0/3600.0);
        System.out.println("La velocidad en m/s es de: "+vel_m_s);
        scan.nextLine();

        // Consigna 7 //

        double cat_1, cat_2, hipot;
        System.out.println("Introduzca el primer cateto del triángulo: ");
        cat_1=scan.nextDouble();
        System.out.println("Introduzca el segundo cateto del triángulo: ");
        cat_2=scan.nextDouble();
        hipot=Math.pow(Math.pow(cat_1, 2)+Math.pow(cat_2, 2), 0.5);
        System.out.println("La hipotenusa del triángulo vale: "+hipot+" metros.");
        scan.nextLine();

        // Consigna 8 //

        double radio_esfera, volumen_esfera; 
        System.out.println("Introduzca el radio de la esfera: ");
        radio_esfera=scan.nextDouble();
        volumen_esfera=(4.0/3.0)*Math.PI*Math.pow(radio_esfera, 3);
        System.out.println("El volumen de la esfera es de "+volumen_esfera+" metros cúbicos.");
        scan.nextLine();

        // Consigna 9 //

        double a, b, c, p, area_triangulo;
        System.out.println("Introduzca el primer lado del triángulo: ");
        a=scan.nextDouble();
        System.out.println("Introduzca el segundo lado del triángulo: ");
        b=scan.nextDouble();
        System.out.println("Introduzca el tercer lado del triángulo: ");
        c=scan.nextDouble();
        p=(a+b+c)/2.0;
        area_triangulo=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("El área del triángulo es de "+area_triangulo+" metros cuadrados.");
        scan.nextLine();

        // Consigna 10 //

        int tres_cifras, unidades, decenas, centenas;
        System.out.println("Introduzca un número de tres cifras: ");
        tres_cifras=scan.nextInt();
        centenas=tres_cifras/100;
        decenas=(tres_cifras-centenas*100)/10;
        unidades=(tres_cifras-centenas*100-decenas*10);
        System.out.println("El número introducido fue "+tres_cifras+" y sus cifras en orden son "+centenas+", "+decenas+", "+unidades);
        scan.nextLine();

        // Consigna 11 //

        int N;
        System.out.println("Introduzca un número entero de cinco cifras: ");
        N=scan.nextInt();
        System.out.println("Las cifras del número introducido en orden ascendente son: ");
        System.out.println(Math.floor(N/10000));
        System.out.println(Math.floor(N/10000)+" "+Math.floor(N/1000));
        System.out.println(Math.floor(N/10000)+" "+Math.floor(N/1000)+" "+Math.floor(N/100));
        System.out.println(Math.floor(N/10000)+" "+Math.floor(N/1000)+" "+Math.floor(N/100)+" "+Math.floor(N/10));
        System.out.println(Math.floor(N/10000)+" "+Math.floor(N/1000)+" "+Math.floor(N/100)+" "+Math.floor(N/10)+" "+(N));
        scan.nextLine();

        // Consigna 12 //

        int N_1;
        System.out.println("Introduzca un número entero de cinco cifras: ");
        N_1=scan.nextInt();
        System.out.println("Las cifras del número introducido en orden descendente son: ");
        System.out.println(Math.floor(N_1/10000)+" "+Math.floor(N_1/1000)+" "+Math.floor(N_1/100)+" "+Math.floor(N_1/10)+" "+(N_1));
        System.out.println(Math.floor(N_1/10000)+" "+Math.floor(N_1/1000)+" "+Math.floor(N_1/100)+" "+Math.floor(N_1/10));
        System.out.println(Math.floor(N_1/10000)+" "+Math.floor(N_1/1000)+" "+Math.floor(N_1/100));
        System.out.println(Math.floor(N_1/10000)+" "+Math.floor(N_1/1000));
        System.out.println(Math.floor(N_1/10000));
        scan.nextLine();

        // Consigna 13 //

        double dia, mes, anno, suma, suerte, miles, cientos_2, decenas_2, unidades_2;
        System.out.println("Introduzca su fecha de nacimiento como sigue: ");
        System.out.println("Día: ");
        dia=scan.nextDouble();
        System.out.println("Mes: ");
        mes=scan.nextDouble();
        System.out.println("Año: ");
        anno=scan.nextDouble();
        suma=dia+mes+anno;
        miles=suma/1000;
        cientos_2=(suma-miles*1000)/100;
        decenas_2=(suma-miles*1000-cientos_2*100)/10;
        unidades_2=(suma-miles*1000-cientos_2*100-decenas_2*10);
        suerte=Math.floor(miles+cientos_2+decenas_2+unidades_2);

        System.out.println("Su número de la suerte es "+suerte);
        scan.nextLine();

        // Consigna 14 //

        double precio_unidad, iva, cant_vendidos, precio_final;
        System.out.println("Introduzca el precio por unidad sin I.V.A. : ");
        precio_unidad=scan.nextDouble();
        System.out.println("Introduzca el porcentaje de I.V.A. : ");
        iva=scan.nextDouble();
        System.out.println("Introduzca la cantidad de producto vendido: ");
        cant_vendidos=scan.nextDouble();
        precio_final=precio_unidad*(1+iva/100.0)*cant_vendidos;
        System.out.println("El valor de venta final es: "+precio_final+" pesos.");
        scan.nextLine();

        // Consigna 15 //

        double N_2, m, N_2_reducido;
        System.out.println("Introduzca un número: ");
        N_2=scan.nextDouble();
        System.out.println("Introduzca la cantidad de cifras a quitar: ");
        m=scan.nextDouble();
        N_2_reducido=Math.floor(N_2/(Math.pow(10, m)));
        System.out.println("El número "+N_2+" con "+m+" últimas cifras menos queda como "+ N_2_reducido);
        scan.nextLine();

        // Consigna 16 //

        double temp_Cent, temp_K, temp_R;
        System.out.println("Introduzca una temperatura en grados centígrados: ");
        temp_Cent=scan.nextDouble();
        temp_K=temp_Cent+273.0;
        temp_R=(4.0/5.0)*temp_Cent;
        System.out.println("La temperatura en grados Kelvin es de "+temp_K+" y la temperatura en grados Reamur es de "+temp_R);
        scan.nextLine();

        scan.close();
        // Fin TP 4 //
    }
}