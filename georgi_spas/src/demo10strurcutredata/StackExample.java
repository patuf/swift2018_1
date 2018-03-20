package demo10strurcutredata;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;


public class StackExample {
    public static void main(String[] args) {
        // implementation on stack
        // implements whit Deque
       //1) implemets whit arrayDeque
        Deque<Integer>deck=new ArrayDeque<>();
        //2) implemet Deque  whit Linked list
        Deque<Integer>linkedList=new LinkedList<>();
        //e) implemets whit pure stack
    Stack<Integer> stack=new Stack<>();


        Integer[] arr={1,2,3,4,5,6,7};
        // use method push for input in stack collection to use interface properly
        for (Integer i:arr ) {
            deck.push(i);
            linkedList.push(i);
            stack.push(i);
        }
        // deque give opportunity to add last pure stack
        deck.addLast(0);
        stack.contains(5);
        linkedList.contains(5);

        System.out.println("Deque");
        while (!deck.isEmpty()){
            System.out.println(deck.pop()+" ");
        }
        System.out.println("Stack");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("LinkedList");
        while( !linkedList.isEmpty() ){
            System.out.print(linkedList.pop() + " ");
        }
    }
}
