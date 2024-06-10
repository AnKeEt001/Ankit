
//Simple Queue using Linked List
  //      Same as singly linked list. Use insertLast() and deleteFirst() methods for enqueue and dequeue.
package queue;

interface Queues{
    public void enqueue(int data);
    public int dequeue();
    public void display();
}
class SLLNode {
    int info;
    SLLNode next;
}
class MQueue implements Queues{
    SLLNode FRONT,REAR;

    public void enqueue(int data){
        SLLNode newnode=new SLLNode();
        newnode.info=data;
        if(FRONT==null){
            FRONT=newnode;
            REAR=newnode;
        }
        else{
            REAR.next=newnode;
            REAR=newnode;
        }

    }
    public int dequeue(){
        if(FRONT==null){
            System.out.println("Queue underflow");
        }
        else{
            int item=FRONT.info;
            FRONT=FRONT.next;
            if(FRONT==null)
                REAR=null;
            return item;
        }
        return 0;
    }
    public void display(){
        SLLNode temp=FRONT;
        while(temp!=null){
            System.out.print(temp.info+ " ");
            temp=temp.next;
        }
        System.out.println("");
    }
}
public class SimpleQueueUsingLinkedList {
    public static void main(String[] args) {
        MQueue mq=new MQueue();
        mq.enqueue(5);
        mq.enqueue(10);
        mq.enqueue(15);
        mq.enqueue(20);
        mq.display();
        System.out.println("Deleted Item: "+mq.dequeue());
        mq.display();
        System.out.println("Deleted Item: "+mq.dequeue());
        mq.display();

    }
}
