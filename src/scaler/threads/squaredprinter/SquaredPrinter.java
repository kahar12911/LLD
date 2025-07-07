package scaler.threads.squaredprinter;


public class SquaredPrinter implements Runnable{
    private int x;
    public SquaredPrinter(int x){
        this.x = x;
    }
    @Override
    public void run() {
        System.out.println(x * x + " Thread# "+Thread.currentThread().getName());
    }
}
