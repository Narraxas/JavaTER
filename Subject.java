import java.util.HashMap;

public class Subject
{
    //ATTRIBUTS
    public static int idSubject = 0;
    public int id;
    public String title;

    //CONSTRUCTEUR
    public Subject (String title) {
        this.title = title;
        id = idSubject;
        idSubject++;
    }

    //SETTERS
    public void setTitle (String title) {
        this.title = title;
    }
    //GETTERS
    public int getId(){
        return id;
    }
    public String getTitle(){
        return this.title;
    }

    //METHODES
}