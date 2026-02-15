import java.util.Scanner;

public class Factorial {
    public static void factorial(int n){
        if(n < 0){
            System.out.print("Inavlid !");
            return;
        }
        int factorail = 1;
        for(int i=n; i>=1; i--){
            factorail = factorail*i ;

        }
        System.out.println(factorail);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n here :  ");
        int n = sc.nextInt();
        factorial(n);
        
        sc.close();
    }
    
}
