import java.util.Scanner;

//@author: Mauricio Restrepo Marin

public class Main {
    public static void main(String[] args) {

        //Definimos los atributos de la Comanda como vacios:

        String nombreUser = "Sin-Name";
        int opcionTipoMenu;
        String cartaPatatas = null;

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

                opcionTipoMenu = scanner.nextInt();

                if (opcionTipoMenu == 1) {

                    System.out.println("Hola "  + nombreUser + " bienvenid@ a nuestra Carta de Patatas Axm!");

                    ComandaMenuCarta comandaMenuCarta = new ComandaMenuCarta();
                    cartaPatatas = comandaMenuCarta.getCartaPatatas();

                    //Una vez conocemos el constructor concreto, se lo entregamos como parámetro a la director Class PatatasDirector
                    PatatasDirector patatasDirector = new PatatasDirector();

                    switch (cartaPatatas){
                        case "AZTECA":
                        patatasDirector.setBuilder(new AztecaPatatasBuilder());
                        buildPatatas(patatasDirector);
                        break;

                        case "NUESTRA TIERRA":
                        patatasDirector.setBuilder(new NuestraTierraPatatasBuilder());
                        buildPatatas(patatasDirector);
                        break;

                    }

                    System.out.println("Construccion del objeto: " + cartaPatatas + " fue satisfactorio y sera atendido lo mas pronto posible, gracias!");

                } else if (opcionTipoMenu == 2) {

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
            } while (opcionTipoMenu != 1 && opcionTipoMenu != 2);
    }
    private static void buildPatatas(PatatasDirector patatasDirector){
        Patatas patatas = patatasDirector.buildPatatas();
        patatas.print();
    }
}