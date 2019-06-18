package evaluationjava.exercice8;

/**
 *
 * @author Spoichiche
 */
class Moyenne1 {
  public static void main(String[] args) {
    double noteProgrammation = 6.0;
    double noteAlgebre = 5.0;
    System.out.println("Ma moyenne est " + (noteProgrammation++ + noteAlgebre) / 2.0 );
  }
}
/*
Result : "Ma Moyenne est 5.5"
l'opérateur ++ mis après la variable noteProgrammation indique que la variable sera incrémenté
après d'être évaluée.
A l'éxécution, lors de l'évaluation de l'expression "(noteProgrammation++ + noteAlgebre) / 2.0"
noteProgrammation vaut 6.0. Donc (6 + 5)/2 = 5
*/

class Moyenne2 {
  public static void main(String[] args) {
    double noteProgrammation = 6.0;
    double noteAlgebre = 5.0;
    System.out.println("Ma moyenne est " + (++noteProgrammation + noteAlgebre) / 2.0 );
  }
}
/*
Result : "Ma Moyenne est 6.0"
l'opérateur ++ mis avant la variable noteProgrammation indique que la variable sera incrémenté
avant d'être évaluée.
A l'éxécution, lors de l'évaluation de l'expression "(noteProgrammation++ + noteAlgebre) / 2.0"
noteProgrammation vaut 7.0. Donc (7 + 5)/2 = 6
*/