package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("01011665481"));
        System.out.println(isPhoneNumberValid("01211665481"));
        System.out.println(isPhoneNumberValid("11211665481"));
        System.out.println(isPhoneNumberValid("112116654"));
        System.out.println(isPhoneValid.test("01211665481"));
        System.out.println("////////////////////////////////////////////////");
        System.out.println(
                isPhoneValid.and(contains).test("01211665481")
        );
        System.out.println(
                isPhoneValid.or(contains).test("11211665481")
        );
        System.out.println(
                isPhoneValid.and(contains).test("11211665481")
        );
    }
    static Boolean isPhoneNumberValid(String string){
        return string.startsWith("01")&&string.length()==11;
    }
    static Predicate<String>isPhoneValid=s ->s.startsWith("01")&&s.length()==11;
    static  Predicate<String>contains=number->number.contains("5");
}
