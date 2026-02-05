import java.util.Scanner;
class Funcion {
    public static int product(int a , int b ) {
        return a*b;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(product(a, b));


    }


}