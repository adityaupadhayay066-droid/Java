import java.util.Scanner;

class Fibonacci_series {
    public static void series(int n) {
        int firstnum = 0, secondnum = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstnum + ",");
            int nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n here : ");
        int n = sc.nextInt();
        System.out.println("      The Fibonacci series are :      ");
        series(n);
        sc.close();
    }

}