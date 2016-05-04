package inheritance;
public class Manager extends Employee {
    public double tunjab;
    public void tunJabatan(){
        tunjab=0.1*total;
        total=total+tunjab;
    }  
}