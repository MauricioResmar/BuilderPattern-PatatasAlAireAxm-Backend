//En esta ocasión, implemento el Builder (Subclase) concreto #3, para la construcción del objeto Patatas Tipo:(Gringas), accediendo a los respectivos metodos Setter de la Clase POJO: Patatas y a petición de la Clase Director.

public class GringasPatatasBuilder extends PatatasBuilder {
    @Override
    void buildPatata() {
        patatas.setPatatas("Yuca");
    }

    @Override
    void buildProteina() {
        patatas.setProteinas("Salchicha Americana");
    }

    @Override
    void buildSalsa() {
        patatas.setSalsas("Salsa Barbacoa honey, (BBQ con una reduccion de miel)");
    }

    @Override
    void buildTopping() {
        patatas.setToppings("Maiz dulce desgranado y Queso Mozzarella fundido");
    }
}
