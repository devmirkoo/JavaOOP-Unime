/*
* Esercizio 1: Classe base e Istanziazione.
Obiettivo: Creare una classe personalizzata e istanziarla.
Come fare: Definisci una classe Automobile con tre variabili d'istanza: fuel (double), speed (double) e license (String).
* Crea due metodi pubblici: accelerate(double pedalPressure) e decelerate().
* Nel metodo main di un'altra classe, crea due oggetti di tipo Automobile usando l'operatore new.
* Assegna valori diversi alle loro variabili e richiama i metodi per vederne l'effetto.
*  */

public class Main {
    public static void main(String[] args){
        Automobile auto1 = new Automobile();
        Automobile auto2 = new Automobile();

        auto1.setFuel(10.0);
        auto2.setFuel(4.6);

        auto1.setSpeed(5);
        auto2.setSpeed(5);

        auto1.setLicense("AD594GD");
        auto2.setLicense("LF494GF");

        System.out.printf("Stato attuale AUTO-%s\nVelocità: %.2f, Benzina: %.2f\n",auto1.getLicense(), auto1.getSpeed(), auto1.getFuel());
        System.out.printf("Stato attuale AUTO-%s\nVelocità: %.2f, Benzina: %.2f\n", auto2.getLicense(), auto2.getSpeed(), auto2.getFuel());

        System.out.println("Modifiche Valori (Accelerazione)");
        auto1.accelerate(2.4);
        auto2.accelerate(3.7);

        System.out.printf("Stato attuale AUTO-%s\nVelocità: %.2f, Benzina: %.2f\n",auto1.getLicense(), auto1.getSpeed(), auto1.getFuel());
        System.out.printf("Stato attuale AUTO-%s\nVelocità: %.2f, Benzina: %.2f\n", auto2.getLicense(), auto2.getSpeed(), auto2.getFuel());

        System.out.println("Modifiche Valori (Deaccelerazione)");
        auto1.decelerate(1.3);
        auto2.decelerate(3);

        System.out.printf("Stato attuale AUTO-%s\nVelocità: %.2f, Benzina: %.2f\n",auto1.getLicense(), auto1.getSpeed(), auto1.getFuel());
        System.out.printf("Stato attuale AUTO-%s\nVelocità: %.2f, Benzina: %.2f\n", auto2.getLicense(), auto2.getSpeed(), auto2.getFuel());
    }
}
