package evaluationjava.exercice2;

import java.util.List;

/**
 *
 * @author Spoichiche
 */
public class Independant extends Employee{
    
    protected String name;
    protected int siren;
    protected List<Invoice> invoices;
    
    public Independant(String name, int siren, List<Invoice> invoices) {
        this.name = name;
        this.siren = siren;
        this.invoices = invoices;
        
        double total = 0;
        for(Invoice invoice : invoices){
            if(!invoice.isTravellingExpense()) total += invoice.getAmount();
        }
        this.salary = total;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public String toString(){
        return "Employé independant "+name+" : "+salary+" €";
    }
}
