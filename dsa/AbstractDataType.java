package dsa;

// 1. Define the Abstract Data Type (ADT) using an Interface
// This explains WHAT operations are possible, hiding the HOW.
interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
}

// 2. Implement the ADT
// This is a concrete implementation that defines HOW the operations are performed.
class ArrayStack<T> implements Stack<T> {
    private Object[] array;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.top = -1;
    }

    @Override
    public void push(T item) {
        if (top == capacity - 1) {
            throw new StackOverflowError("Stack is full");
        }
        array[++top] = item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) array[top--];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
         if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) array[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}

public class AbstractDataType {
    public static void main(String[] args) {
        // We program to the ADT (Stack interface), not the concrete implementation.
        // This is the core principle of using an ADT.
        Stack<Integer> myStack = new ArrayStack<>(5);
        
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        
        System.out.println("Top element is: " + myStack.peek()); // Outputs 30
        System.out.println("Popped element: " + myStack.pop());   // Outputs 30
        System.out.println("Is stack empty? " + myStack.isEmpty()); // Outputs false
    }
}
