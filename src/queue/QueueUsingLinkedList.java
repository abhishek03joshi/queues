package queue;
import linkedList.LinkedList;
import node.SingleNode;

public class QueueUsingLinkedList {
    LinkedList list;
    public QueueUsingLinkedList(){
        list = new LinkedList();
    }

    //Create a queue

    //Check if queue is empty
    public boolean isQueueEmpty(){
        if(list.getHead() == null){
            return true;
        } else {
            return false;
        }
    }


    //Enqueue
    public void enQueue(int value){
        if(isQueueEmpty()){
            list.createLinkedList(value);
            return;
        }
        list.insertLinkedList(value, list.getSize());
    }

    //Dequeue
    public int deQueue(){
        if(isQueueEmpty()){
            System.out.println("Cannot dequeue an empty queue, please proceed creation of a new queue");
            return -1;
        } else {
            int tempValue = list.getHead().getValue();
            System.out.println("Dequeued the value "+tempValue);
            list.deleteNode(0);
            return tempValue;
        }
    }

    //Peek
    public int peek(){
        if(isQueueEmpty()){
            System.out.println("Cannot peek and empty queue, please proceed creation of a new queue");
            return -1;
        } else {
            return list.getHead().getValue();
        }

    }

    //Delete queue
    public void deleteQueue(){
        System.out.println("Initiating queue deletion!");
        list.deleteLinkedList();
        System.out.println("Queue deleted successfully!");
    }


}
