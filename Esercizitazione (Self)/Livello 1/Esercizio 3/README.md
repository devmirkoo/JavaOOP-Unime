# Esercizio 3 – Valutazione Film con Switch ed Enum

## Descrizione
Programma che illustra l'uso del costrutto `switch` insieme alle **enumerazioni** (`enum`) in Java.

L'utente inserisce una valutazione per un film scegliendo tra:
- `EXCELLENT`
- `AVERAGE`
- `BAD`

Il valore viene convertito nell'enum `MovieRating` e, tramite uno `switch`, viene stampato un commento corrispondente alla categoria scelta.

## File
| File | Descrizione |
|------|-------------|
| `Main.java` | Logica principale con input utente e costrutto switch |
| `MovieRating.java` | Definizione dell'enumerazione con i valori `EXCELLENT`, `AVERAGE`, `BAD` |

## Concetti trattati
- Enumerazioni (`enum`)
- Costrutto `switch`
- Metodo `valueOf` per convertire una stringa in un valore enum
- Input con `Scanner`

## Esempio di esecuzione
```
Valuta il film (Scrivi: EXCELLENT, AVERAGE, o BAD):
EXCELLENT
Hai valutato questo film ECCELLENTE
```
