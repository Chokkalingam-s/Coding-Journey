package Stack;

public class ArrayBasedImplementation {
    private int maxSize;
    private int top;
    private int[] stackArray;
    
    public ArrayBasedImplementation(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }
    
    public boolean push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
            return false;
        }
        stackArray[++top] = value;
        return true;
    }
    
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];
    }
    
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    public static void main(String[] args) {
        ArrayBasedImplementation stack = new ArrayBasedImplementation(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Is stack full: " + stack.isFull());
    }

    
}
