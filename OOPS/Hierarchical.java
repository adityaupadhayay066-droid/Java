/* Multiple child class is derived from one parent class
we want to create sepreate object to access the method of each class*/  

class Furniture{
    void material(){
        System.out.println("Furniture are made up of wood and metal");
    } 
}
class Chair extends Furniture{
    void Purpose(){
        System.out.println("Chair is used for seating");
    }
}
class Table extends Furniture{
    void study(){
        System.out.println("Study table is used for study");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        System.out.println("-------Furniture class object initialize----------");
        Furniture f = new Furniture();
        f.material();
        System.out.println();
         System.out.println("----------Chair class object initialize-----------");
        Chair c = new Chair();
        c.material();
        c.Purpose();
        System.out.println();
         System.out.println("---------Table class object initialize------------");
        Table t = new Table();
        t.material();
        t.study();
    

    }

}