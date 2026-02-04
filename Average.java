import java.util.Scanner;

public class Average {
     public static int average(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a here : ");
        int a = sc.nextInt();
          System.out.print("Enter value of b here : ");
           int b = sc.nextInt();
        System.out.print("Enter value of c here : ");
         int c = sc.nextInt();
            System.out.print("Average of numbers are :  "+ average(a,b,c));

            sc.close();
        
    }
}
    
