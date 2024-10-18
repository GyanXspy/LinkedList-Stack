package assignment6.LinkedListStack;

public class Stack {
    Node top = null;
    int size = 0;
    void push(int item){
        Node node = new Node();
        node.data = item;
        node.next = top;
        top = node;
        size++;

    }
    void Display(){
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;

        }
        System.out.println("null");
    }
    int length(){
        return size;

    }
    void pop(){
        if (top == null) {
            System.out.println("Stack is underflow");

        }
        else{
            System.out.println("Delet top element "+top.data);
            top = top.next;
        }
    }
    int peek(){
        return top.data;
    }

}
