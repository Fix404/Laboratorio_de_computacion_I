import java.math.*;
import java.util.*;
public class TP_10 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // TP 10 Clases y objetos //

        // Consigna 1 //
           // Clase Perro creada //

        // Consigna 2 //

        Perro dog1=new Perro("Pipo", "Beagle", 3, "Blanco con manchas marrones y negras");

        // Consigna 3 //

        Perro.barkBark();

        // Consigna 4 //

        System.out.println("Ingrese el valor del radio del círculo: ");

          // Consigna 5 //
        Circulo circ1=new Circulo(sc.nextFloat());
        System.out.print(" ");

        float perimeterCirc1=Circulo.perim(circ1.radio), areaCirc1=Circulo.area(circ1.radio);

        System.out.println("El perímetro del círculo de radio "+circ1.radio+" vale "+perimeterCirc1+" y su área es "+areaCirc1);
        System.out.print(" ");

        // Consigna 6 //
          // Creada clase Estudiante //

        // Consigna 7 //
          // Creado constructor de clase Estudiante //

        Estudiante est1= new Estudiante("Alejandra", "Sánchez", 24, 33214);

        // Consigna 8 //
          // Clase Libro creada //

        // Consigna 9 //

        Libro libro1=new Libro("La reaparición de Sherlock Holmes", "Arthur Conan Doyle", 2009, "Alfaguara");

        Libro.showLibro(libro1);

        // Consigna 10 //
           // Creada clase CuentaBancaria //

        // Consigna 11 //

        CuentaBancaria user1=new CuentaBancaria(34512342, 1235542.3443, "Pablo Quevedo");
        int operation;
        double amount;

        System.out.print(user1.saldo);
        System.out.print(" ");

        System.out.println("Si desea extraer dinero ingrese 1, si desea depositar ingrese 2: ");
        operation=sc.nextInt();
        System.out.print(" ");

        if (operation == 1){
            System.out.println("Ingrese el monto a extraer: ");
            amount=sc.nextDouble();
            user1.setSaldoExtraccion(user1.saldo, amount);
            System.out.print(" ");
        }else{
            System.out.println("Ingrese el monto a depositar: ");
            amount=sc.nextDouble();
            user1.setSaldoDeposito(user1.saldo, amount);
            System.out.print(" ");
        }
        System.out.println("Su nuevo saldo es: "+user1.saldo);
        System.out.print(" ");

        // Consigna 12 //

        Rectangulo rect1=new Rectangulo(12.45, 44.2134);
        double perRect1=Rectangulo.PerimeterRectangle(rect1.ancho, rect1.alto),
                areaRect1=Rectangulo.AreaRectangle(rect1.ancho, rect1.alto);

        System.out.println("El perímetro del rectángulo vale "+perRect1+" y su área es "+areaRect1);
        System.out.print(" ");

        // Consigna 13 //
           // Creada clase coche //

        // Consigna 14 //

        Coche car1=new Coche("Subaru", "Impressa", 1998, "Azul", "Frenado");
        int decision;

        System.out.println("El estado actual del vehículo es "+car1.curentSpeed);
        System.out.println("Ingrese 1 para acelerar, o 2 para frenar: ");
        decision=sc.nextInt();
        System.out.print(" ");

        car1.setCurentSpeed(car1.curentSpeed, decision);

        System.out.println("El estado actual del vehículo es "+car1.curentSpeed);
        System.out.print(" ");

        // Consigna 15 //

        Pelicula pel1=new Pelicula("El silencio de los inocentes", "Jonathan Demme", 118, "Crimen, Suspenso psicológico, Terror");

        Pelicula.showPelicula(pel1);

        // Fin TP 10 //
    }

    // Consigna 1 //

    public static class Perro{
        private String nombre;
        private String raza;
        private int edad;
        private String color;

        // Consigna 2 //
            // Constructor //

        public Perro(String nombre, String raza, int edad, String color){
           this.nombre=nombre;
           this.raza=raza;
           this.edad=edad;
           this.color=color;
        }

        // Consigna 3 //

        static void barkBark(){
            System.out.println("Guau, Guau");
            System.out.print(" ");
        }
    }

    // Consigna 4 //

    public static class Circulo{
        private float radio;

        // Constructor //
        public Circulo(float radio){
            this.radio=radio;
        }

        // Perímetro del círculo //

        static float perim(float r){
            float perimeter;

            perimeter= (float) (2*Math.PI*r);

            return perimeter;
        }

        // Área del círculo //
        static float area(float r){
            float areaCircle;

            areaCircle= (float) (Math.PI*Math.pow(r, 2));

            return areaCircle;
        }
    }

    // Consigna 6 //

    public static class Estudiante{
        String nombre;
        String apellido;
        int edad;
        int numeroID;

        // Consigna 7 //

        public Estudiante(String nombre, String apellido, int edad, int numeroID){
            this.nombre=nombre;
            this.apellido=apellido;
            this.edad=edad;
            this.numeroID=numeroID;
        }
    }

    // Consigna 8 //

    public static class Libro{
        String titulo;
        String autor;
        int annoDePublicacion;
        String editorial;

        public Libro(String titulo, String autor, int annoDePublicacion, String editorial){
            this.titulo=titulo;
            this.autor=autor;
            this.annoDePublicacion=annoDePublicacion;
            this.editorial=editorial;
        }

        // Consigna 9 //

        static void showLibro(Libro lib1){
            System.out.println("Los datos del libro son: ");
            System.out.println("Título: "+lib1.titulo);
            System.out.println("Autor: "+lib1.autor);
            System.out.println("Año de publicación: "+lib1.annoDePublicacion);
            System.out.println("Editorial: "+lib1.editorial);
            System.out.print(" ");
        }
    }

    // Consigna 10 //

    public static class CuentaBancaria{
        int numeroDeCuenta;
        double saldo;
        String titular;

        public CuentaBancaria(int numeroDeCuenta, double saldo, String titular){
            this.numeroDeCuenta=numeroDeCuenta;
            this.saldo=saldo;
            this.titular=titular;
        }

        // Depósito de dinero //
        public void setSaldoDeposito(double saldo, double deposito) {
            this.saldo = saldo+deposito;
        }

        // Extracción de dinero //
        public void setSaldoExtraccion(double saldo, double extract){
            this.saldo = saldo-extract;
        }
    }

    // Consigna 12 //

    public static class Rectangulo{
        double ancho;
        double alto;

        public Rectangulo(double ancho, double alto){
            this.ancho=ancho;
            this.alto=alto;
        }

        static double PerimeterRectangle(double ancho, double alto){
            double perim;

            perim=2*ancho+2*alto;

            return perim;
        }

        static double AreaRectangle(double ancho, double alto){
            double area;

            area=ancho*alto;

            return area;
        }
    }

    // Consigna 13 //

    public static class Coche{
        String marca;
        String modelo;
        int annoDeFabricacion;
        String color;
        String curentSpeed;

        public Coche(String marca, String modelo, int annoDeFabricacion, String color, String curentSpeed){
            this.marca=marca;
            this.modelo=modelo;
            this.annoDeFabricacion=annoDeFabricacion;
            this.color=color;
            this.curentSpeed=curentSpeed;
        }
        public void setCurentSpeed(String curentSpeed, int decision){
            if (decision == 1){
                this.curentSpeed="Acelerado";
            }else{
                this.curentSpeed="Frenado";
            }
        }
    }

    // Consigna 15 //

    public static class Pelicula{
        String tituloP;
        String director;
        int duracionEnMin;
        String genero;

        public Pelicula(String tituloP, String director, int duracionEnMin, String genero){
            this.tituloP=tituloP;
            this.director=director;
            this.duracionEnMin=duracionEnMin;
            this.genero=genero;
        }

        static void showPelicula(Pelicula Pel1){
            System.out.println("Los datos de la película son: ");
            System.out.println("Título: "+Pel1.tituloP);
            System.out.println("Director: "+Pel1.director);
            System.out.println("Duración en minutos: "+Pel1.duracionEnMin);
            System.out.println("Género: "+Pel1.genero);
            System.out.print(" ");
        }
    }
}