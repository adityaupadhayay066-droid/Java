import java.util.Scanner;

class Name_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name here : ");  // it print the message first then print 
        String name = sc.nextLine();
                // System.out.print("Enter your name here : " +name);  // it take input first and then print message  
        System.out.println("Your name is : "+name);
        sc.close();
    }
}