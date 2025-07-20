package scaler.threads.producer_comsumer;

import static java.lang.Thread.sleep;

public class Producer implements Runnable{
    private Store store;

    public Producer(Store store){
        this.store = store;
    }


    @Override
    public void run() {
        System.out.println("Producer started");
        for(int i = 1 ; i < 5 ; i++){
            try{
                store.produce(i);
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
