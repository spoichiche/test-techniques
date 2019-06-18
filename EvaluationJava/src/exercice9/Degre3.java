package evaluationjava.exercice9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Spoichiche
 */
public class Degre3 {
    
    private static Scanner input = new Scanner(System.in);
    
    public static int readInt(String inputName){
        int res = 0;
        boolean stop = false;
        System.out.println("Entrez "+inputName+" (int) : ");
        
        while(!stop){
            try{
                res = input.nextInt();
                stop = true;
            }
            catch (InputMismatchException e){
                System.out.println("erreur de saisie");
                input.next();
                System.out.println("Entrez "+inputName+" (int) : ");
            }
        }
        return res;
    }
    
    public static double readDouble(String inputName){
        double res = 0;
        boolean stop = false;
        System.out.println("Entrez "+inputName+" (double) : ");
        
        while(!stop){
            try{
                res = input.nextDouble();
                stop = true;
            }
            catch (InputMismatchException e){
                System.out.println("erreur de saisie");
                input.next();
                System.out.println("Entrez "+inputName+" (double) : ");
            }
        }
        return res;
    }
    
    public static double calculatePolynome(int a, int b, int c, double x){
        return (((a+b)/2.0)*Math.pow(x, 3.0)) +
               (Math.pow(a+b,2.0)*Math.pow(x, 2.0)) +
               (a+b+c);
    }
    
    public static void main(String args[]){
        int a = readInt("a");
        int b = readInt("b");
        int c = readInt("c");
        double x = readDouble("x");
        
        System.out.println("Valeur du polynome : "+calculatePolynome(a, b, c, x));
    }
    
}
