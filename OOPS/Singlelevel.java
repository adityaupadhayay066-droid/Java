class parent {
    void sound(){
        System.out.println("Animal can make a soung");
    }
    
}
public class Singlelevel extends parent{
    public static void main(String[] args) {
        Singlelevel c = new Singlelevel();
        c.sound();

        
    }
}
