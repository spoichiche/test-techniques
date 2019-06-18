package evaluationjava.exercice2;

/**
 *
 * @author Spoichiche
 */
abstract public class Salaried extends Employee{
    
    protected String lastName;
    protected String firstName;
    protected int age;
    protected String entryYear;
    protected double salary;
    
    public Salaried(String lastName, String firstName, int age, String entryYear){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.entryYear = entryYear;
    }
    
    public double getSalary(){
        return salary;
    };
    
    public String toString(){
        return "L'employé "+firstName+" "+lastName+" a un salaire de "+salary+" €";
    }
}
