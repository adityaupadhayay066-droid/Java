import java.util.Scanner;
public class GCD {
       public static int gcd(int a, int b){
        while(b!=0){
            int remainder = a%b;
            a=b;
            b=remainder;

        }
        return a;
    }

     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter first value of here : ");
      int a = sc.nextInt();
       System.out.print("Enter second value of here : ");
      int b = sc.nextInt();
      System.out.println("Greatest common divisor is :  "+gcd(a,b));
            sc.close();
    
}
}