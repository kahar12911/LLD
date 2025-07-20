package scaler.threads.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private final ReentrantLock lock = new ReentrantLock();
    private int count = 1;

    public void increment(){
        lock.lock();
        try{
            count++;
        }finally {
            lock.unlock();
        }
    }

    public int getCount(){
        return count;
    }

}
