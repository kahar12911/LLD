package scaler.threads.threadmethods;

public class OrderSystem {
    public static void main(String[] args) throws InterruptedException {
        OrderProcessor o1 = new OrderProcessor("11");
        OrderProcessor o2 = new OrderProcessor("ORDER1002");
//        Thread t1 = new Thread(processor);
//        //Thread constructor compatibility ❌Wrong: new Thread(new Thread())	✅new Thread(Runnable)
//        Thread t2 = new Thread(processor);



        o1.start();
        o2.start();

        o1.join();
        o2.join();
        System.out.println("Main executes after completion");


    }
}
