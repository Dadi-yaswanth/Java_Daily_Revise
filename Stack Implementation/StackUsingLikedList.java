import java.util.EmptyStackException;

class CustomStack {
   private Node head;
   private int size;

     static class  Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }

    }

    public void push(int element){
        Node tempNode = new Node(element);
        tempNode.next = head;
        head = tempNode;
        size++;
    }

    public void pop(){

         if(isEmpty()){
             throw new EmptyStackException();
         }
         head = head.next;
         size--;
    }

    public int peek(){

        if(isEmpty()){
            throw new EmptyStackException();
        }

        return head.value;
    }
    public boolean isEmpty(){
         return size == 0;
    }

    public void showStack(){
         Node current = head;
        System.out.print("Stack : ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class StackWithLinkedList{
    public static void main(String[] args) {
        CustomStack st = new CustomStack();
        st.push(100);
        st.push(200);
        st.push(150);
        st.showStack();
        st.pop();
        st.showStack();
    }
}