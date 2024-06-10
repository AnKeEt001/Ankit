


   // Circular queue
//it is used to prevent the limitation of simple queue using array implementation where a situation arises if queue is empty at that time also data cannot be inserted.using this we can insert data if queue is empty.


        package queue;

interface Queu{
    void enqueue(int data);
    int dequeue();
    void display();
}
class CQueue implements Queu{
    int FRONT=-1,REAR=-1;
    int QSIZE=5;
    int queue[]=new int[QSIZE];

    public void enqueue(int data){
        if(REAR==QSIZE-1 && FRONT==0){
            System.out.println("Queue is full");
        }
        else{
            if(FRONT==-1)
                FRONT++;
            REAR=(REAR+1)%QSIZE;
            queue[REAR]=data;
        }
    }
    public int dequeue(){
        if(FRONT==-1){
            System.out.println("Queue underflow");
        }
        else{
            int item=queue[FRONT];
            FRONT++;
            return item;
        }
        return 0;
    }
    public void display(){
        if(FRONT==-1){
            System.out.println("Empty Queue");
        }
        else{

            if(REAR>=FRONT){
                //print elements FROM FRONT TO REAR
                for(int i=FRONT;i<=REAR;i++){
                    System.out.print(queue[i]+" ");
                }
                System.out.println("");
            }
            else{
                //print elements from FRONT TO QSIZE-1 and
                //then 0 to REAR
                for(int i=FRONT;i<QSIZE;i++)
                    System.out.print(queue[i]+" ");
                for(int i=0;i<=REAR;i++)
                    System.out.println(queue[i]+" ");
                System.out.println("");
            }

        }
    }
}
public class circular_queue {
    public static void main(String[] args) {
        CQueue cq=new CQueue();
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();

        System.out.println("Deleted Item: "+cq.dequeue());
        cq.display();
        System.out.println("Deleted Item: "+cq.dequeue());
        cq.display();
        cq.enqueue(60);
        cq.display();
    }
}
