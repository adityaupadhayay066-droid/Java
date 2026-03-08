interface Animal{
    void animal_name();
    void eat();
    

}
class Show implements Animal{
    public void animal_name(){
        System.out.println("Name of animal is Panda");
    }
    public void eat(){
        System.out.println("Panda mostly eat Bamboo");
    }
}
public class Interface {
    public static void main(String[] args) {
        Animal a = new Show();
            a.animal_name();
            a.eat();
        
    }
    
}