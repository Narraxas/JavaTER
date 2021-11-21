public class Student extends Person
{
    //ATTRIBUTS
    private static int idStudent = 0;
    private int num;
    private Group group;

    //CONSTRUCTEURS
    public Student (String name, String firstname) {
        super(name, firstname);
        this.num = idStudent;
        idStudent++;
        this.group = null;
    }

    //GETTERS
    public int getNum() {
        return num;
    }

    //METHODES
}