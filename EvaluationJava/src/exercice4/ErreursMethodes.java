package evaluationjava.exercice4;

/**
 *
 * @author Spoichiche
 */
class ErreursMethodes {

  public static void main (String[] args) { 
    int i1 = methode1();
    int i2 = methode2();
    int i3 = methode3();
    int i4 = methode4();
    methode5();
    methode6();
    methode7();
    methode8();
  }
  
  
 /*
  Erreur de syntaxe dans la déclaration de la méthode, il manque des parenthèses.
  */
  
  static int methode1 { //static int methode1() {  <-- solution
    int a = 0;
    System.out.println("Méthode 1");
    return a;
  }

  /*
  Erreur de syntaxe dans la déclaration de la variable i1. Il manque le type de la variable.
  */
  static int methode2 () {
    int a = 0; // int i1 = 10;     <-- solution
    i1 = 10;
    System.out.println("Méthode 2");
    return a;
  }

  /*
  Erreur dans le type de retour de la méthode. Elle est déclarée comme retournant un int mais
  ne retourne pas d'entier.
  */
  static int methode3 () { // static void methode3() {   <-- solution 1
    int a = 0;
    System.out.println("Méthode 3");
    //return a;     <-- solution 2
  }

  /*
  Erreur dans le type retourné par la méthode. Elle est déclarée comme retournant un entier mais
  retourne une chaine.
  */
  static int methode4 () { //static String methode4() {  <-- solution
    String a = "0";
    System.out.println("Méthode 4");
    return a;
  }

  /*
  Erreur dans le type retourné par la méthode. Elle est déclarée comme retournant rien mais
  retourne un double.
  */
  static void methode5 () {  // static double methode5() {  <-- solution 1
    double a = 0;
    System.out.println("Méthode 5");
    return a;  // supprimé cette ligne  <-- solution 2
  }

  /*
  Erreur de syntaxe méthode sans type de retour.
  */
  static methode6 () {  // static double methode6() {  <-- solution
    double a = 0;
    System.out.println("Méthode 6");
    return a;
  }

  /*
  Erreur dans l'appel de la méthode methodeSansErreur, il manque un paramètre.
  */
  static void methode7 () {
    int a = 0;
    double b = 5.5;
    methodeSansErreur(a); //methodeSansErreur(a, b);  <-- solution
    System.out.println("Méthode 7");
  }

  /*
  Erreur dans l'appel de la méthode methodeSansErreur, le type du paramêtre 'b' ne correspond pas
  */
  static void methode8 () {
    int a = 0;
    String b = "5.5"; //double b = 5.5;     <-- solution 
    methodeSansErreur(a, b);
    System.out.println("Méthode 8");
  }

  static void methodeSansErreur (int a, double b) {
    // Cette méthode ne fait rien du tout
  }
}
