package evaluationjava.exercice2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Spoichiche
 */
public class Main {
  public static void main(final String[] args) {
    final Staff myEmployees = new Staff();
    myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
    myEmployees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
    myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
    myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
    myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
    myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));
    
    List<Invoice> invoiceList = new ArrayList<>();
    invoiceList.add(new Invoice(null, 30, "Frais de déplacement - taxi"));
    invoiceList.add(new Invoice(null, 100, "Frais de notaire"));
    invoiceList.add(new Invoice(null, 300, "Frais de séjour"));
    invoiceList.add(new Invoice(null, 10, "Frais de déplacement - taxi"));
    invoiceList.add(new Invoice(null, 50, "Frais de location"));
    
    myEmployees.add(new Independant("Jake Hadit", 1, invoiceList));
    
    myEmployees.displaySalaries();
    myEmployees.displayAverageSalary();
  }
}
