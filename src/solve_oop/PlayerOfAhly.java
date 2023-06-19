package solve_oop;

public class PlayerOfAhly {
    private String id,name,club;
    private Shirt shirt;
    public PlayerOfAhly() {
    }

    public Shirt getShirt() {
        return shirt;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
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

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
class Shirt{
    private String id,number,color;
    private PlayerOfAhly player;

    public Shirt() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PlayerOfAhly getPlayer() {
        return player;
    }

    public void setPlayer(PlayerOfAhly player) {
        this.player = player;
    }
}
interface PlayerOfAhlyService{
    String printDetails(PlayerOfAhly player);
}
class ImplementPlayerService implements PlayerOfAhlyService{

    @Override
    public String printDetails(PlayerOfAhly player) {
        return player.getId()+"\n"+player.getName()+"\n"+player.getClub()+"\n"+player.getShirt().getNumber();
    }
}