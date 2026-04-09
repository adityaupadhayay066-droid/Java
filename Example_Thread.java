import java.util.Scanner;
class Table extends Thread{
    int n;
    Table(int n){
        this.n=n;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
        
    }
} 
public class Example_Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number here : ");
        int n = sc.nextInt();
       Table t = new Table(n);
        t.start();
        sc.close();
    }
}