package Stack;
// This is the Array impl
public class StackArray {
    // These are initializing in the class globally
    int stack[];
    int top;
    int size;
    // Create a constructor
    public StackArray(int stackSize){
        stack = new int[stackSize];
         top = -1;
         size = stackSize;

    }
    // This is the inserting method in a stack
    public void push(int element){
        // checking the condition is stack is full or space left in it to store a value
        if(top >= size - 1){
            System.out.println("Stack is overflow");
        }
        top++;
        stack[top] = element;
    }
    // To check weather the stack is empty or not
    public boolean isEmpty(){
        return top<= -1;
    }
    // This is for the size of the stack
    public int size(){
        return top + 1;
    }
    // This is for the peek of the stack
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }
    // This is for the deletion from the stack
    public int pop(){
        int val = peek();
        if (top != Integer.MIN_VALUE){
            top--;
        }
        return val;
    }
    // This is the printing function for printing the stack on screen
    public void printStack(){
        System.out.println("Printing stack : ");
        for (int i = 0; i <= top ; i++) {
            System.out.print(stack[i]);
            if(i != top){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 5;
        StackArray stack = new StackArray(n);
        stack.push(5);
        stack.printStack();
        stack.push(4);
        stack.printStack();
        stack.push(3);
        stack.printStack();
        stack.push(2);
        stack.printStack();
        stack.push(1);

        stack.printStack();
       stack.size();

    }
}
