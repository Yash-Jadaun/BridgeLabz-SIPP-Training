package DataStructure.StacksandQueues;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            // Transfer all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Main method to test
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        queue.enqueue(40);
        System.out.println("Peek: " + queue.peek());        // 20
        System.out.println("Dequeued: " + queue.dequeue()); // 20
        System.out.println("Dequeued: " + queue.dequeue()); // 30
    }
}

