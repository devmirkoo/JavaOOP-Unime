# EXAM3 — Appello sostenuto dell'8 luglio 2026

**È l'unico appello effettivamente svolto in aula.** EXAM1 ed EXAM2 sono ricostruzioni; questo è il
dato vero su come il docente costruisce le tracce e su come corregge.

**Esito: 16 / 31 — riserva.** Voto rifiutato.

| Esercizio | Argomento | Esito reale |
|---|---|---|
| ES1 | Interfaccia elementare implementata su una classe | **5 / 5**, nessun rilievo |
| ES2 | Le cinque parole chiave delle eccezioni | **penalità 3-5 punti**: codice compilante e output corretto, ma le stampe non erano dentro il blocco `finally` che la traccia imponeva |
| ES3 | `Persona` serializzata e inviata al server su socket | **sostanzialmente azzerato**: `ObjectOutputStream` costruito su `FileOutputStream` — serializzazione su file invece che sullo stream di rete |

## Cosa contiene ogni cartella

| File | Cosa è |
|---|---|
| `README.md` | La traccia |
| `Soluzione.java` | Il foglio di partenza: solo gli `import`. È il file che compili |
| `Main.class` | Il tester black-box, già compilato. Il sorgente non esiste, come all'appello |
| `_soluzione/Soluzione.java` | La soluzione di riferimento. **Non viene compilata dal tester** — sta in una sottocartella apposta perché `javac` non la peschi |

Le tracce di ES1 e ES2 sono state ricostruite nei dettagli operativi (nomi di classi e metodi, valori)
a partire dal testo dell'appello, che era più scarno; la struttura, i vincoli architetturali e gli
argomenti sono quelli reali. ES3 è fedele: host e porta dati nella traccia, server già attivo e non da scrivere, `Persona` con
costante di versione, invio dell'oggetto serializzato e rilettura della risposta lato client.

## Rifarlo come una prova vera

```bash
python3 Exams/aula.py "Exams/Appelli Ufficiali Unime/EXAM3"
```

Cronometro da un'ora, cinque esecuzioni per esercizio, consegna e report. Per ripartire da zero
dopo un tentativo: `--riparti`.

## I due tester che mordono

Non verificano solo l'output: verificano **il modo**, che è l'asse su cui questo appello è stato perso.

- **ES2** legge il sorgente e controlla che una stampa stia davvero dentro un blocco `finally`. Un
  programma che stampa le tre righe giuste dalla posizione sbagliata fallisce quella verifica —
  esattamente la penalità presa in aula.
- **ES3** contiene il server dentro il tester, come all'appello: tu scrivi solo `Persona` e
  `Client`. Il server sa se una connessione è arrivata davvero, quindi una soluzione che serializza
  su file senza mai contattarlo fallisce due verifiche — la connessione mancata e il file comparso
  nella cartella — anche se l'oggetto "torna indietro" corretto. Controlla inoltre che l'oggetto
  restituito **non sia la stessa istanza** inviata, cioè che sia stato ricostruito da uno stream.
