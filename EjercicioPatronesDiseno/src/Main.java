public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.run();

        Singleton singleton1 = Singleton.getInstance();

        singleton.run();

        System.out.println("Singleton: " + singleton + " Singleton1: " + singleton1);

    }
}
