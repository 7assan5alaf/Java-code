package solve_oop;

public class EvenNums {

    private int num1,num2,num3;
     EvenNums(){
        this.num2=0;
        this.num1=0;
        this.num3=0;
     }
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
}
class ValidationNums{
    static boolean evenNums(EvenNums e){
        if (e.getNum1()%2!=0||e.getNum2()%2!=0||e.getNum3()%2!=0)return false;
        else return true;
    }
}
class ServiceNums{
    public void printSum(EvenNums evenNums){
        if (ValidationNums.evenNums(evenNums))
            System.out.println(evenNums.getNum1()+evenNums.getNum2()+evenNums.getNum3());
        else System.out.println("one number or more is odd");
    }
}