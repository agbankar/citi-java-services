package pb.threads;

public class OddEven extends Thread{
    public static void main(String[] args) throws InterruptedException {
        OddEven e=new OddEven();
        e.start();
        Thread.sleep(90);
        EvenThread e1=new EvenThread();
        e1.start();
    }

    @Override
    public void run() {
        for(int i=0;i<10;i=i+2){
            System.out.println(i);

        }

    }
}
