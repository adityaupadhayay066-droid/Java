package  Stack;
import  java.util.ArrayList;
class Stack{
    static ArrayList<Integer> l = new ArrayList<>();
    public void push(int data){
        l.add(data);   
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

        }

    }
public class Insert{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.printing();
    }
}