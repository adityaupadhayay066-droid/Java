import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year here : ");
        int y = sc.nextInt();
        if((y%4==0 || y%400==100 || y%100==0)){
            System.out.print("It is a leap year ");
        }
        else{
            System.out.println("Not is a leap year ");
        }
    }
    }
    
