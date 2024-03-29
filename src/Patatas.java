
// POJO Class Patatas
public class Patatas {

    private String patatas = "Sin Patatas";

    private String proteinas = "Sin Proteinas";

    private String salsas = "Sin Salsas";

    private String toppings = "Sin Toppings";

    public String getPatatas() {
        return patatas;
    }

    public void setPatatas(String patatas) {
        this.patatas = patatas;
    }

    public String getProteinas() {
        return proteinas;
    }

    public void setProteinas(String proteinas) {
        this.proteinas = proteinas;
    }

    public String getSalsas() {
        return salsas;
    }

    public void setSalsas(String salsas) {
        this.salsas = salsas;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void print() {
        System.out.println(
                "Iniciando la construccion del objeto(), tipo Patatas solicitado..." + "\n" +
                        "Patatas: " + patatas +
                        " - Proteinas: " + proteinas +
                        " - Salsas: " + salsas +
                        " - Toppings: " + toppings);
    }
    public void printCustom() {
        System.out.println(
                "Iniciando la construccion del objeto(), tipo Patatas Custom, Paso a paso solicitado..." + "\n" +
                        "Patatas seleccionadas: " + patatas +
                        " - Proteinas seleccionadas: " + proteinas +
                        " - Salsas seleccionadas: " + salsas +
                        " - Toppings seleccionadas: " + toppings);
    }
}