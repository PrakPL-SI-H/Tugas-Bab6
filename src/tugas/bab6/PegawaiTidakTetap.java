package Bab6;

public class PegawaiTidakTetap extends Employee {

    private int jamKerja;

    public PegawaiTidakTetap(String name, String id,
            String pos, int jamKerja, int yearIn) {
        super(name, id, pos, "null", 0, yearIn);
        this.jamKerja = jamKerja;
    }

    public double getSalary() {
        int jamLembur = 0;

        if (jamKerja > 10) {
            jamLembur = jamKerja - 10;
        }
        return super.getSalary() + (jamLembur * 10000);
    }
}
