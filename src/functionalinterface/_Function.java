package functionalinterface;

import java.util.Scanner;
import java.util.function.Function;

public class _Function {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        String  x=in.next();
        System.out.println(xyz.apply(x));
        //Function takes 1 argument to produce 1 argument
//        Function<Integer, Integer> num=incrementNum.andThen(multipNum);
//        System.out.println(num.apply(x));
        //BioFunction takes 2 argument to produce 1 argument
//        int n=in.nextInt(),z=in.nextInt();
//        Integer produce=incrementOneNumByMultiplyOneNum.apply(n,z);
//        System.out.println(produce);

    }
    //static Function<Integer,Integer>incrementNum=number->number+=2;
    static  Function<String,Integer>xyz=s -> Integer.parseInt(String.valueOf(s.charAt(2))+
                    String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1)))+
                    Integer.parseInt(String.valueOf(s.charAt(1))+
                    String.valueOf(s.charAt(2))+String.valueOf(s.charAt(0)))
                    +Integer.parseInt(s);
//    static Function<Integer,Integer>multipNum=number->(number*10);
//    static BiFunction<Integer,Integer,Integer>incrementOneNumByMultiplyOneNum=
//            (num1,num2)->(num1+1)*num2;
}
