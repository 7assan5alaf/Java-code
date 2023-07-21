package solve_oop;
import java.util.Scanner;
import Restaurant.*;
public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        Client client=new Client();
        client.setPassword("2ssd1sdds");
        client.setUsername("hassan");
        client.setId("asisdk");

        Order order=new Order();
        order.setName("checkenBergar");
        order.setPrice(250);
        order.setId("dsjfuj");
        order.setClient(client);
        Food f=new Food();
        f.setCategory("checken");
        f.setId("isiamas");
        f.setOrder(order);
        order.getFoods().add(f);
        Gift gift=new Gift();
        gift.setCode("iw3eo9");
        gift.setId("dfidgdfsf");
        gift.setClient(client);

        client.setGift(gift);
        client.getOrders().add(order);
        ImplementService implementService=new ImplementService();
        System.out.println(implementService.printDetails(client));

    }
}
