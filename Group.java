
import java.util.ArrayList;

public class Group
{
    //ATTRIBUTS
    private static int idGroup = 0;
    private int id;
    private String nameGroup;
    private ArrayList<Student> students;

    //CONSTRUCTEURS
    public Group(String nameGroup) {
        this.id = idGroup;
        idGroup++;
        this.nameGroup = nameGroup;
        this.students = new ArrayList<Student>();
    }

    public Group(String nameGroup, ArrayList<Student> students) {
        this.id = idGroup;
        idGroup++;
        this.nameGroup = nameGroup;
        if (students.size() < 2 || students.size() > 5)
            System.err.println("Error: You can only create a group with a number of students between 2 and 5.");
        else
            this.students = students;
    }

    //SETTERS
    public void setnameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    //GETTERS
    public String getnameGroup() {
        return this.nameGroup;
    }

    public int getid() {
        return this.id;
    }

    //METHODES
}