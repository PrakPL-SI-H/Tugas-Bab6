package mainemployee;

public class Employee {

    private static int anak, id;
    private double salary;
    public String nama, status;

    public Employee(String nama, int id, double salary, int tahun, String status, int anak) {
        this.nama = nama;
        this.id = id;
        this.salary = salary;
        this.status = status;

    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getStatus() {
        return status;
    }

    public static void setAnak(int a) {
        Employee.anak = a;
    }

    public int getAnak() {
        return anak;
    }

}
