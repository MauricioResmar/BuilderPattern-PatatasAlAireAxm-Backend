//En esta ocasión, implemento el Builder (Subclase) concreto #4, para la construcción del objeto Patatas Tipo:(Cubanas), accediendo a los respectivos metodos Setter de la Clase POJO: Patatas y a petición de la Clase Director.

public class CubanasPatatasBuilder extends PatatasBuilder {
    @Override
    void buildPatata() {
        patatas.setPatatas("Bola");
    }

    @Override
    void buildProteina() {
        patatas.setProteinas("Ropa vieja");
    }

    @Override
    void buildSalsa() {
        patatas.setSalsas("Salsa Showy (Deliciosa combinacion mayo, especias y un toque de ajo)");
    }

    @Override
    void buildTopping() {
        patatas.setToppings("Trocitos de Platano Maduro");
    }
}
