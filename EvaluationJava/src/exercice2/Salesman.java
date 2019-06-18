package evaluationjava.exercice2;

/**
 *
 * @author Spoichiche
 */
public class Salesman extends Salaried{
    
    protected int sales;

    public Salesman(String lastName, String firstName, int age, String entryYear, int sales){
        super(lastName, firstName, age, entryYear);
        this.sales = sales;
        this.salary = (sales*20/100)+400;
    }
    
}
