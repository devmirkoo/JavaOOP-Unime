public class Student extends Person {
    private Integer matricola;

    public Student(String name, Integer matricola) {
        super(name);
        this.matricola = matricola;
    }

    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Matricola: %d%n", this.matricola);
    }

    public Integer getMatricola() {
        return matricola;
    }

    public void setMatricola(Integer matricola) {
        this.matricola = matricola;
    }
}
