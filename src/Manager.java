package PrakBab6;

public class Manager extends Employee {

    private final int gajimanager = 10000000;

    public Manager(String n, String i, String j, String is, int t) {
        super(n, i, j, is, t);
    }

    public int salaryManager() {
        return super.getSalary(gajimanager) + (1 * super.getSalary(gajimanager)/10);
    }
}
