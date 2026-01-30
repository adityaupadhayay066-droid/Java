import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b here : ");
        int b = sc.nextInt();
        System.out.println(" --------------------------------  Choose operators  --------------------------------   ");
        System.out.println("1 for Addition(+) ");
        System.out.println("2 for Substraction(-) ");
        System.out.println("3 for Multiplication(-) ");
        System.out.println("4 for Divison(/) ");
        System.out.println("5 for Modulus(%) ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Addition = "+ (a+b));
                break;
            case 2:
               System.out.println("Substraction = "  +(a-b));
               break;
               case 3:
               System.out.println("Multiplication = "  +(a*b));
               break;
               case 4:
               System.out.println("Divison = "  +(a/b));
               break;
               case 5:
               System.out.println("Modulus = "  +(a%b));
               break;
               default:
                System.out.println("Invalid choice ! ");
        }
        sc.close();
    }
}