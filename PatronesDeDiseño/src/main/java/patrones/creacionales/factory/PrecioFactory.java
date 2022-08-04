package patrones.creacionales.factory;

public class PrecioFactory {

    //Implementacion de la interfaz
    Precio precio;

    private PrecioFactory() {
    } //Hacemos el constructor privado

    //Creamos un constructor que reciba por parametro el pais para poder
    //utilizar una clase u otra dependiendo de el
    public PrecioFactory(String pais) {
        if(pais.equalsIgnoreCase("Espanha")) {
            System.out.println("España, precio en EUR");
            this.precio = new PrecioEUR();
        }else if(pais.equalsIgnoreCase("UK")){
            System.out.println("UK, precio en GBP");
            this.precio = new PrecioGBP();
        }else{
            System.out.println("Otro pais, precio en USD");
            precio = new PrecioUSD();
        }
    }

    public double getPrecio(){
        return precio.getPrecio();
    }
}
