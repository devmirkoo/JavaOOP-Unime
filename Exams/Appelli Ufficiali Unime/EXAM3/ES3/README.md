# Esercizio 3 (13 Punti) - Serializzazione di Oggetti su Socket


Un server è già in ascolto e non va scritto: riceve un oggetto, lo rimanda indietro identico sulla stessa connessione e chiude. Le sue coordinate sono note a priori:

```text
host   127.0.0.1
porta  5555
```

1. Definire la classe `Persona`, il cui costruttore riceve nell'ordine il nome e il cognome, entrambi testuali, ed espone i due valori tramite i rispettivi metodi di lettura. Tutte le variabili d'istanza devono essere private. La classe deve poter essere convertita in una sequenza di byte e ricostruita identica altrove, e deve dichiarare una costante di versione per la serializzazione di tipo `long` pari a `1`. La sua rappresentazione testuale è nella forma `Persona[Mario Rossi]`.
2. Definire la classe `Client`, con il metodo `invia`, che riceve una persona e restituisce una persona. Il metodo instaura la connessione verso le coordinate indicate qui sopra, trasmette al destinatario l'oggetto ricevuto come parametro, attende l'oggetto che il server rimanda indietro, lo ricostruisce e lo restituisce al chiamante.
3. In caso di fallimento della comunicazione il metodo restituisce `null`.

## Output atteso

Inviando `new Persona("Mario", "Rossi")`, l'oggetto restituito dal metodo stampa:

```text
Persona[Mario Rossi]
```
