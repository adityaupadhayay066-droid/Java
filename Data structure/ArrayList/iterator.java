import java.util.ArrayList;
import java.util.Iterator;
public class iterator {
    void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(20);
        a.add(30);
        a.add(40);
        System.out.println("Element of Array List are : " +a);
        Iterator<Integer> it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
            
        }

    }
    
