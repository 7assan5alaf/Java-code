package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    private String id,name;
    private List<Order>orders=new ArrayList<>();
    private Client client=new Client();
    public Bill() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
