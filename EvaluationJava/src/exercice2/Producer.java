package evaluationjava.exercice2;

/**
 *
 * @author Spoichiche
 */
public class Producer extends Salaried{
    
    protected int unitProduced;
    
    public Producer(String lastName, String firstName, int age, String entryYear, int unitProduced) {
        super(lastName, firstName, age, entryYear);
        this.unitProduced = unitProduced;
        this.salary = unitProduced*5;
    }

}
