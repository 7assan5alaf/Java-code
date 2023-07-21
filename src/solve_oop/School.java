package solve_oop;

/*
example 10
Please Create App school with
base Impl (add student , show student) ---> can't create object
another impl contain same base impl but create new add student to print on it that you are on add student
another impl contain same base impl but create new show student to print on it that you are on show student
thank !
 */
public class School {
    private String id,name;

    public School() {
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
interface StudentService{
    School saveStudent(School school);
    String displayStudent(School school);
}
abstract class ImplementStudent implements StudentService{

    @Override
    public School saveStudent(School school) {
        return school;
    }

    @Override
    public String displayStudent(School school) {
        return school.getName()+" "+school.getId();
    }
}
class ImplementStudent1 extends ImplementStudent{
    @Override
    public String displayStudent(School school) {
        System.out.println("you are on show student");
        return super.displayStudent(school);
    }

    @Override
    public School saveStudent(School school) {
        System.out.println("you are on add student");
        return super.saveStudent(school);
    }
}