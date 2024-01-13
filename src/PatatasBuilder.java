/*
 Generamos el constructor abstracto, el cual define los metodos a implementar como minimo
 y posteriormente por el constructor concreto a utilizar.
 *///CONSTRUCTOR ABSTRACTO SUPER-CLASE

public abstract class PatatasBuilder {
    Patatas patatas = new Patatas();

    abstract void buildPatata();
    abstract void buildProteina();
    abstract void buildSalsa();
    abstract void buildTopping();

    Patatas build(){
        return patatas;
    }
}
