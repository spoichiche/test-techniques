package evaluationjava.exercice11;

import java.util.Calendar;

/**
 *
 * @author Spoichiche
 */
public class SquarePlate extends Plate{
    
    protected double cote;
    
    public SquarePlate(int fabricationYear, double cote) {
        super(fabricationYear);
        this.cote = cote;
    }

    @Override
    public double calculateSurface() {
        return cote*cote;
    }
    
    @Override
    public double calculateValue(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if( (currentYear-fabricationYear) < 50){
            return 0.0;
        } else {
            return (currentYear - fabricationYear - 50)*5;
        }
    }
    
    public String toString(){
        return "Assiette carré, "+fabricationYear+", "+cote;
    }
    
    public double getCote(){
        return cote;
    }
}
