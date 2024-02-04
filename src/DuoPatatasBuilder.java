//En esta ocasión, implemento el Builder (Subclase) concreto #5, para la construcción del objeto Patatas Tipo:(PatatasDuo), accediendo a los respectivos metodos Setter de la Clase POJO: Patatas y a petición de la Clase Director.

public class DuoPatatasBuilder extends PatatasBuilder {
    @Override
    void buildPatata() {
        patatas.setPatatas("2 Patatas");
    }

    @Override
    void buildProteina() {
        patatas.setProteinas("2 Proteinas");
    }

    @Override
    void buildSalsa() {
        patatas.setSalsas("2 Salsas");
    }

    @Override
    void buildTopping() {
        patatas.setToppings("2 Toppings. Un plato perfecto para compartir!");
    }
}
