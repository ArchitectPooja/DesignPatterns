package SingletonMultiThread;

public class MultiSingleton {
    private static MultiSingleton objMultiSingleton = null;
    private MultiSingleton(){}

    public static MultiSingleton getInstance(){
        if(objMultiSingleton == null){ //first check
            synchronized (MultiSingleton.class) {
                if (objMultiSingleton == null) { // 2nd check.
                    objMultiSingleton = new MultiSingleton(); //Critical Section.
                }
            }
        }
        return objMultiSingleton;
    }

    //this implementation will work in Multithreaded environment.
    //Performance is not good.
}
