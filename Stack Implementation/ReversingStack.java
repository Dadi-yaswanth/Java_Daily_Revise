import java.util.ArrayList;
import java.util.Stack;

public class ReversingStack
{
    static void pushBottom(Stack<Integer>s,int number){
        if(s.isEmpty()){
            s.push(number);
            return;
        }
        int popElement = s.pop();
        pushBottom(s,number);
        s.push(popElement);

    }

    static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s,top);

}
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(11);
        stack.add(12);
        stack.add(13);
        stack.add(14);
        stack.add(15);
        stack.add(17);
        System.out.println(stack );
        reverseStack(stack);
        System.out.println(stack);
    }
}