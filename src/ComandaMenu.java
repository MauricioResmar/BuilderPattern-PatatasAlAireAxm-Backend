import java.util.Scanner;

public class ComandaMenu {
    String patatas;
    String proteinas;
    String salsas;
    String toppings;
    Scanner scanner = new Scanner(System.in);
    public String Paso1Patatas() {

        System.out.println("\nPaso 1 Seleccion de Patatas: ");

        System.out.println("\n1). Francesa.....................$5.500");
        System.out.println("\n2). Rustica......................$5.500");
        System.out.println("\n3). Rizada.......................$5.500");
        System.out.println("\n4). Criolla......................$5.500");
        System.out.println("\n5). Bola.........................$5.500");
        System.out.println("\n6). Smile........................$5.500");
        System.out.println("\n7). Crisper......................$5.500");
        System.out.println("\n8). Crocantes de Yuca............$5.500");

        System.out.println("\nEscoge las Patatas que deseas, ingresando el numero: ");

        patatas = scanner.next();

        switch (patatas) {
            case "1":
                patatas = "Francesa";
                break;

            case "2":
                patatas = "Rustica";
                break;

            case "3":
                patatas = "Rizada";
                break;

            case "4":
                patatas = "Criolla";
                break;

            case "5":
                patatas = "Bola";
                break;

            case "6":
                patatas = "Smile";
                break;

            case "7":
                patatas = "Crisper";
                break;

            case "8":
                patatas = "Crocantes de Yuca";
                break;
        }
        return this.patatas;
    }
    public String Paso2Proteinas() {
        System.out.println("\nPaso 2 Seleccion de Proteinas: ");

        System.out.println("\n1). Cubos de Chicharron..........$5.500");
        System.out.println("\n2). Falafel......................$5.000");
        System.out.println("\n3). Salchicha Americana..........$5.500");
        System.out.println("\n4). Chorizo......................$5.500");
        System.out.println("\n5). Tocineta.....................$5.500");
        System.out.println("\n6). Croquetas de Pollo...........$6.000");
        System.out.println("\n7). Cubos de Pollo...............$6.000");
        System.out.println("\n8). Ropa Vieja...................$6.000");
        System.out.println("\n9). Costillas en trozos..........$6.000");

        System.out.println("\nEscoge la proteina que deseas, ingresando el numero: ");

        proteinas = scanner.next();

        switch (proteinas) {

            case "1":
                proteinas = "Cubos de Chicharron";
                break;

            case "2":
                proteinas = "Falafel";
                break;

            case "3":
                proteinas = "Salchicha Americana";
                break;

            case "4":
                proteinas = "Chorizo";
                break;

            case "5":
                proteinas = "Tocineta";
                break;

            case "6":
                proteinas = "Croquetas de Pollo";
                break;

            case "7":
                proteinas = "Cubos de Pollo";
                break;

            case "8":
                proteinas = "Ropa Vieja";
                break;

            case "9":
                proteinas = "Costillas en trozos";
                break;
        }
        return this.proteinas;
    }
    public String Paso3Salsas() {
        System.out.println("\nPaso 3 Seleccion de Salsas: ");

        System.out.println("\n1).  Barbacoa Honey...............$1.800");
        System.out.println("\n2).  Mustard Honey................$1.800");
        System.out.println("\n3).  Chipotle.....................$1.800");
        System.out.println("\n4).  Pina.........................$1.800");
        System.out.println("\n5).  Tomate.......................$1.900");
        System.out.println("\n6).  Rosada.......................$1.900");
        System.out.println("\n7).  Showy........................$1.900");
        System.out.println("\n8).  Showy Ajo....................$1.900");
        System.out.println("\n9).  Dulce Maiz...................$2.000");
        System.out.println("\n10). Mayo Ahumada.................$2.000");
        System.out.println("\n11). Salsa Cheddar................$2.000");
        System.out.println("\n12). Sour Cream...................$2.300");

        System.out.println("\nEscoge las Salsas deseas agregar a tu pedido, ingresando el numero: ");

        salsas = scanner.next();

        switch (salsas) {

            case "1":
                salsas = "Barbacoa Honey";
                break;

            case "2":
                salsas = "Mustard Honey";
                break;

            case "3":
                salsas = "Chipotle";
                break;

            case "4":
                salsas = "Pina";
                break;

            case "5":
                salsas = "Tomate";
                break;

            case "6":
                salsas = "Rosada";
                break;

            case "7":
                salsas = "Showy";
                break;

            case "8":
                salsas = "Showy Ajo";
                break;

            case "9":
                salsas = "Dulce Maiz";
                break;

            case "10":
                salsas = "Mayo Ahumada";
                break;

            case "11":
                salsas = "Salsa Cheddar";
                break;

            case "12":
                salsas = "Sour Cream";

            default:
                System.out.println("Lo siento amig@, el valor ingresado no corresponde a una opcion valida!");
        }
        return this.salsas;
    }
    public String Paso4Toppings() {
        System.out.println("\nPaso 4 Seleccion de Toppings: ");

        System.out.println("\n1). Queso Mozarella...............$2.800");
        System.out.println("\n2). Huevo Frito...................$2.800");
        System.out.println("\n3). Guacamole.....................$2.800");
        System.out.println("\n4). Pico de Gallo.................$2.800");
        System.out.println("\n5). Jalapenos.....................$2.800");
        System.out.println("\n6). Huevos de Cordorniz...........$2.800");
        System.out.println("\n7). Maicitos......................$2.800");
        System.out.println("\n8). Maduritos.....................$2.800");

        System.out.println("\nEscoge los Toppings que deseas, ingresando los numeros correspondientes: ");

        toppings = scanner.next();

        toppings = switch (toppings) {
            case "1" -> "Queso Mozarella";
            case "2" -> "Huevo Frito";
            case "3" -> "Guacamole";
            case "4" -> "Pico de Gallo";
            case "5" -> "Jalapenos";
            case "6" -> "Huevos de Cordorniz";
            case "7" -> "Maicitos";
            case "8" -> "Maduritos";
            default -> toppings;
        };
        return this.toppings;
    }
}
