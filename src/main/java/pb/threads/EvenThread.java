package pb.threads;

public class EvenThread extends Thread{

    @Override
    public void run(){
        for(int i=1;i<10;i=i+2){
            System.out.println(i);
        }
    }
}
