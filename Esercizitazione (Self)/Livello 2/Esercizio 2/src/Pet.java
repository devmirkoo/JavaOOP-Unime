/*
* Esercizio 2: Costruttori Multipli (Overloading).
Obiettivo: Inizializzare gli oggetti in modi diversi.
Come fare: Crea una classe Pet con variabili per nome, età e peso.
*
* Definisci più costruttori (overloading):
* un costruttore di default (senza parametri),
* uno che accetta solo il nome (impostando età e peso a 0),
* e uno che accetta nome, età e peso.
*
* Nel main, crea tre oggetti Pet sfruttando i tre costruttori differenti
* per capire come Java distingua le firme dei metodi.
*  */

public class Pet {

    private String name;
    private Integer age;
    private Double weight;


    public Pet(){};
    public Pet(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0.0;
    }

    public Pet(String name, Integer age, Double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void showInfo(){
        System.out.printf("Ciao! Il mio nome è %s, ho %d anni, e peso %.2f KG\n", this.name, this.age, this.weight);
    }

    public void bark(){
        System.out.printf("Woff Woff! Sono %s e sto abbagliando\n", this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getWeight() {
        return weight;
    }
}
