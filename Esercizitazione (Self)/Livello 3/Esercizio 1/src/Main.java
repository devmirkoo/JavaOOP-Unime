import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] temperature = new double[7];
        double summ = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i =  0; i <= temperature.length - 1; i++) {
            System.out.printf("Inserisci temperatura del giorno %d: ", i + 1 );
            temperature[i] = scanner.nextDouble();
        }

        for(int k = 0; k < temperature.length; k++){
            summ += temperature[k];
        }

        System.out.printf("La media della temperatura settimanale è: %.2f", summ / temperature.length);
    }
}
