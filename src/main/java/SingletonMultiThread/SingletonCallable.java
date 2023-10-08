package SingletonMultiThread;

import java.util.concurrent.Callable;

public class SingletonCallable implements Callable<MultiSingleton> {
    @Override
    public MultiSingleton call() throws Exception{
        MultiSingleton objMultiSingleton = MultiSingleton.getInstance();
        return objMultiSingleton;
    }
}
