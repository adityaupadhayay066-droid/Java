class Employee{
   public  String name;
    private int  EmpId;
    private double salary;
    public String Dept;

    public void setEmpId(int e){
        EmpId = e;
    }
    public int getEmpId(){
        return EmpId;
    }
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
public void setsalary(double s){
    salary = s;
}
public double getsalary(){
    return salary;
}
public void setDept(String d){
    Dept = d;
}
public String getDept(){
    return Dept;
}
}

public class GetterSetter {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setname("Aditya Upadhayay");
        emp.setsalary(800000);
        emp.setDept("Ai and ML ");
        System.out.println("Employee id is : "+emp.getEmpId());
         System.out.println("Employee name is  : "+emp.getname());
          System.out.println("Employee salary is : "+emp.getsalary());
           System.out.println("Employee Department is  : "+emp.getDept());
    }
    
}
