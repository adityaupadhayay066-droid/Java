import java.util.InputMismatchException;
import java.util.Scanner;
public class Input_Handling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter integer value: ");
            int a = sc.nextInt();
            
        } catch (InputMismatchException e) {
            System.out.println("You entered a Sting type value");
        }
        System.out.println("Programme ended successfully");
        sc.close();
    }
}