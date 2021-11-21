public class Teacher extends Person
{
    //ATTRIBUTS
    private static int idTeacher = 0;
    private int num;

    //CONSTRUCTEURS
    public Teacher (String name, String firstname) {
        super(name, firstname);
        this.num = idTeacher;
        idTeacher++;
    }

    //GETTERS
    public int getnum(){
        return num;
    }

    //SETTERS

    //METHODES
}