package Stack;

public class LinkedListBasedImplementation {
    Node top;
    
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    
    // Pop operation
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    
    // Display operation
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    //peek operation
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    
    public static void main(String[] args) {
        LinkedListBasedImplementation stack = new LinkedListBasedImplementation();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        System.out.println("\nPopped element is: " + stack.pop());
        stack.display();
        System.out.println("\nTop element is: " + stack.peek());
        stack.display();

    }
    
}
