package functionalinterface;

import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        //normal java function
         getCustomer(new Customer("Hassan","010155452"));
         //Consumer
        Customer t=new Customer("sjdssd","5201");
        List<Customer>get= List.of(
                new Customer("sjdssd","5201"),
                new Customer("hassan","5201"),
                new Customer("amr","5201"),
                new Customer("ahmed","5201"),
                new Customer("uidjn","5201")
        );
        for (Customer x:get
             ) {
          getUser.accept(x);
        }
        //BiConsumer

        getUserPhone.accept(new Customer("Ibrahim","1001584"),false);
    }
    static Consumer<Customer>getUser=customer ->
            System.out.println("Hi "+customer.name+
                    " your phone number is "+
                    customer.phone);
   static BiConsumer<Customer,Boolean>getUserPhone=(customer, aBoolean) ->
           System.out.println("Hi "+customer.name+" your phone number is "+ (aBoolean?customer.phone:"*********"));
    static void getCustomer(Customer customer){
        System.out.println("Hi "+customer.name+" your phone number is "+customer.phone);
    }
    static class Customer{
       final String name;
       final String phone;
        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

    }
}
