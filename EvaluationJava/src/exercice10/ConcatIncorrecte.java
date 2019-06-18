package evaluationjava.exercice10;

/**
 *
 * @author Spoichiche
 */
class ConcatIncorrecte {
    public static void main(String[] args) {
        String s = "China Blue";
        System.out.println(s);
        concat(s, " Express");
        System.out.println(s);
    }

    public static void concat(String s, String s2) {
          s +=s2;
    }
}

/*

La concaténation ne fonctionne pas.
Lors de l'éxécution de l'appel de la fonction concat(s, " Express"), 2 nouvelles références sont crées.
Une nouvelle référence s, différente de la référence s dans le main, qui pointe vers l'objet "China Blue".
Et une nouvelle référence s2 qui pointe vers l'objet " Express".
A l'instruction s +=s2; c'est la nouvelle référence s que l'on fait pointer vers un nouvel objet "China Blue Express".
La référence s du main reste inchangée.
*/