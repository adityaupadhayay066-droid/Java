import java.util.*;
class swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your values of a and b here : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping");
        System.out.println(a+" "+b);
        int c =a;
         a = b;
         b = c;
        System.out.println("After Swaaping ");
        System.out.println(a+" " +b);

        sc.close();
    }
}