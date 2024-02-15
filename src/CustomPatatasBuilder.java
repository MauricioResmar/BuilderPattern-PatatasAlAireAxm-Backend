/*
   En esta ocasión, implemento el Builder (Subclase) concreto, para la construcción del objeto
   Patatas Tipo:(Personalizadas paso a paso 4/4), accediendo a los respectivos metodos Setter
   de la Clase POJO (Patatas) a petición directa desde el main.java, recibiendo así
   cómo parámetros, los datos de los correspondientes campos o atributos del objeto Patatas.
*/
public class CustomPatatasBuilder {
    Patatas patatas;
    public CustomPatatasBuilder(String papas) {
        patatas = new Patatas();
        patatas.setPatatas(papas);
    }
    public CustomPatatasBuilder SetProteina(String proteina) {
        patatas.setProteinas(proteina);
        return this;
    }
    public CustomPatatasBuilder SetSalsa(String salsas) {
        patatas.setSalsas(salsas);
        return this;
    }
    public CustomPatatasBuilder SetTopping(String toppings) {
        patatas.setToppings(toppings);
        return this;
    }
    public Patatas build() {
        return this.patatas;
    }
}