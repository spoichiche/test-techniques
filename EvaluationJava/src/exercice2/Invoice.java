package evaluationjava.exercice2;

import java.util.Date;

/**
 *
 * @author Spoichiche
 */
public class Invoice {
    
    protected Date date;
    protected int amount;
    protected String label;
    
    public Invoice(Date date, int amount, String label){
        this.date = date;
        this.amount = amount;
        this.label = label;
    }
    
    public boolean isTravellingExpense(){
        return label.startsWith("Frais de déplacement - ");
    }
    
    public int getAmount(){
        return amount;
    }
}
