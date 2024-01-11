import java.util.Scanner;

//@author: Mauricio Restrepo Marin

public class Main {
    public static void main(String[] args) {

        //Definimos los atributos de la Comanda como vacios:

        String nombreUser = "Sin-Name";
        int opcion;

        String nombrePlato = "Sin-plato";

        String patatas = "Sin-Patatas";
        String proteinas = "Sin-Proteinas";
        String salsas = "Sin-Salsas";
        String toppings = "Sin-Topings";

        //INICIO

            Scanner scanner = new Scanner(System.in);

            System.out.println(
                    "\nBIENVENIDO A PATATAS AL AIRE AXM \n    !Armalas Como Quieras!"
            );

            System.out.println("\nPara iniciar, cuentanos como te llamas?: ");
            nombreUser = scanner.next();

            do {
            System.out.println("\nBien " + nombreUser + ", selecciona la opcion que consideres a continuacion:");

            System.out.println("\nIngresa: 1. Para Patatas Armadas de la Casa");
            System.out.println("Ingresa: 2. Para Crear tus propias Patatas Personalizadas, paso a paso!");

                opcion = scanner.nextInt();

                if (opcion == 1) {

                System.out.println("Hola " +nombreUser + ", bienvenid@ a nuestra Carta de Patatas Axm!");
                    System.out.println("\nSelecciona a continacion el plato que desees\n Nuestras Recomendadas son:");

                            System.out.println("\n1). - AZTECA:");
                            System.out.println("\nPatatas de tu eleccion acompanada de cubo de Pollo a la plancha, Salsa Chipotle (Picante suave), Sour Cream, Guacamole Fresco y Pico de Gallo.");

                            System.out.println("\n2). - NUESTRA TIERRA:");
                            System.out.println("\nPatatas de tu eleccion acompanada de Cubo de Chicharron crocante, Chorizo de cerdo, salsa showy, Ajo (Delicios combinacion mayo, especias, y un toque de ajo), Trocitos de Platano maduro y huevo frito.");

                } else if (opcion == 2) {

                System.out.println("\nBien " + nombreUser + ", Ahora elige tus ingredientes.");

                // Muestra menu y construye la comanda

                ComandaMenu comandaMenu = new ComandaMenu();

                patatas = comandaMenu.Paso1Patatas(); // El metodo retorna el tipo de Papas deseadas por el usuario...
                proteinas = comandaMenu.Paso2Proteinas(); // El metodo retorna el tipo de Proteinas deseadas por el usuario...
                salsas = comandaMenu.Paso3Salsas(); // El metodo retorna el tipo de Salsas deseadas por el usuario..
                toppings = comandaMenu.Paso4Toppings(); // El metodo retorna el tipo de Toppings deseados por el usuario..

                //Imprime la Comanda

                System.out.println(nombreUser + " " + patatas + " " + proteinas + " " + salsas + " "+ toppings);

                } else {
                System.out.println("Selecciona una opcion disponible!");
                }
            } while (opcion != 1 && opcion != 2);
    }
}