import java.time.LocalDate;


public class Planification
{
    //ATTRIBUTS
    private LocalDate [] DaysSubmission;
    private LocalDate start;
    private LocalDate end;;

    //CONSTRUCTEUR
    public Planification (LocalDate[] DaysSubmission, LocalDate start, LocalDate end) {
        this.DaysSubmission = DaysSubmission;
        this.start = start;
        this.end = end;
    }

    //GETTERS
    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public LocalDate[] getDaysSubmission() {
        return DaysSubmission;
    }

    //SETTERS
    public void setStart(LocalDate start) {
    this.start = start;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }


    public void setDaysSubmission(LocalDate [] DaysSubmission) {
        this.DaysSubmission = DaysSubmission;
    }
    //METHODES
}