import java.util.Scanner;

class queue_with_array{
    int arr[];
    int data;
    int size;
    int f=-1,r=-1;
    queue_with_array(int size){
        this.size = size;
        arr=new int[size];
    }
   public void enqueue(int data){
        if(r==(size-1)){
            System.out.println("Overflow;");
        }
        else {
            if (f == -1 && r == -1) {
                f = 0;
                r = 0;
                arr[r] = data;
            } else {
                r = r + 1;
                arr[r] = data;
            }
        }
    }
    public void dequeue(){
        if(f==-1 && r==-1){
            System.out.println("Underflow");
        }
        else{
            f=f+1;
        }
    }
    public void display(){
        System.out.println("Items are : ");
        for(int i=f;i<=r;i++){
            System.out.println(arr[i]);
        }
    }
}
public class QueueByArray{
    public static void main(String[] args) {
        queue_with_array qa = new queue_with_array(1000);
        qa.enqueue(1);
        qa.enqueue(2);
        qa.enqueue(3);
        qa.dequeue();
        qa.display();
    }
}
