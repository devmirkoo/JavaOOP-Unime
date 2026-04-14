/*
* Esercizio 3: Incapsulamento e Validazione.
Obiettivo: Nascondere i dati interni e fornire un accesso controllato (Information Hiding).
Come fare: Crea una classe Purchase in cui tutte le variabili d'istanza (come nome, prezzo e quantità) hanno il modificatore private.
*  Crea metodi accessori (getter) e mutatori (setter) public per ogni variabile.
* Nel metodo setPrice, inserisci un controllo if per lanciare un avviso o impedire l'assegnazione se il prezzo fornito è un numero negativo.
* */

public class Purchase {
    private String name;
    private Double price;
    private Integer amount;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            System.out.println("Il prezzo inserito risulta negativo (minore di 0)");
            return;
        }

        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
