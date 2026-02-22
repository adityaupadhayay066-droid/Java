// In single level inheritace one parent class and one base class 

class vehicle{  // Parent class
    void distance(){
        System.out.println("Vehicle can travel at a distance");
    }
    
}
public class Singlelevel extends vehicle{
    public static void main(String[] args) {
        Singlelevel s = new Singlelevel();
        s.distance();
        
    }
}