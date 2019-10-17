package queue;

public class QueueUsingArrayMain {
    public static void main(String[] args) {
        System.out.println("Creating an empty queue");
        QueueUsingArray queue = new QueueUsingArray(5);

        System.out.println("Adding values to the queue.....");
        for(int i=1; i<=5; i++){
            queue.enQueue(i*20);
        }

        System.out.println("Printing the queue");
        queue.printQueue();
        System.out.println("Peeking value from the queue");
        queue.peek();


        System.out.println("Deleting one element from the queue");
        queue.deQueue();
        System.out.println("Printing the queue");
        queue.printQueue();
        queue.peek();

        System.out.println("Dequeueing 6 values from the queue...");
        for(int i=0; i<6; i++){
            queue.deQueue();
        }

        System.out.println("Deleting the entire queue");
        queue.deleteQueue();

        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

        System.out.println("Circular queue");

        CircularQueueUsingArray cq = new CircularQueueUsingArray(7);

        System.out.println("\nEnqueuing 7 values in the queue...");
        for (int i = 1; i <= 7; i++) {
            cq.enQueue(i * 5);
        }
        cq.printQueue();
        cq.enQueue(60);
        cq.deQueue();
        cq.deQueue();
        cq.enQueue(60);
        cq.printQueue();
        cq.peek();
        cq.deQueue();
        cq.printQueue();
        cq.deleteQueue();
    }
}
