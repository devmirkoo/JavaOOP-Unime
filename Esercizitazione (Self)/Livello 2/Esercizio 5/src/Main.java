/*
* Esercizio 5: Classi Astratte e Polimorfismo.
Obiettivo: Lavorare con metodi senza implementazione e associazione dinamica.
Come fare: Crea una classe astratta ShapeBase dichiarandola abstract e inserisci al suo interno un metodo astratto public abstract void drawHere(); (senza corpo).
* Crea due classi, Rectangle e Triangle, che estendono ShapeBase e forniscono il corpo (l'implementazione reale) del metodo drawHere() per stampare una forma di asterischi.
* Nel main, crea un array di ShapeBase, riempilo con un rettangolo e un triangolo, e con un ciclo chiama drawHere() su ogni elemento, osservando il polimorfismo in azione
* */

public class Main {
    public static void main(String[] args) {

        ShapeBase[] shapes = new ShapeBase[8];

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = (i % 2 == 0) ? new Triangle() : new Rectangle();
        }

        for (ShapeBase shape : shapes) {
            shape.drawHere();
        }
    }
}
