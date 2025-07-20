package scaler.threads.threadmethods;

public class YieldDemo extends Thread{
    public void run(){
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("Start Yielding i : "+i + " on "+Thread.currentThread().getName());
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldDemo demo = new YieldDemo();
        demo.start();
        new YieldDemo().start();
    }
}
