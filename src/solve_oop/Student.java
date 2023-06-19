package solve_oop;


//example 1---->
// Please Create App that accept id , name and age of Student and print them (with oop)
public class Student {
     private int id;
     private String name;
     private int age;
    public Student(){
        this.age=0;
        this.name=null;
        this.id=0;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("age: "+this.age+"\n"+"name: "+this.name+"\n"+"id: "+this.id);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

