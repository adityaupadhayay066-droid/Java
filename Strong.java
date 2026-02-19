import java.util.Scanner;

public class Strong {
    public static int factorial(int n){
        int factorial = 1;
        for(int i=1; i<=n;i++){
            factorial = factorial*i;
        }
          return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number here : ");
        int a = sc.nextInt();
        int sum = 0;
        int c=a;
        while(a!=0){
            int d = a%10;
            sum = sum+factorial(d);
            a=a/10;
        }
        if(c==sum){
            System.out.println("Enter number is strong");
        }
        else{
            System.out.println("Enter number is not strong ");
        }
        sc.close();


        
    }
    
}
