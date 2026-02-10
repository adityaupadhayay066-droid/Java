class Maths{
    public int calculation(int a, int b){
        return a-b;
    }
}

public class nonstatic {
    public static void main(String[] args) {
        Maths ma = new Maths();
        int finish = ma.calculation(30,12);
        System.out.print(finish);
    }
    
}
