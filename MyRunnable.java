class Thread_Runnable1 implements Runnable{
    public void run(){
        int i=1;
        while(i<=1000){
            System.out.println("I am Runnable Thread 1 ");
            i++;
        }
    }

}
class Thread_Runnable2 implements Runnable{
    public void run(){
        int i=1;
        while(i<=1000){
            System.out.println("I am Runnable Thread 2");
            i++;
        }
    }

}

public class MyRunnable {
    public static void main(String[] args) {
        Thread_Runnable1 bullet1 = new Thread_Runnable1();
        Thread gun1 = new Thread(bullet1);
        Thread_Runnable2 bullet2 = new Thread_Runnable2();
        Thread gun2= new Thread(bullet2);
        
        gun1.start();
        gun2.start();
    }

    }
    
