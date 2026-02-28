public class InvertHalfpyramid {
    public static void main(String[] args){
        int n=5;
        for(int i=n; i>=1;i--){  //inner loop
            for(int j=1; j<=i;j++){ //outerloop
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}
