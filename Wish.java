import java.util.HashMap;

public class Wish
{
    //ATTRIBUTS
    private HashMap<Integer, Subject> ListWish;
    //CONSTRUCTEURS
    public Wish (HashMap<Integer, Subject> ListWish) {
        if (ListWish.size() < 1 || ListWish.size() > 5)
            System.err.println("Error: You can only create a list of Wish with a number of wish between 1 and 5.");
        else
            this.ListWish = ListWish;
    }

    //SETTERS

    //GETTERS
    public HashMap<Integer, Subject> getListWish() {
        return this.ListWish;
    }

    //METHODES
}