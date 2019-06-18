package evaluationjava.exercice11;

/**
 *
 * @author Spoichiche
 */
public class Spoon extends Ustensil {
    
    private double length;

    public Spoon(int fabricationYear) {
        super(fabricationYear);
    }
    
    public Spoon(int fabricationYear, double length){
        super(fabricationYear);
        this.length = length;
    }
    
    public String toString(){
        return "Cuillère, "+fabricationYear+", "+length;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
}