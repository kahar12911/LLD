package scaler.threads.threadmethods;

public class JoinDemo extends Thread{
    public void run(){
        try{
            System.out.println("Starting thread");
            Thread.sleep(2000);
            System.out.println("Sleep Done");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo demo = new JoinDemo();
        demo.join();
        demo.start();
        demo.join(); // Main thread waits for demo to finish
        System.out.println("Main Continus after Join");
    }
}
