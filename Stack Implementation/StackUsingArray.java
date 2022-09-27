public class StackWithArray {
    int size;
    int[] arr;
    int top;

    StackWithArray(int size){
        this.size = size;
        this.arr = new int[size];
        top = -1;
    }

    public void push(int element){
        if(!isFull()){
            top++;
            arr[top] = element;
            System.out.println("Element popped successfully : "+element);
        }else{
            System.out.println("Sorry! :( I'm already Full");
        }
    }

    public void pop(){
        if(!isEmpty()){
            System.out.println("Element: "+arr[top] +" popped up ");
            top--;
        }else {
            System.out.println("You can't do it! :( i'm Empty!");
        }
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println("Peek element is: "+arr[top]);
        }else {
            System.out.println("Sorry! Stack is empty");
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return size - 1 == top;
    }




    public static void main(String[] args) {
        StackWithArray stack = new StackWithArray(5);
        stack.push(15);
        stack.push(15);
        stack.push(15);
        stack.push(15);
        stack.push(15);
        System.out.println(stack.isFull());
    }
}
