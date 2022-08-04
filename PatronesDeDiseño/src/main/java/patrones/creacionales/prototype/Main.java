package patrones.creacionales.prototype;

public class Main {

    public static void main(String[] args) {

        //Tiene como objetivo clonarse a si mismo y que ese clon herede de su propio clon,
        //su estado y sus tipos

        Coche coche = new Coche();
        coche.puertas = 5;
        coche.modelo = "Qashqai";
        coche.marca = "Nissan";

        System.out.println(coche.marca + " " + coche.modelo + " " + coche.puertas);

//        Coche clonado = coche.clonar();
//        clonado.puertas = 3;
//
//        System.out.println(clonado.marca + " " + clonado.modelo + " " + clonado.puertas);

// Otra manera de implementar prototype es utilizando una interfaz que ya da java

        try {
            Coche clonado = coche.clonar();
            clonado.puertas = 3;
            System.out.println(clonado.marca + " " + clonado.modelo + " " + clonado.puertas);

        }catch (Exception e){
            e.getMessage();
        }
    }
}
