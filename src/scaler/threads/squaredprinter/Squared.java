package scaler.threads.squaredprinter;

import lombok.AllArgsConstructor;

import java.util.concurrent.Callable;

@AllArgsConstructor
public class Squared implements Callable<Integer> {
    private Integer x;
    public Squared(Integer x){
        this.x = x;
    }

    @Override
    public Integer call() throws Exception {
        return x * x;
    }
}
