package inheritance;
public class Main {
    public static void main(String[] args) {
        Pegawaipns[] pegpn=new Pegawaipns[10];
        for (int i=0;i<pegpn.length;i++){
            pegpn[i]=new Pegawaipns();
            pegpn[i].masukan();
            pegpn[i].gaji();
            pegpn[i].keluaran();
        }
        Pegawainonpns[] nonpns=new Pegawainonpns[4];
        for(int i=0;i<nonpns.length;i++){
        nonpns[i]=new Pegawainonpns();
        nonpns[i].masukan();
        nonpns[i].gaji();
        nonpns[i].keluaran();    
        }
        Manager mana=new Manager();
        mana.masukan();
        mana.gaji();
        mana.tunJabatan();
        mana.keluaran();    
    }
}