package solve_oop;

/*
example 2
Please Create App that accept number , name of Player and print them (with oop)
look!
- make sure that number is > 0
- make sure that name size > 5
 */
public class Player {
    private int age;
    private String name;

    public Player() {
    }

    public Player(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
class ServicePlayer{
   public void print(Player p){
        if (ExeptionPlayer.isValid(p))
       System.out.println("age: "+p.getAge()+"\n"+"name: "+p.getName());
   }
}
class ExeptionPlayer{
    static boolean  isValid(Player p){
        if (p.getName().length()<=5){
            System.out.println("U can enter name bigger than "+p.getName().length());
            return false;
        }
        else if(p.getAge()<0){
            System.out.println("u can enter age bigger than "+p.getAge());
            return false;
        }
        return true;
    }
}