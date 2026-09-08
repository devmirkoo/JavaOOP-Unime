# Esercizio 1 (13 Punti) - Classi Annidate e Information Hiding


1. Definire la classe `Asta`, il cui costruttore riceve nell'ordine il codice dell'asta (testuale), la quota di partenza (numero con la virgola) e il nome del miglior offerente (testuale). Tutte le variabili d'istanza devono essere rigorosamente private, nel rispetto dell'information hiding.
2. Dentro la classe `Asta` definire una classe annidata **non statica** chiamata `Offerta`.
3. Il costruttore di `Offerta` riceve nell'ordine il nome dell'offerente (testuale) e la quota offerta (numero con la virgola). Anche qui tutte le variabili d'istanza devono essere rigorosamente private.
4. Dentro `Offerta` definire i due metodi seguenti:
   - `stato`, che non riceve parametri e restituisce una stringa nella forma
     `"prezzo asta attuale: " + quota + "euro. miglior offerente" + nomeMigliorOfferente`;
   - `aggiungiOfferta`, che riceve l'importo dell'offerta (numero con la virgola) e restituisce un booleano. Se l'importo è minore della quota attuale dell'asta il metodo restituisce `false`; altrimenti sovrascrive la quota attuale dell'asta con l'importo ricevuto, sovrascrive il nome del miglior offerente e restituisce `true`.
5. **Vincolo architetturale:** `Offerta` non deve essere statica.
6. **Vincolo architetturale:** dentro `Offerta` non va dichiarato nessun riferimento a un oggetto `Asta`.

## Output atteso

Costruendo `new Asta("A-100", 100.0, "nessuno")` e da essa un'offerta di `"Mario"` a `150.0`:

```text
prezzo asta attuale: 100.0euro. miglior offerentenessuno
false
prezzo asta attuale: 100.0euro. miglior offerentenessuno
true
prezzo asta attuale: 150.0euro. miglior offerenteMario
```

Le due righe intermedie sono i valori restituiti da `aggiungiOfferta(50.0)` e da `aggiungiOfferta(150.0)`.
