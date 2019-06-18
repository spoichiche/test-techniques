package evaluationjava.exercice6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Spoichiche
 */
public class Exercice6 {
    
    private static Scanner input = new Scanner(System.in);
    
    public static double readInput(String message){
        double res = 0;
        boolean stop = false;
        
        if(message.equals("Largeur ?")){
            System.out.println("Entrez la largeur: ");
        } else if(message.equals("Hauteur ?")){
            System.out.println("Entrez la hauteur: ");
        } else {
            System.out.println("Erreur de lecture. Valeur forcée à 0");
            return res;
        }
        
        while(!stop){
            try{
                res = input.nextDouble();
                stop = true;
            }
            catch (InputMismatchException e){
                System.out.println("erreur de saisie");
                input.next();
                if(message.equals("Largeur ?")){
                    System.out.println("Entrez la largeur: ");
                } else if(message.equals("Hauteur ?")){
                    System.out.println("Entrez la hauteur: ");
                }
            }
        }
        return res;
    }
    
    public static boolean testInputs(double width, double length){
        return (width >= 0 && length >= 0);
    }
    
    public static void calculate(double width, double length){
        boolean stop = false;
        while(!stop){
            System.out.println("Surface ('s/S') ou perimètre ('p/P') ?:");
            String selection = input.next();
            if(selection.equals("s") || selection.equals("S")) {
                double surface = width*length;
                System.out.println("La surface est "+surface);
                stop = true;
            }
            else if (selection.equals("p") || selection.equals("P")) {
                double perimeter = (width*2)+(length*2);
                System.out.println("Le périmètre est "+perimeter);
                stop = true;
            }
            else {
                System.out.println("Erreur : Veuillez saisir s ou p pour calculer surface ou le périmètre");
            }
        }
    }
    
    public static void displayError(){
        System.out.println("Erreur : valeurs de hauteur ou de longueur non valide");
    }
    
    public static void main(String args[]) {
        double width = readInput("Largeur ?");
        double length = readInput("Hauteur ?");

        boolean inputsOk = testInputs(width, length);
        if (inputsOk) {
            calculate(width, length);
        } else {
            displayError();
        }
    }
}
