package assignment6.LinkedListStack;

public class StkObj {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(8);
        s.push(9);
        s.push(7);
        s.push(2);
        s.Display();
        System.out.println("Top element is :"+s.peek());
        s.pop();
        s.pop();
        s.Display();
    }
}
