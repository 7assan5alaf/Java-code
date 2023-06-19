package datastructure;

public class PQueueX {
    int front,nElement,size;
    int []data;
    public PQueueX(int size){
        this.size=size;
        this.front=0;
        data=new int[this.size];
    }
    public void add(int val){
        if (front==0){
            data[front]=val;
            front++;
            nElement++;
        }else {
            int i;
            for (i=front-1;i>=0;i--){
                if (val>data[i]){
                    data[i+1]=data[i];
                }
                else break;
            }
            data[i+1]=val;
            front++;
            nElement++;
        }
    }

    public int peak(){
        return data[front-1];
    }
    public int delete(){
        front--;
        int val=data[front];
        nElement--;
        return val;
    }
    public boolean isEmpty(){
        return nElement==0;
    }
    public void display(){
       for (int i:data) System.out.print(i+" ");
    }
}
