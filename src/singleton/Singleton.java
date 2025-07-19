package singleton;

public class Singleton {
    private static volatile Singleton instance = null ; // Eager Fetch instance = Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton(); // Lazy Fetch
                }
            }
        }
        return instance;
    }
}
