package evaluationjava.exercice2;

/**
 *
 * @author Spoichiche
 */
public class WharehousemanWithRisk extends Wharehouseman{
    
    public WharehousemanWithRisk(String lastName, String firstName, int age, String entryYear, int hoursWorked) {
        super(lastName, firstName, age, entryYear, hoursWorked);
        this.salary += 200;
    }
    
}
