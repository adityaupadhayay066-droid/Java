abstract class Vehicle{
    abstract void speed();
    abstract  void mileage();
    void wheels(){
        System.out.println("It cointain 4 wheels");
    } 
}
class BMW extends  Vehicle{
    void speed(){
        System.out.println("BMW spped is 100 km/hr");
    }
    void mileage(){
        System.out.println("BMW mileage is 100 km/hr");
    }
}

public class Vechile_Encapsulation {
    public static void main(String[] args) {
        System.out.println("----------XX-------------");
        Vehicle b = new BMW();
        b.wheels();
        b.speed();
        b.mileage();
    }
    
}
