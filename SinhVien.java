import java.io.PrintStream;

public class SinhVien {
    private String hoTen;
    private String maSV;
    private String diaChi;
    private float diemTB;


    public SinhVien(String hoTen, String maSV, String diaChi, float diemTB) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }
    public void hienThi(){
        System.out.println("Ho ten sv la "+hoTen);
        System.out.println("Dia chi sv la "+diaChi);
        System.out.println("Ma sv la " +maSV);
        System.out.println("Diem sv la "+diemTB);
    }
}
    class Main {
        public static void main(String[] args) {
            SinhVien sv = new SinhVien("PHD", "BC56", "hanoi", 5.6f);
            sv.hienThi();
        }
    }
