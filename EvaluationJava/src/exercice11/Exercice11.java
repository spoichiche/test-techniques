package evaluationjava.exercice11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Spoichiche
 */
public class Exercice11 {
    
    public static List<String> extractData(String filename){
        File file = new File(filename);
        List<String> lineList = new ArrayList<>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));                
            String line = br.readLine();
            
            //saut de la première ligne
            line = br.readLine();
            
            while(line != null){            
                lineList.add(line);
                line = br.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return lineList;
    }
    
    public static List<Ustensil> parseData(List<String> lineList){
        List<Ustensil> ustensilList = new ArrayList<>();
        for(String line : lineList){
            //System.out.println(line);
            String[] columns = line.split(",");
            
            switch (columns[0]){
                case "cuillière":
                    ustensilList.add(new Spoon(parseInt(columns[1]), parseDouble(columns[2])));
                    break;
                case "Assiette ronde":
                    ustensilList.add(new RoundPlate(parseInt(columns[1]), parseDouble(columns[2])));
                    break;
                case "Assiette carré":
                    ustensilList.add(new SquarePlate(parseInt(columns[1]), parseDouble(columns[2])));
                    break;
                default:
                    break;
            }
        }
        return ustensilList;
    }
    
    public static int numberOfSpoon(List<Ustensil> list){
        int numberOfSpoon = 0;
        for(Ustensil u : list){
            if(u instanceof Spoon){
                numberOfSpoon++;
            }
        }
        return numberOfSpoon;
    }
    
    public static double totalPlateSurface(List<Ustensil> list){
        double totalSurface = 0;
        for(Ustensil u : list){
            if(u instanceof Plate){
                totalSurface += ((Plate) u).calculateSurface();
            }
        }
        return totalSurface;
    }
    
    public static double totalValue(List<Ustensil> list){
        double totalValue = 0;
        for(Ustensil u : list){
            System.out.println(u.calculateValue());
            totalValue += u.calculateValue();
        }
        return totalValue;
    }
    
    public static void main(String args[]){
        
        String filename = "Liste des ustensiles de grand-mère - Feuille 1.csv";
        List<String> lineList = extractData(filename);
        List<Ustensil> ustensilList = parseData(lineList);
        for(Ustensil u : ustensilList){
            System.out.println(u.toString());
        }
        System.out.println("\n"+numberOfSpoon(ustensilList));
        System.out.println(totalPlateSurface(ustensilList));
        System.out.println(totalValue(ustensilList));
    }
    
}
