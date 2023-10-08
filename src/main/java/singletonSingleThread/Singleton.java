package singletonSingleThread;

public class Singleton {
    private static Singleton objSingleton = null;
    private Singleton(){}

    public static Singleton getInstance(){
        if(objSingleton == null){
            objSingleton = new Singleton();
        }
        return objSingleton;
    }
}
