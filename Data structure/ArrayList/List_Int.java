import java.util.ArrayList;
public class List_Int {
     void main(String[] args){
    ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println("Inserting elment in array is : " +l);
         // Add at specific index
        l.add(1, 40);
        System.out.println("Adding element at specific index is : " +l);
        // get element of array
        System.out.println("Getting element based on indexing : " +l.get(2));
        // set
        l.set(1,60);
        System.out.println("Replacing elemnt based on given index : "+l);
        // remove 
        l.remove(2);
        System.out.println("Removing element on giving index : "+l);
        System.out.println("Soze of ArrayList is : "+l.size());

     }
    
}
