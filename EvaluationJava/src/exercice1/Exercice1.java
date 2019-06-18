package evaluationjava.exercice1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Spoichiche
 */
public class Exercice1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Saisissez un nombre ou entrez exit pout quitter le programme");
        int nb;
        boolean exit = false;
        do{
            try{
                nb = input.nextInt();
                if(nb==0){
                    System.out.println("Le nombre est zéro et pair");
                }
                else{
                    if(nb>0) System.out.print("Le nombre est positif");
                    else System.out.print("Le nombre est négatif");
                    
                    if(nb%2 == 0) System.out.println(" et pair");
                    else System.out.println(" et impair");
                }
            }
            catch (InputMismatchException e){
                if(input.next().equals("exit")){
                    System.out.println("fin du programme");
                    exit = true;
                }
                else{
                    System.out.println("erreur de saisie");
                }
            }
        } while(!exit);
    }
    
}
