package queue;

public class QueueUsingArray {

    int[] arr;
    int endOfQueue;
    int startOfQueue;
    int size;

    public QueueUsingArray(int size) {
        this.arr = new int[size];
        this.size = size;
        this.endOfQueue=-1;
        this.startOfQueue=-1;
        System.out.println("Empty queue of size "+size+" created.");
    }

    //Check if queue is empty
    public boolean isQueueEmpty(){
        if(startOfQueue == -1){
            return true;
        } else {
            return false;
        }
    }

    //If queue is full
    public boolean isQueueFull(){
        if(endOfQueue == arr.length -1){
            return true;
        } else{
            return false;
        }
    }

    //EnQueue operation
    public void enQueue(int value){
        if(isQueueFull()){
            System.out.println("Queue is full, cannot push more values");
        } else if(isQueueEmpty()) {
            arr = new int[this.size];
            startOfQueue = 0;
            endOfQueue++;
            arr[endOfQueue] = value;
            System.out.println("Value "+value+" was added in queue!");
        } else {//queue has at least one value
            endOfQueue++;
            arr[endOfQueue] = value;
            System.out.println("Value "+value+" was added in queue!");
        }
    }

    //DeQueue operation
    public void deQueue(){
        if(isQueueEmpty()){
            System.out.println("Cannot dequeue more values as queue is already empty");
        } else {
            System.out.println("Removing the value "+arr[startOfQueue] + " from the queue");
            arr[startOfQueue]=0;
            startOfQueue++;
            if(startOfQueue > endOfQueue){
                startOfQueue = endOfQueue = -1;
            }
        }
    }

    //Peek operation
    public void peek(){
        if(isQueueEmpty()){
            System.out.println("Cannot dequeue more values as queue is already empty");
        } else {
            System.out.println("Peeking operation ");
            System.out.println("First element in the queue is  "+arr[startOfQueue]);
        }
    }

    //Print entire queue
    public void printQueue(){
        if(!isQueueEmpty()){
            System.out.println("Printing the entire queue");
            for(int i = startOfQueue; i <= endOfQueue; i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        } else{
            System.out.println("Print queue is empty");
        }
    }

    //Delete entire queue
    public void deleteQueue(){
        arr=null;
        System.out.println("Queue deleted successfully");
    }
}

