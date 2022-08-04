package patrones.creacionales.singleton;

public class Main {

    public static void main(String[] args) {
        //Singleton singleton = new Singleton();
        //singleton.setContador(15);
        //System.out.println(singleton.getContador());
        //System.out.println(singleton); //Direccion de memoria


        //Singleton singleton2 = new Singleton();
        //singleton2.setContador(10);
        //System.out.println(singleton2.getContador());
        //System.out.println(singleton2); //Direccion de memoria

//El patron singleton lo que pretende evitar es que se creen nuevas instancias. Por tanto se tiene que operar con la primera instancia que ya habiamos creado

        Singleton singleton = Singleton.getInstance(); //Invocando a la clase estatica y a getInstance tendremos una unica instancia de Singleton

        singleton.setContador(15);

        Singleton singleton1 = Singleton.getInstance();

        singleton1.setContador(20);

        System.out.println("valor: " + singleton.getContador() + " memoria: " + singleton);
        System.out.println("valor: " + singleton1.getContador() + " memoria: " + singleton1);



        ///////////////////////EJEMPLO////////////////////

        Aplicacion aplicacion = Aplicacion.getInstance(); //new Aplicacion()
        aplicacion.run();
        Aplicacion aplicacion1 = Aplicacion.getInstance(); //aplicacion1 = aplicacion
        aplicacion1.run();

        System.out.println(aplicacion + " " + aplicacion1);

    }
}
