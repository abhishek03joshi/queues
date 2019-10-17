package queue;

public class QueueUsingLinkedListMain {
    public static void main(String[] args) {
        System.out.println("Creating a queue");
        QueueUsingLinkedList queue = new QueueUsingLinkedList();



        System.out.println("Enqueueing 6 values into queue");
        for(int i=1 ; i<=6; i++) {
            queue.enQueue(i*20);
        }
        System.out.println();


        System.out.println("Peeking value");
        System.out.println(queue.peek());
        System.out.println();


        System.out.println("Dequeueing 6 values into queue");
        for(int i=0; i<6; i++) {
            System.out.println(queue.deQueue());
        }


    }
}
