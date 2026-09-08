# EXAM4 — Appello sostenuto dell'8 settembre 2026

**Secondo appello effettivamente svolto in aula**, dopo EXAM3 (8 luglio 2026, 16/31, voto
rifiutato). EXAM1 ed EXAM2 restano ricostruzioni.

**Esito stimato: 14,5 / 31 — sotto la soglia di 16.** La stima è ricostruita a partire dal
racconto dello studente subito dopo la prova, non dal file consegnato: vedi
`Report_EXAM4.md` per la ripartizione e per il margine di incertezza.

| Esercizio | Argomento | Esito stimato |
|---|---|---|
| ES1 | `Asta` con inner class **non statica** `Offerta` | **8 / 13** — struttura giusta, `extends Asta` la rende non compilabile |
| ES2 | `ClientUDP`, invio e ricezione di datagrammi | **4 / 13** — `new InetAddress(host, porta)` e nessuna ricezione della risposta |
| ES3 | Metodo statico di conversione km → metri | **2,5 / 5** — logica corretta, ma scritta fuori da qualsiasi classe |

## Ricostruzione della traccia

Le tracce qui dentro sono **ricostruite** dal testo riportato a memoria. Struttura, vincoli
architetturali e argomenti sono quelli reali; i dettagli operativi indispensabili al tester
sono stati fissati dove l'originale era implicito:

- **ES1** — l'ordine dei parametri, i valori dell'esempio e la formula esatta della stringa di
  `stato()` (riprodotta alla lettera, spazi mancanti compresi, come nel testo originale).
- **ES2** — host, porta e forma della risposta del server. Nell'originale il server rimandava
  indietro il messaggio identico; qui risponde `RISPOSTA: ` seguito dal testo, perché un'eco
  perfetta non permetterebbe al tester di distinguere un client che riceve davvero da uno che
  restituisce il proprio parametro senza mai chiamare `receive()`.
- **ES3** — nome della classe (`Convertitore`) e del metodo (`converti`), presi dalla forma già
  vista all'Esame 2, e tipi `int`.

La numerazione segue il peso, non l'ordine di somministrazione: in aula il metodo statico era
l'ultimo dei tre.

## Cosa contiene ogni cartella

| File | Cosa è |
|---|---|
| `README.md` | La traccia |
| `Soluzione.java` | Il foglio di partenza: solo gli `import`. È il file che compili |
| `Main.class` | Il tester black-box, già compilato. Il sorgente non esiste, come all'appello |
| `_solutions/ESn/Soluzione.java` | La soluzione di riferimento, con un commento nel punto esatto di ogni errore commesso |
| `_solutions/ESn/Note.md` | Punteggio, errore in linguaggio piano, e cosa ricordare |

`_solutions/` sta fuori dalle cartelle degli esercizi apposta, così `javac` non lo pesca.

## Rifarlo come una prova vera

```bash
python3 Exams/aula.py "Exams/Appelli Ufficiali Unime/EXAM4"
```

Cronometro, cinque esecuzioni per esercizio, consegna e report. Per ripartire da zero dopo un
tentativo: `--riparti`.

## I tester che mordono

Nessuno dei tre verifica solo l'output: verificano **il modo**, che è l'asse su cui questo
appello è stato perso.

- **ES1** legge la classe per riflessione e controlla quattro vincoli prima ancora di eseguire
  qualcosa: `Offerta` annidata dentro `Asta`, **non statica**, **non discendente di `Asta`**, e
  senza nessun campo dichiarato di tipo `Asta`. Una `Offerta` statica fallisce anche
  all'istanziazione, perché il tester la costruisce con `asta.new Offerta(...)`.
- **ES2** contiene il server UDP dentro il tester e **conta i datagrammi che gli arrivano
  davvero**. Un client che restituisce il proprio parametro senza chiamare `receive()` fallisce,
  perché la risposta del server è distinguibile dal messaggio inviato. Ogni chiamata è protetta
  da un timeout, così un client che resta appeso in `receive()` produce un `[KO]` e non un
  blocco. Verifica inoltre che un host irraggiungibile porti a `null` senza toccare il server.
- **ES3** controlla per riflessione che `converti` sia davvero `static`, oltre ai quattro valori.
