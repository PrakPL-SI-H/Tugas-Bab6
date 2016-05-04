package inheritance;

public class Employee {

    private static int anak, id;
    private double salary;
    public String nama, status;

    public Employee(String nama, int id, double salary, int year, String status, int anak) {
        this.nama = nama;
        this.salary = salary;
        this.status = status;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public static void setAnak(int a) {
        Employee.anak = a;
    }

    public String getStatus() {
        return status;
    }

    public int getAnak() {
        return anak;
    }

    public double getSalary() {
        return salary;
    }
}
