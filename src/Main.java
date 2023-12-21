import java.util.Scanner;

//@author: Mauricio Restrepo Marin

public class Main {
    public static void main(String[] args) {

        //Definimos los atributos de la Comanda como vacios:

        String nombre = "Sin-Name";
        int opcion;

        String patatas = "Sin-Patatas";
        String proteinas = "Sin-Proteinas";
        String salsas = "Sin-Salsas";
        String toppings = "Sin-Topings";

        //INICIO

            Scanner scanner = new Scanner(System.in);

            System.out.println(
                    "BIENVENIDO A PATATAS AL AIRE AXM \n    !Armalas Como Quieras!"
            );

            System.out.println("\nPara iniciar, cuentanos como te llamas?: ");
            nombre = scanner.next();

            do {
            System.out.println("\nBien " + nombre + ", selecciona la opcion que consideres a continuacion:");

            System.out.println("\nIngresa: 1. Para Patatas armadas de la casa");
            System.out.println("Ingresa: 2. Para crear tus Patatas personalizadas, paso a paso!");

                opcion = scanner.nextInt();

                if (opcion == 1) {

                System.out.println("Carta Patatas");

                } else if (opcion == 2) {

                System.out.println("\nBien " + nombre + ", Ahora elige tus ingredientes.");

                // Muestra menu y construye la comanda

                ComandaMenu comandaMenu = new ComandaMenu();

                patatas = comandaMenu.Paso1Patatas(); // El metodo retorna el tipo de Papas deseadas por el usuario...
                proteinas = comandaMenu.Paso2Proteinas(); // El metodo retorna el tipo de Proteinas deseadas por el usuario...
                salsas = comandaMenu.Paso3Salsas(); // El metodo retorna el tipo de Salsas deseadas por el usuario..
                toppings = comandaMenu.Paso4Toppings(); // El metodo retorna el tipo de Toppings deseados por el usuario..

                //Imprime la Comanda

                System.out.println(nombre + " " + patatas + " " + proteinas + " " + salsas + " "+ toppings);

                } else {
                System.out.println("Selecciona una opcion disponible!");
                }
            } while (opcion != 1 && opcion != 2);
    }
}