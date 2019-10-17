package queue;

public class CircularQueueUsingArray {
    int[] arr;
    int startOfQueue;
    int endOfQueue;
    int size;

    public CircularQueueUsingArray(int size){
        this.arr = new int[size];
        this.size=size;
        this.startOfQueue=-1;
        this.endOfQueue=-1;
        System.out.println("Successfully initialized and empty queue \n\n");
    }


    //Check if queue is full
    public boolean isQueueFull(){
        if(startOfQueue == 0 && endOfQueue == size - 1){
            return true;
        } else if( endOfQueue == startOfQueue - 1){
            return true;
        } else {
            return false;
        }
    }


    //Check if queue is empty
    public boolean isQueueEmpty(){
        if(startOfQueue == -1 && endOfQueue == -1){
            return true;
        } else {
            return false;
        }
    }


    //Print the queue
    public void printQueue(){
        System.out.println("Printing the entire queue right now...");
        int i = startOfQueue;
        if(startOfQueue <= endOfQueue){
            while(i<= endOfQueue){
                System.out.println(arr[i]+" ");
                i++;
            }
            System.out.println("\n");
        } else {
            while(i<= size - 1){
                System.out.println(arr[i]+" ");
                i++;
            }
            i = 0;
            while(i<=endOfQueue){
                System.out.println(arr[i]+" ");
                i++;
            }
            System.out.println("\n");
        }

    }


    //Enqueue
    public void enQueue(int value){
        if(isQueueFull()){
            System.out.println("Cannot add more data as the queue is full");
        } else if(isQueueEmpty()){
            startOfQueue=0;
            endOfQueue++;
            arr[endOfQueue] = value;
            System.out.println("Inserted value "+value+" in queue");
        } else{
            if(endOfQueue == size -1){
                endOfQueue = 0;
            } else{
                endOfQueue++;
            }
            arr[endOfQueue] = value;
            System.out.println("Inserted value "+value+" in queue");
        }
    }


    //Dequeue
    public void deQueue(){
        if(isQueueEmpty()){
            System.out.println("Queue cannot be dequeued as it is empty");
        } else {
            System.out.println("Dequeuing ....");
            System.out.println("Dequeued "+ arr[startOfQueue]);
            if(startOfQueue == size - 1){
                startOfQueue = 0;
            } else if( startOfQueue == endOfQueue){
                startOfQueue = endOfQueue = -1;
            }
            else {
                startOfQueue++;
            }

        }

    }

    //Peek
    public void peek(){
        if(!isQueueEmpty()){
            System.out.println("Peeking value "+arr[startOfQueue]+"\n");
        } else {
            System.out.println("The queue is empty and cannot be peeked");
        }
        System.out.println("\n");
    }

    //Delete queue
    public void deleteQueue(){
        System.out.println("Deleting the queue");
        this.arr=null;
        startOfQueue = endOfQueue = -1;
        System.out.println("Queue deleted successfully");
    }
}
