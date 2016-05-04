package prakproglan.bab6;
public class MainEmployee {
    public static void main(String[] args) {
        
    Manajer manajer = new Manajer("Juki", 001, "Manajer", "ya", 4, 1997);
    manajer.show();
    
    PegawaiTetap pt1 = new PegawaiTetap("Pras", 002, "Pegawai Tetap", "ya", 3, 2004);
    pt1.show();
    PegawaiTetap pt2 = new PegawaiTetap("Max", 003, "Pegawai Tetap", "ya", 2, 2004);
    pt2.show();
    PegawaiTetap pt3 = new PegawaiTetap("Gopul", 004, "Pegawai Tetap", "ya", 2, 2005);
    pt3.show();
    PegawaiTetap pt4 = new PegawaiTetap("Aan", 005, "Pegawai Tetap", "ya", 1, 2007);
    pt4.show();
    PegawaiTetap pt5 = new PegawaiTetap("Deni", 006, "Pegawai Tetap", "ya", 2, 2007);
    pt5.show();
    PegawaiTetap pt6 = new PegawaiTetap("Luki", 007, "Pegawai Tetap", "ya", 2, 2008);
    pt6.show();
    PegawaiTetap pt7 = new PegawaiTetap("Toyib", 010, "Pegawai Tetap", "ya", 0, 2010);
    pt7.show();
    PegawaiTetap pt8 = new PegawaiTetap("Erwan", 011, "Pegawai Tetap", "ya", 3, 2010);
    pt8.show();
    PegawaiTetap pt9 = new PegawaiTetap("Higa", 012, "Pegawai Tetap", "ya", 0, 2011);
    pt9.show();
    PegawaiTetap pt10 = new PegawaiTetap("Kiki", 013, "Pegawai Tetap", "tidak", 0, 2011);
    pt10.show();
        
    PegawaiTidakTetap ptt1 = new PegawaiTidakTetap("Roni", 114,"Pegawai Tidak Tetap", "ya", 0, 2014, 8);
    ptt1.show();
    PegawaiTidakTetap ptt2 = new PegawaiTidakTetap("Bob", 115, "Pegawai Tidak Tetap", "ya", 1, 2014, 12);
    ptt2.show();
    PegawaiTidakTetap ptt3 = new PegawaiTidakTetap("Muchlis", 116,"Pegawai Tidak Tetap", "ya", 1, 2015, 13);
    ptt3.show();
    PegawaiTidakTetap ptt4 = new PegawaiTidakTetap("Miko", 117,"Pegawai Tidak Tetap", "tidak", 0, 2016, 10);
    ptt4.show();
    PegawaiTidakTetap ptt5 = new PegawaiTidakTetap("Jeri", 118,"Pegawai Tidak Tetap", "ya", 1, 2016, 12);
    ptt5.show();
    }
}