package scaler.threads.learnings;

public class TestThread extends Thread{
    @Override
    public void run(){
        for(;;){
            System.out.println("World");
        }
    }
}
