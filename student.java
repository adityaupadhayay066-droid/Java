class student {
    int a=10;
    static String name = "A";
    void detail(){
        int b = 20;
        System.out.println(b);
    }
public static void main(String[] args) {
    student s = new student();
    System.out.println(s.a);
    System.out.println(student.name);
    s.detail();


    
}
    
}
