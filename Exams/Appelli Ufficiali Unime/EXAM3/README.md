# EXAM3 — Appello del 8 luglio 2026

Appello **realmente sostenuto**: è il dato vero su come il docente costruisce le tracce e su cosa
penalizza. EXAM1 ed EXAM2 sono ricostruzioni.

| Esercizio | Argomento |
|---|---|
| ES1 | Interfaccia elementare implementata su una classe |
| ES2 | Le cinque parole chiave delle eccezioni, con vincolo esplicito sul blocco `finally` |
| ES3 | `Persona` serializzata e inviata al server su socket |

I due esercizi da 13 punti isolano gli errori più costosi della materia: una stampa collocata fuori
dal blocco che la traccia impone, e un `ObjectOutputStream` costruito su un `FileOutputStream`
invece che sullo stream del socket — serializzazione perfetta, destinazione sbagliata.

## Cosa contiene ogni cartella

| File | Cosa è |
|---|---|
| `README.md` | La traccia |
| `Soluzione.java` | Il foglio di partenza: solo gli `import`. È il file che compili |
| `Main.class` | Il tester black-box, già compilato. Il sorgente non esiste, come all'appello |

Le tracce di ES1 e ES2 sono state ricostruite nei dettagli operativi (nomi di classi e metodi, valori)
a partire dal testo dell'appello, che era più scarno; la struttura, i vincoli architetturali e gli
argomenti sono quelli reali. ES3 è fedele: host e porta dati nella traccia, server già attivo e non da scrivere, `Persona` con
costante di versione, invio dell'oggetto serializzato e rilettura della risposta lato client.

## Rifarlo come una prova vera

```bash
python3 Exams/aula.py "Exams/Appelli Ufficiali Unime/EXAM3"
```

Cronometro, cinque esecuzioni per esercizio, consegna e report. Per ripartire da zero
dopo un tentativo: `--riparti`.

## I due tester che mordono

Non verificano solo l'output: verificano **il modo**, che è l'asse su cui questo appello si vince o si perde.

- **ES2** legge il sorgente e controlla che una stampa stia davvero dentro un blocco `finally`. Un
  programma che stampa le tre righe giuste dalla posizione sbagliata fallisce quella verifica —
  esattamente l'errore che la traccia vuole scovare.
- **ES3** contiene il server dentro il tester, come all'appello: tu scrivi solo `Persona` e
  `Client`. Il server sa se una connessione è arrivata davvero, quindi una soluzione che serializza
  su file senza mai contattarlo fallisce due verifiche — la connessione mancata e il file comparso
  nella cartella — anche se l'oggetto "torna indietro" corretto. Controlla inoltre che l'oggetto
  restituito **non sia la stessa istanza** inviata, cioè che sia stato ricostruito da uno stream.
