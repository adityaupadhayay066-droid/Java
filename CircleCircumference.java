
import java.util.Scanner;

class CircleCircumference{
    public static double odd(int r){
        return 2 *3.14*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circumference of Circle here : ");
        int c = sc.nextInt();
        System.out.println("Circumference of circle is "+ c + odd(c));
          sc.close();

    }
  
}
