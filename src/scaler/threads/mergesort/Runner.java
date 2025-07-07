package scaler.threads.mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> values = List.of(10,5,8,3,2,6,9,1,4,7);
        ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println(Thread.currentThread().getName());
        Sorter sorter = new Sorter(values,executorService);
        Future<List<Integer>> sortedValues = executorService.submit(sorter);
        System.out.println(sortedValues.get());
    }
}
