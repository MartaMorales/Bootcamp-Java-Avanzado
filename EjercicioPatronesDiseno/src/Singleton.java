import java.util.Objects;

public class Singleton{

    private static Singleton singleton;

    boolean isRunning = false;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(Objects.isNull(singleton)){
            singleton = new Singleton();
        }

        return singleton;
    }

    public void run(){
        if(!isRunning)
            isRunning = true;
        else
            System.out.println("Ya estaba en ejecucion");
    }
}
