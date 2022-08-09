package patrones.estructurales.adapter;

public class Main {

    public static void main(String[] args) {
        Horno horno = new Horno();

        Lampara lampara = new Lampara();

        PowerAdapter lightbulb = new PowerAdapter();

        enciende(horno);
        enciende(lampara);
        enciende(lightbulb);
    }

    public static void enciende(Enchufable enchufable) {
        enchufable.enciende();
    }

    public static void apaga(Enchufable enchufable) {
        enchufable.apaga();
    }

    public static boolean isEncendido(Enchufable enchufable) {
        return enchufable.isEncendido();
    }
}
