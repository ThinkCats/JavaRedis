package twosection_base.thread;

/**
 * Created by wanglei on 2014/12/4.
 */
public class TestThread2 extends Thread{
    private static int threadCount=0;
    private int threadNum=++threadCount;
    private int i=5;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread"+threadNum+"="+i);
            if (--i ==0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            new TestThread2().start();
        }
    }
}
