import java.util.Scanner;
class Conditionalstatement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age here : ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are eligible for voting : " +age);
        }
        else{
            System.out.println("Your are not eligible for voting: " +age);
        }
sc.close();
    }
}