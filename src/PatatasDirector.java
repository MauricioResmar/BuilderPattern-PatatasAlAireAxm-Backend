/*
*  ClASE DIRECTOR.
*
*  La clase Director en el patrón de diseño Builder, coordina el proceso de construcción
*  de un objeto complejo mediante la utilización de un objeto Builder, facilitando así
*  la creación de diferentes variaciones del objeto sin exponer los detalles internos
*  de su construcción al cliente.
*/

public class PatatasDirector {

    //Creamos una variable privada del tipo Builder Abstracto
    private PatatasBuilder patatasBuilder;

    /*
     *  Creamos un metodo setBuilder al cual le entregamos la variable privada patatasBuilder
     *   para decirle que le asigne a éste el valor actual de la instancia, mediante this.
     *   actualizando así su valor al valor actual de la instancia.
    */
    public void setBuilder(PatatasBuilder patatasBuilder) {this.patatasBuilder = patatasBuilder;}

    //Generamos EL metodo buildPatatas el cual retornara un objeto del tipo de la Clase POJO Patatas

    public Patatas buildPatatas() {
    /* Invocamos a continuación los metodos abstractos creados en el constructor (Builder) Abtracto
       PatatasBuilder y retornamos el Objeto patatas de tipo Patatas mediante el metodo build() */

        patatasBuilder.buildPatata();
        patatasBuilder.buildProteina();
        patatasBuilder.buildSalsa();
        patatasBuilder.buildTopping();

        return patatasBuilder.build();
    }
}
