package patrones.creacionales.prototype;

public class Coche implements Cloneable{

    public String marca;
    public String modelo;
    int puertas;

    public Coche() {
    }

    public Coche clonar() throws CloneNotSupportedException{
//        Coche clone = new Coche();
//        clone.marca = this.marca;
//        clone.modelo = this.modelo;
//        clone.puertas = this.puertas;

        return (Coche)this.clone();

    }
}
