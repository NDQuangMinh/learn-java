public class SinhVien extends NguoiDung implements CoTheThi {
    String maSV;
    double diemTB;

    SinhVien(String ten, int tuoi, String email, String maSV, double diemTB) {
        super(ten, tuoi, email);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    @Override
    public String xepLoai() {
        if (diemTB >= 8.5) return "Xuất sắc";
        if (diemTB >= 7.0) return "Giỏi";
        if (diemTB >= 5.5) return "Khá";
        return "Trung bình";
    }

    @Override
    public boolean duocLen() {
        return diemTB >= 5.0;
    }

    @Override
    void giaoThien() {
        super.giaoThien();
        System.out.println("Mã SV: " + maSV);
        System.out.printf("Điểm TB: %.2f%n", diemTB);
        System.out.println("Xếp loại: " + xepLoai());
        System.out.println("Lên lớp: " + (duocLen() ? "Có" : "Không"));
        System.out.println("---");
    }
}