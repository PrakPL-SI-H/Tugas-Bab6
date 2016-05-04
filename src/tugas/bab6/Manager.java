package Bab6;

public class Manager extends PegawaiTetap {

    public Manager(String name, String id, String pos,
            String marriedStatus, int countKid, int yearIn) {
        super(name, id, pos, marriedStatus, countKid, yearIn);
    }

    public double getSalary() {
        return super.getSalary() + (super.getSalary() * 0.1);
    }

}
