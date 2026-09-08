# Esercizio 2 (13 Punti) - Gestione Avanzata delle Eccezioni (Le 5 Parole Chiave)


1. Definire la classe `Gestore`, con il metodo `verifica`, che riceve un parametro `int` e non restituisce nulla. Il metodo dichiara di poter propagare al chiamante un'eccezione controllata.
2. Il comportamento richiesto, in base al valore ricevuto:
   - `0`: viene lanciata un'eccezione generica, che il metodo stesso cattura; il messaggio è `eccezione generica` e nulla esce dal metodo;
   - `1`: viene lanciata una `IOException`, che il metodo cattura e converte in un'eccezione non controllata, la quale raggiunge il chiamante; il messaggio è `eccezione runtime`;
   - qualsiasi altro valore: nessuna eccezione, messaggio `no eccezioni`.
3. **Vincolo architetturale:** vanno obbligatoriamente utilizzate **tutte e cinque le parole chiave** della gestione delle eccezioni.
4. **Vincolo architetturale:** la stampa del messaggio deve trovarsi **dentro il blocco `finally`**, uno solo per tutti e tre i casi.

## Output atteso

```text
verifica(0)  ->  eccezione generica
verifica(1)  ->  eccezione runtime      (l'eccezione non controllata raggiunge il chiamante)
verifica(2)  ->  no eccezioni
```
