/*Polymprphism mean one method name can have many formms(behaviours)
Types of Polymorphism 
Compile Time 
Run time  */


class Student{
    void marks(int a){
        System.out.println("you failed in C++");
    }
    void marks(int  a, int b){
        System.out.println("You failed in DBMS");
    }
    void marks(int a, int b , int c){
        System.out.println("You failed in life");
    }

}
public class polymorphism{
    public static void main(String[] args) {
        Student s = new Student();
        s.marks(20);
        s.marks(10,11);
        s.marks(20,60,10);
    }

}