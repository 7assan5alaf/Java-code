package solve_oop;

/*
 example 9
 please create public clup and private clup to save player
Look
Please make sure of them to not use any codeing of other 🙂
 */
public class ClubPlayer {
    private String id,name,age;

    public ClubPlayer() {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
 interface  PrivateClub{
     ClubPlayer savePlayer(ClubPlayer clubFc);
}
interface PublicClub{
    ClubPlayer savePlayer(ClubPlayer clubFc);
}
final class ImplementPrivateClub implements PrivateClub{

    @Override
    public ClubPlayer savePlayer(ClubPlayer clubFc) {
        return clubFc;
    }
}
final class ImplementPublicClub implements PublicClub{

    @Override
    public ClubPlayer savePlayer(ClubPlayer clubFc) {
        return clubFc;
    }
}
