package scaler.threads.downloadfile;

import static java.lang.Thread.sleep;

public class DownloadTask implements Runnable{
    String filename;

    public DownloadTask(String filename){
        this.filename = filename;
    }

    @Override
    public void run() {
        System.out.println("Started Downloading "+filename+" on "+Thread.currentThread().getName());
        try{
            sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Completed Downloading "+filename);
    }

    public static void main(String[] args){
        DownloadTask task1 = new DownloadTask("file1");
        DownloadTask task2 = new DownloadTask("file2");
        DownloadTask task3 = new DownloadTask("file3");
        new Thread(task1).run();
        new Thread(task2).run();
        new Thread(task3).run();
        // All run() are sequentially executed . No multithreading
        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
    }
}
