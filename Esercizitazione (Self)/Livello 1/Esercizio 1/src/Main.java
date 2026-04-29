import java.util.Scanner;

/**
 * Esercizio introduttivo su input da tastiera e tipi numerici.
 * Mostra come leggere un valore con Scanner e stamparlo a video.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Acquisizione di un intero digitato dall'utente.
        System.out.println("Inserisci un numero da 1 a 99: ");
        Integer number = scanner.nextInt();

        // Output formattato con placeholder %d per interi.
        System.out.printf("Il numero inserito é %d", number);
    }
}
