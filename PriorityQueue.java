package queue;

interface Queue1{
    public void enqueue(int data);
    public int dequeue();
    public void display();
}
class PriorityQu implements Queue1{
    int QSIZE=5;
    int FRONT=-1,REAR=-1;
    int queue[]=new int[QSIZE];

    public void enqueue(int data) {
        if(REAR<FRONT){
            System.out.println("Queue is full");
        }
        else{
            if(FRONT==-1)
                FRONT=0;
            REAR++;
            queue[REAR]=data;
        }
    }

    public int dequeue() {
        int item,temp=0;
        item=queue[FRONT];
        if(REAR==QSIZE-1){
            System.out.println("queue underflow");

        }
        else{
            //find the smallest item
            for(int i=FRONT;i<=REAR;i++){
                if(item>queue[i]){
                    temp=i;
                    item=queue[i];
                }
            }
            //shift the items after smallest item one step back
            for(int i=temp;i<=REAR;i++){
                queue[i]=queue[i+1];
            }
            REAR--;
            return item;
        }
        return 0;
    }
    public void display(){
        if(REAR==QSIZE-1){
            System.out.println("queue is empty");
        }
        else{
            for(int i=FRONT;i<=REAR;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println("");
        }
    }
}
public class PriorityQueue {
    public static void main(String[] args) {
        PriorityQu pq=new PriorityQu();
        pq.enqueue(10);
        pq.enqueue(5);
        pq.enqueue(2);
        pq.enqueue(10);
        pq.display();
        System.out.println("Item Deleted: "+pq.dequeue());
        pq.display();
        System.out.println("Item Deleted: "+pq.dequeue());
        pq.display();

    }
}