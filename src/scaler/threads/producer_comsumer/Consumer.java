package scaler.threads.producer_comsumer;

import static java.lang.Thread.sleep;

public class Consumer implements Runnable{
    private Store store;

    public Consumer(Store store){
        this.store = store;
    }
    @Override
    public void run() {
        for(int i = 1; i < 5 ; i++){
            try{
                store.consume(i);
                sleep(1500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
