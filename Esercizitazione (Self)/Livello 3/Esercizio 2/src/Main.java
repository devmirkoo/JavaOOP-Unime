/*
Esercizio 2: Selection Sort su Array.
Obiettivo: Ordinare i dati implementando un algoritmo classico.
Come fare: Crea un array di numeri interi disordinati.
 Implementa l'algoritmo Selection Sort: usa due cicli for annidati.
 Il ciclo esterno scorre l'array; il ciclo interno trova l'elemento più piccolo tra quelli rimanenti.
 Scambia la posizione dell'elemento più piccolo trovato con quello corrente (usa una variabile temporanea per lo scambio).
 Stampa l'array prima e dopo l'ordinamento.
*/


public class Main {
    public  static void  printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int space = 10;
        int[] array = new int[space];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 30 + 1);
        }

        printArray(array);

       for (int k = 0; k < space - 1; k++) {
           int minIndex = k;
           for (int j = k + 1; j < space; j++) {
               if (array[j] < array[minIndex]) {
                   minIndex = j;
               }
           }
           int temp = array[k];
           array[k] = array[minIndex];
           array[minIndex] = temp;
       }
        printArray(array);
    }
}
