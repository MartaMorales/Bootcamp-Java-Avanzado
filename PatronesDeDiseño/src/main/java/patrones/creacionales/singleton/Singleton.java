package patrones.creacionales.singleton;

public class Singleton {

    private static Singleton singleton;
    int contador;

    private Singleton(){} //Lo hacemos privado para que no se pueda instanciar

    public static Singleton getInstance(){
        if(singleton == null) {
            singleton = new Singleton();

            //Solo se podra llamar al constructor desde este metodo y nunca al propio constructor. De esta manera nos
            //aseguramos de que la instancia sea unica
        }
        //Si nuestra variable estatica es null creamos una nueva que sera la unica instancia que se pueda crear
        //Si esta variable no es nula, devolveremos la instancia ya creada
        return singleton;
    }
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }



}
