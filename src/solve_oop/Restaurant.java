package solve_oop;
/*
example 11
please create app resturant contain class has
(
	add order  with impl,
	show order with no impl
)
and create another class to controll it

 */
public class Restaurant {
    private String id,order;

    public Restaurant() {
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
interface ServiceOrder{
    Restaurant addOrder(Restaurant restaurant);
    String  showDetails(Restaurant restaurant);
}
abstract class ImplementOrderService implements ServiceOrder{

    @Override
    public Restaurant addOrder(Restaurant restaurant) {
        System.out.println("add order");
        return restaurant;
    }

    @Override
    public abstract String showDetails(Restaurant restaurant);
}
class ImplementAbstractMethodsFromOrderService extends ImplementOrderService{

    @Override
    public String showDetails(Restaurant restaurant) {
        return restaurant.getOrder()+" "+restaurant.getId();
    }
}