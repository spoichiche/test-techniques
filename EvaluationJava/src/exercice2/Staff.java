package evaluationjava.exercice2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Spoichiche
 */
public class Staff extends ArrayList<Employee>{
    
    public void displaySalaries(){
        Iterator<Employee> it = iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
    
    public void displayAverageSalary(){
        Iterator<Employee> it = iterator();
        double average = 0;
        while(it.hasNext()){
            average += it.next().getSalary();
        }
        average = average/size();
        System.out.println("Valeur du salaire moyen "+average);
    }
}
