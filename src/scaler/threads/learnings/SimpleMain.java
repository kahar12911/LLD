package scaler.threads.learnings;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        TestThread testThread = new TestThread();
        testThread.start();
        // start method initiate new thread

//        for(;;){
//            System.out.println("Hello");
//        }


        // Using Runnable > It doesn't have start in it.

        TestRunnable testThread1 = new TestRunnable();
        // can't use start here
        //testThread1.run();
        Thread thread = new Thread(testThread1);
        thread.start();
    }
}
