package SingletonMultiThread;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) {

        SingletonCallable obj1 = new SingletonCallable();
        SingletonCallable obj2 = new SingletonCallable();
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<MultiSingleton> sObj1 = executorService.submit(obj1);
        Future<MultiSingleton> sObj2 = executorService.submit(obj2);

        try{
            System.out.println(sObj1.get());
            System.out.println(sObj2.get());
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }

        executorService.shutdown();
    }
}
