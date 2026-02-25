// In Multilevel child  

class Human {  // parent class
    void human(){
    System.out.println("Human still alive");
}

}
class Eat extends Human{ 
    void eat(){
        System.out.println("Human are eating");
    }

}
class Working extends Eat{  // Derived class form Eat 
    void work(){
        System.out.println("Human are Working");
    }

}
public class Multilevel extends Working{
    public static void main(String[] args) {
        Multilevel M = new Multilevel();
        M.human();
        M.eat();
        M.work();
    }
}