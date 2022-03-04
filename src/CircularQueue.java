class circular_queue_with_array{
    int arr[];
    int size;
    int f=-1,r=-1;
    circular_queue_with_array(int size){
        this.size = size;
        arr=new int[size];
    }
    public void enqueue(int i){
        if(r==(r+1)%size){
            System.out.println("Overflow;");
        }
        else {
            if (f == -1 && r == -1) {
                f = 0;
                r = 0;
                arr[r] = i;
            }
            else {
                r = (r + 1)%size;
                arr[r] = i;
            }
        }
    }
    public void dequeue(){
        if(f==-1 && r==-1){
            System.out.println("Underflow");
        }
        else if(f==r){
            System.out.println("Underflow");
            f=r=-1;
        }
        else{
            f=(f+1)%size;
        }
    }
    public void display(){
        int i;
        System.out.println("Items are : ");
        for(i=f;i!=r;i=(i+1)%size){
            System.out.println(arr[i]);
        }
        System.out.println(arr[i]);
    }
}
public class CircularQueue{
    public static void main(String[] args) {
        queue_with_array qa = new queue_with_array(1000);
        qa.enqueue(1);
        qa.enqueue(2);
        qa.enqueue(3);
        qa.dequeue();
        qa.display();
    }
}