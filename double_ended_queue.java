package queue;

interface Queue3{
    public void enqueueFront(int data);
    public void enqueueRear(int data);
    public int dequeueFront();
    public int dequeueRear();
    public void view();

}

class Deque implements Queue3 {
    int QSIZE=5;
    int FRONT=-1,REAR=-1;
    int queue[]=new int[QSIZE];

    public void enqueueFront(int data){
        if(FRONT==-1){
            FRONT=0;
            queue[FRONT]=data;
            REAR++;
        }
        else{
            if(REAR>=QSIZE-1){
                System.out.println("Queue overflow");
            }
            else{
                //shift the values one step ahead
                for(int i=REAR;i>=FRONT;i--){
                    queue[i+1]=queue[i];
                }
                REAR++;
                queue[FRONT]=data;
            }
        }
    }
    public void enqueueRear(int data){
        if(REAR>=QSIZE){
            System.out.println("QUeue overflow");
        }
        else{
            if(FRONT==-1)
                FRONT=0;
            REAR++;
            queue[REAR]=data;
        }
    }
    public int dequeueFront(){
        if(FRONT==-1||FRONT>REAR){
            System.out.println("Queue Underflow");
        }
        else{
            int item=queue[FRONT];
            //queue[FRONT]=0;
            FRONT++;
            return item;
            //System.out.println("Deleted Item from Front: "+item);
        }
        return 0;
    }
    public int dequeueRear(){
        if(FRONT==-1||FRONT>REAR){
            System.out.println("Queue Underflow");
        }
        else{
            int item=queue[REAR];
            //queue[REAR]=0;
            REAR--;
            return item;
           // System.out.println("Deleted Item from Rear: "+item);
        }
        return 0;
    }
    public void view(){
        if(FRONT==-1||FRONT>REAR){
            System.out.println("Empty List");
        }
        else{
            for(int i=FRONT;i<=REAR;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println("");
        }
    }
}


public class double_ended_queue {
    public static void main(String[] args) {
        Deque ob=new Deque();
        ob.enqueueRear(5);
        ob.enqueueRear(4);
        ob.enqueueRear(3);
        ob.view();
        System.out.println("Deleted From Front:"+ob.dequeueFront());
        ob.view();
        ob.enqueueFront(2);
        ob.view();
        ob.dequeueRear();
        ob.view();
    }

}
