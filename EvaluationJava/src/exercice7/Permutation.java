package evaluationjava.exercice7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Spoichiche
 */
public class Permutation {
    
    private static Scanner input = new Scanner(System.in);
    
    public static int readInput(String inputName){
        int res = 0;
        boolean stop = false;
        System.out.println("Entrez "+inputName+": ");
        
        while(!stop){
            try{
                res = input.nextInt();
                stop = true;
            }
            catch (InputMismatchException e){
                System.out.println("erreur de saisie");
                input.next();
                System.out.println("Entrez "+inputName+": ");
            }
        }
        return res;
    }
    
    public static void main(String args[]){
        
        int x = readInput("x");
        int y = readInput("y");
        
        System.out.println("Avant permutation:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("Après permutation:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
