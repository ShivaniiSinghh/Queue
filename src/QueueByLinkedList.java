class queue_with_ll{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    Node front = null;
    Node rear = null;

    public void enqueue(int data){
        Node newnode = new Node(data);
        if(front ==null) {
            front = newnode;
            rear = newnode;
        }
        else{
            rear.next = newnode;
            rear = newnode;
        }
    }
    public void dequeue(){
        if(front==null && rear ==null){
            System.out.println("Underflow");
        }
        else{
            front = front.next;
        }
    }
    public void display(){
        Node temp = front;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class QueueByLinkedList {
    public static void main(String[] args) {
        queue_with_ll ql = new queue_with_ll();
        ql.enqueue(1);
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(4);
        ql.dequeue();
        ql.display();
    }
}
