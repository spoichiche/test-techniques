package evaluationjava.exercice11;

/**
 *
 * @author Spoichiche
 */
abstract public class Plate extends Ustensil {
    
    public Plate(int fabricationYear){
        super(fabricationYear);
    }
    
    abstract public double calculateSurface();
    
}
