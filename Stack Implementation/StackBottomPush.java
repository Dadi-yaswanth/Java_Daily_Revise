public class StackPushBottom {
    public static void pushBottom(int number, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(number);
            return;
        }
        int popElement = s.pop();
        pushBottom(number,s);
        s.push(popElement);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        System.out.println(s);
        pushBottom(0,s);
        System.out.println(s);


    }
}