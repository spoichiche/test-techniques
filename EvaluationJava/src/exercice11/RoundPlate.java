package evaluationjava.exercice11;

/**
 *
 * @author Spoichiche
 */
public class RoundPlate extends Plate {
    
    protected double radius;
    
    public RoundPlate(int fabricationYear, double radius) {
        super(fabricationYear);
        this.radius = radius;
    }

    @Override
    public double calculateSurface() {
        return Math.PI*radius*radius;
    }
    
    public String toString(){
        return "Assiette ronde, "+fabricationYear+", "+radius;
    }
}
