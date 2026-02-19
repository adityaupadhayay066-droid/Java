class StudentDetail{
    static String collegeName;
}
public class SVariable{
    public static void main(String[] args) {
       StudentDetail.collegeName = "CUTM";
        System.out.println("College name is : "+ StudentDetail.collegeName);
    }
}