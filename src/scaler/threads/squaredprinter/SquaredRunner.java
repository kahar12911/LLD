package scaler.threads.squaredprinter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquaredRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> values = List.of(1,2,3,4,5,6,7,8,9);
        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Future<Integer>> squaredValues = new ArrayList<>();
        for (Integer value : values){
            squaredValues.add(executorService.submit(new Squared(value)));
        }

        Thread.sleep(1000);
        for ( Future<Integer> squaredValue :squaredValues){
            System.out.println(squaredValue.get());
        }


    }
}
