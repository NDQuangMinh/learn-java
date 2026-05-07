public class SinhVien {
    String ten;
    int tuoi;
    String maSV;
    double diemTB;

    // Constructor
    SinhVien(String ten, int tuoi, String maSV, double diemTB) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    void giaoThien() {
        System.out.println("Tên: " + ten);
        System.out.println("Mã SV: " + maSV);
        System.out.println("Tuổi: " + tuoi);
        System.out.printf("Điểm TB: %.2f%n", diemTB);
        System.out.println("---");
    }
}