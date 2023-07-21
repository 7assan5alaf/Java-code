package solve_oop;

/*
  example 7
  Please Create App that accept
id , name , number , Fcode of clupFc and
id , name , number , Rcode of clupRel
of Player
print
id , name , number
id , name , number , code
 */
public class Club {
    private int id;
    private String name;
    private int number;
    public Club(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
class ClubFc extends Club{
    private int codeFc;

    public ClubFc() {
    }

    public int getCodeFc() {
        return codeFc;
    }

    public void setCodeFc(int codeFc) {
        this.codeFc = codeFc;
    }
}
class ClubR extends Club{
    private int codeR;
    public ClubR(){

    }
    public int getCodeR() {
        return codeR;
    }

    public void setCodeR(int codeR) {
        this.codeR = codeR;
    }
}
interface ClubService{
    void printClub(Club club);
}
interface ClubFcService{
    void printClubFc(ClubFc clubFc);
}
interface ClubRService{
    void printClubR(ClubR clubR);
}
 class ImplementClubRService implements ClubService,ClubRService{

     @Override
     public void printClub(Club club) {
         System.out.println(club.getName()+" "+club.getId()+" "+club.getNumber());
     }

     @Override
     public void printClubR(ClubR clubR) {
         System.out.println("id: "+clubR.getId()+"\nnumber: "+clubR.getNumber()+"\ncode: "+clubR.getCodeR()+"\nname: "+clubR.getNumber());
     }
 }
class ImplementClubFcService implements ClubFcService,ClubService{

    @Override
    public void printClub(Club club) {
        System.out.println(club.getName()+" "+club.getId()+" "+club.getNumber());
    }

    @Override
    public void printClubFc(ClubFc clubFc) {
        System.out.println("id: "+clubFc.getId()+"\nnumber: "+clubFc.getNumber()+"\ncode: "+clubFc.getCodeFc()+"\nname: "+clubFc.getNumber());
    }
}