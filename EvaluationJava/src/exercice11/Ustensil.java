package evaluationjava.exercice11;

import java.util.Calendar;

/**
 *
 * @author Spoichiche
 */
abstract public class Ustensil {
    
    protected int fabricationYear;
    
    public Ustensil(int fabricationYear){
        this.fabricationYear = fabricationYear;
    }
    
    public double calculateValue(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if( (currentYear-fabricationYear) < 50){
            return 0.0;
        } else {
            return currentYear - fabricationYear - 50;
        }
    }
    
    abstract public String toString();
    
    public int getFabricationYear(){
        return fabricationYear;
    }
    public void setFabricationYear(int fabricationYear){
        this.fabricationYear = fabricationYear;
    }
    
}