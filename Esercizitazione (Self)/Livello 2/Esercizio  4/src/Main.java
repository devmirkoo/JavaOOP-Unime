public class Main {
    public static void main(String[] args) {
        Person persona = new Person("Giulia");
        Person studente = new Student("Marco", 12345);

        persona.writeOutput();
        studente.writeOutput();
    }
}

