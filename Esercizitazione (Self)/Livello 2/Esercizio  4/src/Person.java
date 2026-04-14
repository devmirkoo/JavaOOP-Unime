/*
* Esercizio 4: Ereditarietà e Override.
Obiettivo: Riutilizzare il codice tramite la specializzazione delle classi.
Come fare:
* Scrivi una classe base Person con un attributo name e un metodo writeOutput().
* Crea una sottoclasse Student che derivi da Person usando la parola chiave extends.
* Aggiungi a Student la variabile studentNumber. Fai l'override del metodo writeOutput(),
* definendolo in Student in modo che prima chiami super.writeOutput() (per stampare il nome)
* e poi stampi il numero di matricola.
*  */

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void writeOutput(){
        System.out.printf("Nome: %s\n", this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
