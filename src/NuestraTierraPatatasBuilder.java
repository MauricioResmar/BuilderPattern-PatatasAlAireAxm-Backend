//En esta ocasión, implemento el Builder (Subclase) concreto #2, para la construcción del objeto Patatas Tipo:(Nuestra Tierra), accediendo a los respectivos metodos Setter de la Clase POJO: Patatas y a petición de la Clase Director.

public class NuestraTierraPatatasBuilder extends PatatasBuilder {
    @Override
    void buildPatata() {
        patatas.setPatatas("Francesa");
    }

    @Override
    void buildProteina() {
        patatas.setProteinas("Cubo de Chicharron crocante, Chorizo de cerdo");
    }

    @Override
    void buildSalsa() {
        patatas.setSalsas("Salsa Showy, (Deliciosa combinacion mayo, especias, y un toque de ajo)");
    }

    @Override
    void buildTopping() {
        patatas.setToppings("Trocitos de Platano maduro y huevo frito");
    }
}
