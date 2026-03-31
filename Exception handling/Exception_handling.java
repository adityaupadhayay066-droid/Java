import java.util.*;
public class Exception_handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        try {
            int c = a/b;
            System.out.println("Division of number is : " +c);
            
        } catch (Exception e) {
            System.out.println("Number is  divisible by zero");
        }
        finally{
            System.out.println("---------------------------------------------------------");
            System.out.println("|-----------End of divide programme-------------------|");
            System.out.println("---------------------------------------------------------");
        }
        
        sc.close();
    }
}
