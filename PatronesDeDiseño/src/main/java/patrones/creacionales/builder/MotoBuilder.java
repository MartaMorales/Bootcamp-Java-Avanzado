package patrones.creacionales.builder;

public class MotoBuilder {

    Vehiculo vehiculo;

    private MotoBuilder() {
    }

    public MotoBuilder(String marca) {
        vehiculo = new Vehiculo();
        vehiculo.setMarca(marca);
    }

    public MotoBuilder setMotor(String motor){
        vehiculo.setMotor(motor);
        return this;
    }
    public MotoBuilder setTipo(String tipo){
        vehiculo.setTipo(tipo);
        return this;
    }

    public Vehiculo build(){
        return vehiculo;
    }

}
