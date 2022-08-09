package my.listener;

import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class Listener extends RunListener {

    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("Hello from Listener");
    }
}
