package queue;
interface Queue{
    public void enqueue(int item);
    public int dequeue();
    public void view();
}
class MyQueue implements Queue{
int QSIZE = 5;
int queue[]=new int[QSIZE];
int FRONT=-1;
int REAR=-1;
public void enqueue(int item){
    if(REAR==QSIZE-1){
        System.out.println("Queue Overflow");
    }
    else{
        if(FRONT==-1)
        {
            FRONT=0;
        }
        REAR++;
        queue[REAR]=item;
    }
}

    @Override
    public int dequeue() {
    if(FRONT==-1||FRONT>REAR)
    {
        System.out.println("Queue Underflow");
    }
    else{
        int item=queue[FRONT];
        FRONT++;
        return item;
    }
        return 0;
    }

    @Override
    public void view() {
    if(FRONT==-1)
    {
        System.out.println("Empty Queue");
    }
else{
    for(int i=FRONT;i<=REAR;i++)
    {
        System.out.println(queue[i]);
    }
    }
    }
}
public class SimpleQueueUsingArry {
    public static void main(String[] args) {
        MyQueue q= new MyQueue();
            q.enqueue(5);
            q.enqueue(6);
            q.enqueue(7);
            q.view();
    }
}
//IN queue, insert from rear and delete from front.