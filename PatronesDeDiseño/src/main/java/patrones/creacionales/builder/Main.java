package patrones.creacionales.builder;

public class Main {

    public static void main(String[] args) {
        // El patron builder permite crear objetos concretos en un solo paso

//        Vehiculo vehiculo = new Vehiculo();
//        vehiculo.setMarca("Nissan");
//        vehiculo.setMotor("Gasolina");
//        vehiculo.setTipo("Combustion");
//        vehiculo.setPuertas(5);

        Vehiculo coche = new CocheBuilder("Nissan")
                .setPuertas(5)
                .setMotor("Combustion")
                .setTipo("Gasolina")
                .build();

        System.out.println(coche.toString());


        Vehiculo moto = new MotoBuilder("Ducati")
                .setMotor("Electrico")
                .setTipo("Electrico")
                .build();

        System.out.println(moto.toString());
    }
}
