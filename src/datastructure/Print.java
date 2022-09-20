package datastructure;

public class Print {
    public static void main(String[] args) {

        LinkedList ls=new LinkedList();
        ls.add(10);
        ls.add(15);
        ls.add(1);
        ls.add(30);
        ls.add(17);
        ls.add_First(47);
        ls.display();
        System.out.println(ls.search(1));
    }
}
