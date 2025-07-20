package scaler.threads.downloadfile;

public class DownloadThread extends Thread{
    private String filename;

    public DownloadThread(String filename){
        this.filename = filename;
    }
    @Override
    public void run(){
        System.out.println("Started Downloading "+filename+ " on "+Thread.currentThread().getName());
        try{
            sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Finished Downloading "+filename+" on "+Thread.currentThread().getName());
    }

    public static void main(String[] args){
        DownloadThread thread1 = new DownloadThread("file1.zip");
        DownloadThread thread2 = new DownloadThread("file2.zip");
        DownloadThread thread3 = new DownloadThread("file3.zip");
        thread1.run();
        thread2.run();
        // No Multithreading , running on main thread
        // because start create new thread in JVM or OS,
        // then calls run() on the new thread
        // If Override start(). It must call super.start() ,
        // otherwise new thread won't be created
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
