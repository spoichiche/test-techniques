package evaluationjava.exercice2;

/**
 *
 * @author Spoichiche
 */
public class Wharehouseman extends Salaried{
    
    protected int hoursWorked;
    
    public Wharehouseman(String lastName, String firstName, int age, String entryYear, int hoursWorked) {
        super(lastName, firstName, age, entryYear);
        this.hoursWorked = hoursWorked;
        this.salary = hoursWorked*65;
    }
}
