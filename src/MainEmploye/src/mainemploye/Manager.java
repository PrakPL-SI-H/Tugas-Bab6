package mainemploye;

public class Manager extends Employee {

    private double tunjanganjabatan;

    @Override
    public double setBonus() {
        tunjanganjabatan = 0.1*gaji;
        if (masuk < 2011 && masuk > 2005) {           
            bonus = 0.05 * gaji;
            gaji = gaji + bonus + tunjanganjabatan;
        } else if (masuk < 2005) {
            bonus = 0.1 * gaji;
            gaji = gaji + bonus + tunjanganjabatan;
        }
        return gaji;
    }
    
    @Override
    public double setTunjangan() {
        tunjanganjabatan = 0.1*gaji;
        if (istri = true) {
            if (anak = true) {
                tunjangan = gaji * 0.25;
                gaji = gaji + tunjangan + tunjanganjabatan;
            }
        }
        else if (anak = true) {
            tunjangan = gaji * 0.15;
            gaji = gaji + tunjangan + tunjanganjabatan;
        }
        else if (istri = true){
            tunjangan = gaji * 0.1;
                gaji = gaji + tunjangan + tunjanganjabatan;
        }
        return gaji;
    }
}
