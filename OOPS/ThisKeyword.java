/*this is a reference variable that refers to the current object of the class.
It is used inside a class to refer to the current class instance variables, methods, or constructors. */
class ThisKeyword{
    private int RollNo = 146;
    private String Name = "Aditya Upadhayay";
    private String Dept = "BCA";
    private String DOB = "26-03-2007";
    public void setRollNo(int RollNo){
        this.RollNo = RollNo;             
    }
    public int getRollNo(){
        return this.RollNo;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    public void setDept(String Dept){
        this.Dept = Dept;
    }
    public String getDept(){
        return this.Dept;
    }
    public void setDOB(String DOB){
        this.DOB = DOB;
    }
    public String getDOB(){
        return this.DOB;
    }
       public static void main(String[] args) {
        ThisKeyword t = new ThisKeyword();
        System.out.println("Student Roll number is : "+t.getRollNo());
        System.out.println("Name of Student  is : "+t.getName());
        System.out.println("Student Department is  : "+t.getDept());
        System.out.println("Student DOB is : "+t.getDOB());
        
    }

}