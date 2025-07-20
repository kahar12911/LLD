package scaler.threads.producer_comsumer;

public class Store {
    private int item;
    private boolean available = false;

    public synchronized void produce(int item) throws InterruptedException {
        if(available){
            wait(); // wait until item is consumed
        }
        this.item = item;
        System.out.println("Produced : "+item);
        available = true;
        notify(); // notify the consumer

    }

    public synchronized void consume(int item) throws InterruptedException{
        if(!available){
            wait(); // wait until item is produced
        }
        System.out.println("Comsumed "+item);
        available = false;
        notify();

    }
}
