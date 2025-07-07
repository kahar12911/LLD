package scaler.threads.hundredprintepool;

import java.lang.reflect.Executable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for( int i=1; i <= 100 ; ++i){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            //Thread t = new Thread(numberPrinter);
            //t.start();
            executorService.execute(numberPrinter);
        }
    }
}
