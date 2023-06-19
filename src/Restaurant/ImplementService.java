package Restaurant;

public class ImplementService implements DetailsService{
    @Override
    public String printDetails(Client client) {
        return "name: "+client.getUsername()+"\norder: "+client.getOrders().get(0).getName()
                +"\nprice: "+client.getOrders().get(0).getPrice()+"\ncode of discount: "+client.getGift().getCode()
                ;
    }
}
