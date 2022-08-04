package patrones.creacionales.factory;

public class Main {

    public static void main(String[] args) {

        //Cohesiona una jerarquia de clases en una sola

        PrecioFactory precio = new PrecioFactory("Espanha");
        System.out.println(precio.getPrecio());

        PrecioFactory precio2 = new PrecioFactory("USA");
        System.out.println(precio2.getPrecio());

        PrecioFactory precio3 = new PrecioFactory("UK");
        System.out.println(precio3.getPrecio());


    }
}
