class student{
    String Name;
    int age;
}

 public class Instance{
    public static void main(String[] args) {
        student s = new student();
        s.Name = "Aditya";
        s.age = 18;
        System.out.println("Name of student is : "+s.Name);
        System.out.println("Age of Student is : "+s.age);
        

    }
    
}
