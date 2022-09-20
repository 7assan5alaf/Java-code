package datastructure;

public class LinkedList {
    Node head=null;
    Node tail=null;
    int size=0;
    public  LinkedList(){

    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public  void add(int element){
        if (size==0){
            Node node=new Node();
            node.value=element;
            head=node;
            tail=node;
            size++;

        }else {
            Node node=new Node();
            node.value=element;
            tail.next=node;
            tail=node;
            size++;
        }
        setSize(size);
    }
    public  void add_First(int element){
        Node node=new Node();
        node.value=element;
        node.next=head;
        head=node;
        size++;
        setSize(size);
    }
    public void display(){
        Node node=head;
        while (node!=null){
            System.out.print(node.value+" ");
            node=node.next;
        }
        System.out.println();
    }
    public int search(int element){
        int ans=-1;
        Node h=head;
        while (h!=null){
            ans++;
            if ((int)h.value==element){
             return ans;
            }
            h=h.next;
        }
        return -1;
    }
    public void remove(Node node,int val){
        Node h=head;
        while ((int)h.value!=val){
          h=h.next;
        }
        h.next=node.next.next;
        size--;
    }

}
