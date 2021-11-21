public class Person
{
    //ATTRIBUTS
    private static int idPerson = 0;
    private int id;
    private String name;
    private String firstname;

    //CONSTRUCTEURS
    public Person(String name, String firstname) {
        this.id = idPerson;
        idPerson++;
        this.name = name;
        this.firstname = firstname;
    }

    //GETTERS
    public int getId() {
        return idPerson;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    //METHODES
}