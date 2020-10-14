public class Emp implements java.io.Serializable {
    private int eno;
    private String ename;
    private int sal;
    private transient String desg;

    public void show(){
        System.out.println("================================================");
        System.out.println("Eno     : "+eno);
        System.out.println("Name    : "+ename);
        System.out.println("Salary  : "+sal);
        System.out.println("Desg    : "+desg);
        System.out.println("================================================");
    }
    public Emp(int eno, String ename, int sal, String desg) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
        this.desg = desg;
    }
    
    
}
