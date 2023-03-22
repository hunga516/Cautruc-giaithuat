import java.util.Scanner;

public class HocSinh {
    private String name, className;
    protected int toan, ly, hoa;

    public HocSinh() {
        super();
    }

    public HocSinh(String name, String className, int toan, int ly, int hoa) {
        super();
        this.name = name;
        this.className = className;
        this.toan = toan;
        this.hoa = hoa;
        this.ly = ly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }

    public void setToan(int toan) {
        this.toan = toan;
    }

    public int getToan() {
        return this.toan;
    }

    public void setLy(int ly) {
        this.ly = ly;
    }

    public int getLy() {
        return this.ly;
    }

    public void setHoa(int hoa) {
        this.hoa = hoa;
    }

    public int getHoa() {
        return this.hoa;
    }

    public double tinhDiem() {
        return (this.toan  + this.ly + this.hoa)/3;
    }

    public String toString() {
        return "Diem cua hoc sinh binh thuong la" + tinhDiem();
    }

}

    //class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HocSinh hs = new HocSinh();
        hs.setToan(sc.nextInt());
        hs.setLy(sc.nextInt());
        hs.setHoa(sc.nextInt());

        hocSinhChuyenToan hsct = new hocSinhChuyenToan();
        System.out.println(hsct.toString());
    }

