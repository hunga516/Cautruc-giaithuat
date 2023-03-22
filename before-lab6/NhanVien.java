import java.util.Scanner;
public class NhanVien {
    protected String name;
    protected long salary;

    public NhanVien() {
    }

    public NhanVien(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getSalary() {
        return this.salary;
    }

    protected String loaiNhanVien() {
        return ("Day la String");
    }

    public void tinhLuong() {
        //
    }

    public String xuatThongTin() {
        return ("Ten:" + this.name + "\n" +
                "Luong:" + this.salary);
    }
}
