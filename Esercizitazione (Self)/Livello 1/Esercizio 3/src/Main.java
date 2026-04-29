import java.util.Scanner;

/**
 * Esercizio sul costrutto switch con enum.
 * Converte l'input testuale in un valore MovieRating e stampa il messaggio associato.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Valuta il film (Scrivi: EXCELLENT, AVERAGE, o BAD): ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next().toUpperCase();

        // valueOf mappa la stringa al corrispondente valore dell'enum.
        MovieRating input = MovieRating.valueOf(userInput);
        switch (input) {
            case EXCELLENT:
                System.out.println("Hai valutato questo film ECCELLENTE");
                break;
            case AVERAGE:
                System.out.println("Hai valutato questo film NELLA MEDIA");
                break;
            case BAD:
                System.out.println("Hai valutato questo film BRUTTO");
                break;
            default:
                System.out.println("Valutazione inesistente");
                break;
        }

        scanner.close();
    }
}
