package scaler.threads.downloadfile;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class DownloadJob implements Runnable{
    String filename;

    public DownloadJob(String filename){
        this.filename = filename;
    }

    @Override
    public void run(){
        System.out.println("Started Downloading "+filename+" on "+Thread.currentThread().getName());
        try{
            sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Finished Downloading "+ filename);
    }

    public static void main(String[] clp){
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(new DownloadJob("File1"));
        executor.submit(new DownloadJob("File2"));
        executor.submit(new DownloadJob("File3"));

        executor.shutdown();

    }
}
