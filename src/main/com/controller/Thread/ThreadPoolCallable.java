

import java.util.concurrent.Callable;

public class ThreadPoolCallable implements Callable {
    public String call() throws Exception {
        return "abc";
    }
}
