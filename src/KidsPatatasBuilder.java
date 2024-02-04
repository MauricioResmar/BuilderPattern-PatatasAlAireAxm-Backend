//En esta ocasión, implemento el Builder (Subclase) concreto #6, para la construcción del objeto Patatas Tipo:(PatatasKids), accediendo a los respectivos metodos Setter de la Clase POJO: Patatas y a petición de la Clase Director.

public class KidsPatatasBuilder extends PatatasBuilder {
    @Override
    void buildPatata() {
        patatas.setPatatas("Patatas Smile");
    }

    @Override
    void buildProteina() {
        patatas.setProteinas("croquetas de Pollo");
    }

    @Override
    void buildSalsa() {
        patatas.setSalsas("Salsa Dulce de Maiz");
    }

    @Override
    void buildTopping() {
        patatas.setToppings("Huevo de Codorniz");
    }
}
