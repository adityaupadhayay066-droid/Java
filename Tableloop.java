import java.util.*;
public class Tableloop {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number here : ");
        int n = sc.nextInt();
        // for(int i=1; i<=10; i++){
        //     System.out.println(n+"x"+i+"=" +(i*n));
        int i =1;
        while(i<=10){
            System.out.println(n+"x"+i +"=" +(i*n));
            i++;

        }
         sc.close();

        }
       
        
    }

    