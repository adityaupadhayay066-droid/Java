import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter size of array : ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter the element of Array: ");
                arr[i] = sc.nextInt();
            }

            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
                
            }
            System.out.println();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
        System.out.println("Congratulation your programme is finished");

        sc.close();
    }
}