class vehicle {   // Parent class
    void distance(){
        System.out.println("Vehicle can travel at a distance");
    }

}
public class Singlelevel extends vehicle{
    public static void main(String[] args) {
        Singlelevel S = new Singlelevel();
        S.distance();
        
    }
}