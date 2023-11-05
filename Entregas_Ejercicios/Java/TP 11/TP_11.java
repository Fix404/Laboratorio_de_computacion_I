import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class TP_11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // TP 11 ArrayList y clases //

        // Consigna 1 //

        ArrayList<String> listOfCarBrands=new ArrayList<>();
        int addBrand=1;

        System.out.println("A continuación podrá agregar marcas de autos a la lista: ");
        System.out.print(" ");

        while (addBrand == 1){
            System.out.println("Ingrese una marca a la lista: ");
            String newBrand=sc.next();
            System.out.print(" ");
            TP_11.carBrandAdd(listOfCarBrands, newBrand);

            System.out.println("Para agregar otra marca ingrese 1, sino ingrese cualquier otro entero: ");
            addBrand=sc.nextInt();
        }

        System.out.println("La lista de marcas de auto es: ");
        for (String carbrand:listOfCarBrands){
            System.out.print(carbrand+", ");
        }
        System.out.println(" ");

        // Consigna 2 //

        ArrayList<EquipoDeFutbol> listaDeJugadores=new ArrayList<>();
        int playerCheck=1;

        while (playerCheck == 1 | playerCheck == 2 | playerCheck == 3) {
            System.out.println("Para agregar un jugador ingrese 1, para remover un jugador ingrese 2, " +
                    "para ver la lista ingrese 3. Para salir ingrese cualquier otro número: ");
            playerCheck=sc.nextInt();

            if (playerCheck == 1){

                listaDeJugadores=EquipoDeFutbol.addPlayer(listaDeJugadores);

            } else if (playerCheck == 2) {

                listaDeJugadores=EquipoDeFutbol.removePlayer(listaDeJugadores);

            } else if (playerCheck == 3) {

                EquipoDeFutbol.showPlayers(listaDeJugadores);

            }else{
                System.out.println("Operación terminada");
                System.out.print(" ");
            }
        }

        // Consigna 3 //

        ArrayList<String> articulosFactura=new ArrayList<>(3);
        articulosFactura.add("Tornillo");
        articulosFactura.add("Tuerca");
        articulosFactura.add("Destornillador");

        ArrayList<Double> preciosUnitarios=new ArrayList<>(3);
        preciosUnitarios.add(250.30);
        preciosUnitarios.add(590.60);
        preciosUnitarios.add(6540.50);

        ArrayList<Integer> cantidadDeArt=new ArrayList<>(3);
        cantidadDeArt.add(500);
        cantidadDeArt.add(750);
        cantidadDeArt.add(5);

        Factura fact1=new Factura(332145, "12-03-2021", 2234,
                articulosFactura, preciosUnitarios,
                cantidadDeArt, 0.0, 0.21, 0.0 );

        int eleccionFactura=1;
        double subtotalFact, calcIva, total;

        while (eleccionFactura == 1 | eleccionFactura == 2 | eleccionFactura == 3 | eleccionFactura ==4){
            System.out.println("Elija la operación a realizar: ingrese 1 para agregar un producto a la factura," +
                    " ingrese 2 para calcular subtotal, ingrese 3 para calcular el I.V.A. de la factura, " +
                    "ingrese 4 para calcular el total de la factura, ingrese cualquier otro número para salir: ");
            eleccionFactura=sc.nextInt();
            System.out.print(" ");

            if (eleccionFactura == 1){

                fact1=Factura.addArticle(fact1, articulosFactura, preciosUnitarios, cantidadDeArt);
                System.out.println(Factura.articulos);
                System.out.print(" ");

            } else if (eleccionFactura == 2) {

                subtotalFact=Factura.calcularSubtotal(Factura.precioUnitario, Factura.cantArticulos);
                System.out.println("El subtotal es: "+subtotalFact);
                System.out.print(" ");

            } else if (eleccionFactura == 3) {

                calcIva=Factura.calcularIVA(Factura.precioUnitario, Factura.cantArticulos, fact1.iva);
                System.out.println("El I.V.A. de la compra es: "+calcIva);
                System.out.print(" ");
                
            } else if (eleccionFactura == 4) {

                total=Factura.calcularTotal(Factura.precioUnitario, Factura.cantArticulos, fact1.iva);
                System.out.println("El total de la compra es: "+total);
                System.out.print(" ");

            }else{
                System.out.println("Operación terminada");
                System.out.print(" ");
            }
        }

        // Consigna 4 //

        System.out.println("A continuación usted deberá ingresar veinte números decimales a la lista");
        System.out.print(" ");

        ArrayList<Double> listOfNumbers=new ArrayList<>(20);
        ArrayList<Double> rangeNumbers=new ArrayList<>(2);

        listOfNumbers=builderListaDeNumeros(listOfNumbers);

        rangeNumbers=biggestAndSmallestNumberFinder(listOfNumbers);

        // Consigna 5 //

        ArrayList<Integer> listOfRandomNumbers=new ArrayList<>(20);

        randomNumberAnalyzer(listOfRandomNumbers);

        // Fin TP 11 //
    }
    // Consigna 1 //

    public static ArrayList<String> carBrandAdd(ArrayList<String> listOfCarBrands, String brand){
        listOfCarBrands.add(brand);

        return listOfCarBrands;
    }

    // Consigna 2 //

    public static class EquipoDeFutbol{
        private String nombre;
        private String apellido;
        private int numero;

        public EquipoDeFutbol(String nombre, String apellido, int numero){
            this.nombre=nombre;
            this.apellido=apellido;
            this.numero=numero;
        }

        public static ArrayList<EquipoDeFutbol> addPlayer(ArrayList<EquipoDeFutbol> plantilla){
            Scanner sc=new Scanner(System.in);
            String nuevoNombre, nuevoApellido;
            int nuevoNumero;

            System.out.println("A continuación ingrese los datos del nuevo jugador: ");
            System.out.print(" ");
            System.out.println("Nombre: ");
            nuevoNombre=sc.next();
            System.out.print(" ");
            System.out.println("Apellido: ");
            nuevoApellido=sc.next();
            System.out.print(" ");
            System.out.println("Número: ");
            nuevoNumero=sc.nextInt();
            System.out.print(" ");

            EquipoDeFutbol nuevojug=new EquipoDeFutbol(nuevoNombre, nuevoApellido, nuevoNumero);

            plantilla.add(nuevojug);

            return plantilla;
        }

        public static ArrayList<EquipoDeFutbol> removePlayer(ArrayList<EquipoDeFutbol> plantilla){
            Scanner sc=new Scanner(System.in);
            int removePlayerNumber;

            System.out.println("A continuación ingrese el número del jugador a remover: ");
            removePlayerNumber=sc.nextInt();
            System.out.print(" ");

            for (EquipoDeFutbol playerCheck:plantilla){
                if (playerCheck.numero == removePlayerNumber){
                    plantilla.remove(playerCheck);
                }
            }

            return plantilla;
        }

        public static void showPlayers(ArrayList<EquipoDeFutbol> plantilla){
            System.out.println("La lista de jugadores actual es: ");
            System.out.print(" ");

            for (EquipoDeFutbol player:plantilla){
                System.out.println(player.nombre+" "+player.apellido+" usando la casaca "+player.numero);
                System.out.print(" ");
            }
        }

    }

    // Consigna 3 //

    public static class Factura{
        private int numeroFactura;
        private String fechaDeEmision;
        private int cliente;
        private static ArrayList<String> articulos;
        private static ArrayList<Double> precioUnitario;
        private static ArrayList<Integer> cantArticulos;
        private double subtotal;
        private double iva;
        private double total;

        public Factura(int numeroFactura, String fechaDeEmision, int cliente, ArrayList<String> articulos,
                       ArrayList<Double> precioUnitario,
                       ArrayList<Integer> cantArticulos, double subtotal, double iva, double total){
            this.numeroFactura=numeroFactura;
            this.fechaDeEmision=fechaDeEmision;
            this.cliente=cliente;
            this.articulos=articulos;
            this.precioUnitario=precioUnitario;
            this.cantArticulos=cantArticulos;
            this.subtotal=subtotal;
            this.iva=iva;
            this.total=total;
        }

        public static Factura addArticle(Factura facturaDatos, ArrayList<String> articulos, ArrayList<Double> precioUnitario,
                                         ArrayList<Integer> cantArticulos){
            Scanner sc= new Scanner(System.in);
            String nuevoArt;
            Double nuevoPrecioUnit;
            Integer nuevaCant;

            System.out.println("Agregue los datos correspondientes al artículo: ");
            System.out.print(" ");
            System.out.println("Nombre de artículo: ");
            nuevoArt=sc.next();
            System.out.print(" ");
            System.out.println("Precio unitario: ");
            nuevoPrecioUnit=sc.nextDouble();
            System.out.print(" ");
            System.out.println("Cantidad de artículo: ");
            nuevaCant=sc.nextInt();
            System.out.print(" ");

            articulos.add(nuevoArt);
            precioUnitario.add(nuevoPrecioUnit);
            cantArticulos.add(nuevaCant);

            Factura nuevaFact=new Factura(facturaDatos.numeroFactura, facturaDatos.fechaDeEmision,
                    facturaDatos.cliente, articulos, precioUnitario, cantArticulos,
                    facturaDatos.subtotal, facturaDatos.iva, facturaDatos.total);

            return nuevaFact;
        }

        public static double calcularSubtotal(ArrayList<Double> precioUnitario, ArrayList<Integer> cantArticulos){
            double subtotal=0;

            for (int i=0; i < precioUnitario.size(); i++ ){
                subtotal=subtotal+precioUnitario.get(i)*cantArticulos.get(i);
            }

            return subtotal;
        }
        
        public static double calcularIVA(ArrayList<Double> precioUnitario, 
                                         ArrayList<Integer> cantArticulos, double iva){
            double subTotal, subIva;
            
            subTotal=Factura.calcularSubtotal(precioUnitario, cantArticulos);
            
            subIva=subTotal*iva;
            
            return subIva;
        }

        public static double calcularTotal(ArrayList<Double> precioUnitario,
                                           ArrayList<Integer> cantArticulos, double iva){
            double subTotal, total;

            subTotal=Factura.calcularSubtotal(precioUnitario, cantArticulos);

            total=subTotal*(1+iva);

            return total;
        }
    }

    // Consigna 4 //

    public static ArrayList<Double> builderListaDeNumeros(ArrayList<Double> lista){
        Scanner sc=new Scanner(System.in);
        double number;

        for (int i=0; i < 20; i++){
            System.out.println("Ingrese el número correspondiente a la posición "+(i+1)+": ");
            number=sc.nextDouble();
            System.out.print(" ");
            lista.add(i, number);
        }

        return lista;
    }

    public static ArrayList<Double> biggestAndSmallestNumberFinder(ArrayList<Double> lista){
        double biggest=lista.get(0), smallest=lista.get(0), rango;
        ArrayList<Double> range=new ArrayList<>(2);

        for (int i=0; i < lista.size(); i++){
            if (biggest < lista.get(i)){
                biggest=lista.get(i);
            }

            if (smallest > lista.get(i)){
                smallest=lista.get(i);
            }
        }

        System.out.println("El menor valor de la lista es "+smallest+" y el mayor es "+biggest);
        System.out.print(" ");

        rango=biggest-smallest;
        System.out.println("El rango entre el menor y el mayor es "+rango);
        System.out.print(" ");
        range.add(smallest);
        range.add(biggest);

        return range;
    }

    // Consigna 5 //

    public static void randomNumberAnalyzer(ArrayList<Integer> lista){
        double sum=0, average;
        int belowCounter=0, aboveCounter=0, matchCounter=0;
        int randomNumber;

        for (int i=0; i < 20; i++){
            randomNumber=(int) (Math.random()*(100-1+1));
            lista.add(i, randomNumber);
        }

        for (int j=0; j < 20; j++){
            sum=lista.get(j);
        }
        average=sum/20;

        for (int k=0; k < 20; k++){
            if (lista.get(k) > average){
                aboveCounter+=1;
            } else if (lista.get(k) < average) {
                belowCounter+=1;
            }else{
                matchCounter+=1;
            }
        }

        System.out.println("El promedio aritmético de la lista vale: ");
        System.out.println(average);
        System.out.print(" ");

        System.out.println("La cantidad de números iguales al promedio son: ");
        System.out.println(matchCounter);
        System.out.print(" ");

        System.out.println("La cantidad de números mayores al promedio son: ");
        System.out.println(aboveCounter);
        System.out.print(" ");

        System.out.println("La cantidad de números menores al promedio son: ");
        System.out.println(belowCounter);
        System.out.print(" ");
    }
}