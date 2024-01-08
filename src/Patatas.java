
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
            "Construccion de patatas finalizada! " + "\n" +
                    "Patatas: " + patatas +
                    " - Proteinas: " + proteinas +
                    " - Salsas: " + salsas +
                    " - Toppings: " + toppings);

    }
}
