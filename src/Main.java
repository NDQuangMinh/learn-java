import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSach = new ArrayList<>();

        danhSach.add(new SinhVien("Nguyen Quang Minh", 19, "SE123456", 8.5));
        danhSach.add(new SinhVien("Tran Thi An", 20, "SE123457", 7.2));
        danhSach.add(new SinhVien("Le Van Hung", 19, "SE123458", 6.0));
        danhSach.add(new SinhVien("Nguyen Son Tung", 20, "SE123459", 9.5));

        System.out.println("=== DANH SÁCH SINH VIÊN ===");
        for (SinhVien sv : danhSach) {
            sv.giaoThien();
        }

        System.out.println("Tổng số sinh viên: " + danhSach.size());

        SinhVien svGioi = danhSach.get(0);
        for (int i = 1; i < danhSach.size(); i++) {
            if (danhSach.get(i).diemTB > svGioi.diemTB) {
                svGioi = danhSach.get(i);
            }
        }

        System.out.println("---\nSinh viên có điểm TB cao nhất: " + svGioi.ten);
        System.out.printf("Điểm TB: %.2f%n", svGioi.diemTB);
    }
}