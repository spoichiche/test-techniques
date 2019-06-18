package evaluationjava.exercice2;

/**
 *
 * @author Spoichiche
 */
public class ProducerWithRisk extends Producer{

    public ProducerWithRisk(String lastName, String firstName, int age, String entryYear, int unitProduced) {
        super(lastName, firstName, age, entryYear, unitProduced);
        this.salary += 200;
    }
}
