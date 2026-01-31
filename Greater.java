import java.util.Scanner;
public class Greater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a here : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b here : ");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("a is equal to b ");
        }
        else if(a>b) {
            System.out.println("a is greater than b");

        }
        else{
            System.out.print("a is less than b");
        }

sc.close();
    }
    
}
