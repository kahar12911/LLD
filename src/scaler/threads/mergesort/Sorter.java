package scaler.threads.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;


public class Sorter implements Callable<List<Integer>> {
    private List<Integer> values;
    private ExecutorService executorService;

    public Sorter(List<Integer> values, ExecutorService executorService){
        this.values = values;
        this.executorService = executorService;

    }

    @Override
    public List<Integer> call() throws ExecutionException, InterruptedException {
        // base Case
        if (values.size() <= 1){
            return values;
        }

        // Split Array

        int mid = values.size() / 2;
        List<Integer> leftArray = values.subList(0,mid); // [0,mid-1]
        List<Integer> rightArray = values.subList(mid,values.size()); // [mid,size-1]
        System.out.println("leftArray " +leftArray+" rightArray "+rightArray+ Thread.currentThread().getName());

        Sorter leftSorter = new Sorter(leftArray,executorService);
        Sorter rightSorter = new Sorter(rightArray,executorService);
        System.out.println("leftSorter "+leftSorter+" rightSorter "+rightSorter + " Thread# "+Thread.currentThread().getName());

        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture = executorService.submit(rightSorter);
        System.out.println("leftFuture "+leftFuture +" rightFuture "+rightFuture + " Thread# "+ Thread.currentThread().getName());

        // Merge the Array

        // return mergeArray( sortedLeft , sortedRight)
        return merge(leftFuture,rightFuture);
    }

    private List<Integer> merge(Future<List<Integer>> sorterLeftFuture, Future<List<Integer>> sorterRightFuture) throws ExecutionException, InterruptedException {
        // if left is smaller, add to sorted list
        List<Integer> sortedArray = new ArrayList<>();
        int first = 0, second = 0;

        List<Integer> sortedLeft = sorterLeftFuture.get();
        List<Integer> sortedRight = sorterRightFuture.get();
        System.out.println("sortedLeft "+sortedLeft+" sortedRight "+sortedRight + Thread.currentThread().getName());

        // Compare values from both the array
        while ( first < sortedLeft.size() && second < sortedRight.size()){
            // if left is smaller, add to sorted list
            if (sortedLeft.get(first) < sortedRight.get(second)){
                sortedArray.add(sortedLeft.get(first));
                first++;
            }
            else {
                sortedArray.add(sortedRight.get(second));
                second++;
            }
        }

        while (first < sortedLeft.size()){
            sortedArray.add(sortedLeft.get(first));
            first++;
        }

        while (second < sortedRight.size()){
            sortedArray.add(sortedRight.get(second));
            second++;
        }

        System.out.println("sortedArray "+sortedArray + Thread.currentThread().getName());
        return sortedArray;

    }

}
