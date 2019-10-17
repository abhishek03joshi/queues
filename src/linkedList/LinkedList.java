package linkedList;
import node.SingleNode;
import sun.management.jmxremote.SingleEntryRegistry;

public class LinkedList {
    SingleNode head;
    SingleNode tail;
    int size;

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //Create a linked list
    public SingleNode createLinkedList(int nodeValue){
        head = new SingleNode();
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Check if linked list exists
    public boolean existsLinkedList(){
        return head != null;
    }

    //Insert node in linked list
    public void insertLinkedList(int nodeValue, int location){
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        if(!existsLinkedList()){
            System.out.println("The linked list does not exists! Please create it first");
        } else if(location == 0){
            node.setNext(head);
            head=node;
        } else if(location >= size - 1){
            node.setNext(null);
            tail.setNext(node);
            tail=node;
        } else{//Insert in between
            SingleNode tempNode = head;
            for (int i = 0; i< location -1; i++){
                tempNode = tempNode.getNext();
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
        setSize(getSize() + 1);
    }


    //Traverse a linked list
    public void traverseLinkedList(){
        System.out.println("Traversing the linked list...");
        SingleNode tempNode = head;
        for (int i = 0; i<size; i++){
            System.out.print(tempNode.getValue());
            if(i != getSize() - 1){
                System.out.print("->");
            }
            tempNode = tempNode.getNext();
        }
        System.out.println("\n\n");
    }

    //Search for a node in linked list
    public void searchNode(int nodeValue){
        System.out.println("Searching for value"+nodeValue);
        SingleNode tempNode = head;
        for (int i = 0; i<size; i++){
            if(tempNode.getValue() == nodeValue){
                System.out.println("Value "+nodeValue+" is found at index: "+i);
                return;
            }
        }
        System.out.println("Value "+nodeValue+" is not present in the Linked list");
        System.out.println("\n\n");
    }

    //Delete a node in linked list
    public void deleteNode(int location){
        if(!existsLinkedList()){
            System.out.println("The linked list does not exist for deletion of nodes. Aborting operation");
        } else if(location == 0){
            if(size == 1 || head == tail){
                head = tail = null;
                size=0;
                return;
            }
            head=head.getNext();
            setSize(getSize()-1);
        } else if(location >= size - 1){
            if(size == 1 || head == tail){
                head = tail = null;
                size=0;
                return;
            }
            SingleNode tempNode= head;
            for (int i =0; i<size; i++){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(null);
            tail=tempNode;
            setSize(getSize()-1);
        } else{//Insert in between
            SingleNode tempNode= head;
            for (int i =0; i<location - 1; i++){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize()-1);
        }
    }

    //Delete entire SLL
    public void deleteLinkedList(){
        System.out.println("Deleting entire linked list....");
        head = null;
        tail = null;
        size = 0;
        System.out.println("Linked list deleted successfully!");
    }


}
