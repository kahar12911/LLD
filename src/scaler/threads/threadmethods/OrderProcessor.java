package scaler.threads.threadmethods;

public class OrderProcessor extends Thread{
    private String orderId;

    OrderProcessor(String orderId){
        this.orderId = orderId;
    }
    public void run(){
        System.out.println("Processing Order Id : "+orderId+" on "+Thread.currentThread().getName());
        try{
            sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Completed Order");
    }
}
