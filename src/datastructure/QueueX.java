package datastructure;

public class QueueX {
    int front,rear,maxNum,nElement;
    int []arr;
    QueueX(int maxNum){
        this.maxNum=maxNum;
        this.front=0;
        this.rear=-1;
        this.arr=new int[maxNum];
    }

    public void insert(int val){
        if (rear==maxNum-1)rear=-1;
        rear++;
        arr[rear]=val;
        nElement++;
    }
    public int delete(){
        int val=arr[front];
        front++;
        if (front==maxNum-1)front=0;
         nElement--;
         return val;
    }
      public boolean isEmpty(){
        return nElement==0;
      }
      public  boolean isFull(){
        return nElement==maxNum-1;
      }
      public int peak(){
        return arr[front];
      }
}
