//En esta ocasión, implemento el Builder (Subclase) concreto #1, para la construcción del objeto Patatas Tipo:(Azteca), accediendo a los respectivos metodos Setter de la Clase POJO: Patatas y a petición de la Clase Director.

public class AztecaPatatasBuilder extends PatatasBuilder {
    @Override
    void buildPatata() {
        patatas.setPatatas("Rizada");
    }

    @Override
    void buildProteina() {
        patatas.setProteinas("Cubo de Pollo a la Plancha");
    }

    @Override
    void buildSalsa() {
        patatas.setSalsas("Salsa Chipotle, Sour Cream, Guacamole fresco");
    }

    @Override
    void buildTopping() {
        patatas.setToppings("Pico de Gallo");
    }
}
