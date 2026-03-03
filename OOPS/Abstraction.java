abstract class Bike{
    abstract void bike();
    void run(){
        System.out.println("Bike a ready to run");
    }
}
class Honda extends Bike{
    void bike(){
        System.out.println("Brand name is Honda");
    }

}
public class Abstraction{
    public static void main(String[] args) {
        Bike b  = new Honda();   // we cannot create a abstract class object 
        b.bike();
        b.run();
        
        
    }
}