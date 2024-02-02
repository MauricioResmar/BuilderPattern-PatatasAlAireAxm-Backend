import java.util.Scanner;

public class ComandaMenuCarta {
    Scanner scanner = new Scanner(System.in);
    String cartaPatatas = null;
    int numElement;

    public ComandaMenuCarta() {}
    public String getCartaPatatas() {
        do  {

            System.out.println("\nSelecciona a continuacion el plato que desees\n Nuestras Recomendadas son:");

            System.out.println("\n1). - AZTECA:");
            System.out.println("\nPatatas de tu eleccion acompanada de cubo de Pollo a la plancha, Salsa Chipotle (Picante suave), \nSour Cream, Guacamole Fresco y Pico de Gallo.");
            System.out.println("\nPrecio (Cop): $18.800");

            System.out.println("\n2). - NUESTRA TIERRA:");
            System.out.println("\nPatatas de tu eleccion acompanada de Cubo de Chicharron crocante, Chorizo de cerdo, salsa showy, \nAjo (Deliciosa combinacion mayo, especias, y un toque de ajo), Trocitos de Platano maduro y huevo frito.");
            System.out.println("\nPrecio (Cop): $20.100");

            System.out.println("\n3). - GRINGAS:");
            System.out.println("\nPatatas de tu eleccion acompanada de Salchicha Americana, Salsa Barbacoa honey, (BBQ con una reduccion de miel), \nMaiz dulce desgranado y Queso Mozzarella fundido.");
            System.out.println("\nPrecio (Cop): $17.000");

            System.out.println("\n4). - CUBANAS:");
            System.out.println("\nPatatas de tu eleccion acompanadas de nuestra inigualable Ropa vieja, Salsa Showy (Deliciosa combinacion mayo, especias y un toque de ajo),\n Trocitos de Platano Maduro.");
            System.out.println("\nPrecio (Cop): $15.700");

            System.out.println("\n5). - PATATAS DUO:");
            System.out.println("\n2 Patatas, 2 Proteinas, 2 Salsas, 2 Toppings. ¡Un plato perfecto para compartir!");
            System.out.println("\nPrecio (Cop): $30.000");

            System.out.println("\n6). - PATATAS KIDS:");
            System.out.println("\nPatatas Smile, croquetas de Pollo, Salsa Dulce de Maiz, Huevo de Codorniz.");
            System.out.println("\nPrecio (Cop): $16.200");

            System.out.println("\nIngrese porfavor el numero correspondiente al plato deseado:");
            numElement = scanner.nextInt();

            switch (numElement) {
                case 1 -> cartaPatatas = "AZTECA";
                case 2 -> cartaPatatas = "NUESTRA TIERRA";
                case 3 -> cartaPatatas = "GRINGAS";
                case 4 -> cartaPatatas = "CUBANAS";
                case 5 -> cartaPatatas = "PATATAS DUO";
                case 6 -> cartaPatatas = "PATATAS KIDS";
                default -> System.out.println("Lo siento, la opcion ingresada no es valida. Intenta nuevamente.");
            }

        } while (numElement != 1 && numElement != 2 && numElement != 3 && numElement != 4 && numElement != 5 && numElement != 6 );

        return this.cartaPatatas;
    }
}
