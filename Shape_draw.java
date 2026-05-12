interface Shape{
    void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Cricle have radius and circumference");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle have length and breath");
    }
}
public class Shape_draw {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.draw();
        r.draw();
    }
    
}
