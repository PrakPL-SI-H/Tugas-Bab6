package Bab6;

public class Employee {

    private String name;
    private String id;
    private String pos;
    protected String marriedStatus;
    protected int countKid;
    protected int yearIn;
    protected double salary;

    protected final int yearNow = 2016;

    public Employee() {
    }

    public Employee(String name, String id, String pos,
            String marriedStatus, int countKid, int yearIn) {
        this.name = name;
        this.id = id;
        this.pos = pos;
        this.marriedStatus = marriedStatus;
        this.countKid = countKid;
        this.yearIn = yearIn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getMarriedStatus() {
        return marriedStatus;
    }

    public void setMarriedStatus(String marriedStatus) {
        this.marriedStatus = marriedStatus;
    }

    public int getCountKid() {
        return countKid;
    }

    public void setCountKid(int countKid) {
        this.countKid = countKid;
    }

    public int getYearIn() {
        return yearIn;
    }

    public void setYearIn(int yearIn) {
        this.yearIn = yearIn;
    }
}
