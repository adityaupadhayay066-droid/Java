abstract class Vechile{
    abstract void speed();
    abstract  void mileage();
    void wheels(){
        System.out.println("It cointain 4 wheels");
    } 
}
class BMW extends  Vechile{
    void speed(){
        System.out.println("BMW spped is 100 km/hr");
    }
    void mileage(){
        System.out.println("BMW mileage is 100 km/hr");
    }
}

public class Aditya {
    public static void main(String[] args) {
        System.out.println("----------XX-------------");
        Vechile b = new BMW();
        b.wheels();
        b.speed();
        b.mileage();
    }
    
}
