package Stack;

import java.util.ArrayList;

class Stack_prc{
    static ArrayList<Integer> l = new ArrayList<>();
    public void push(int data){
        l.add(data);   
        }
         public void pop(){
            l.remove(l.size()-1);

        }
        public void printing(){
            if(l.size()==0){
                System.out.println("Stack is empty");
            }
            else{
                for(int i=l.size()-1;i>=0;i--){
                    System.out.print(l.get(i)+" ");
                }
            }
            System.out.println("");
        }
        // use to see the top element in the Stack 
       public void peek(){
        l.get(l.size()-1);

        }

    }

public class pop {
    public static void main(String[] args) {
        Stack_prc s = new Stack_prc();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.printing();
        s.peek();
        s.pop();
        s.printing();
        s.peek();
        s.printing();
    }
    
}
