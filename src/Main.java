import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSach = new ArrayList<>();

        danhSach.add(new SinhVien("Nguyen Quang Minh", 19, "minh@gmail.com", "SE123456", 8.5));
        danhSach.add(new SinhVien("Tran Thi An", 20, "an@gmail.com", "SE123457", 7.2));
        danhSach.add(new SinhVien("Le Van Hung", 19, "hung@gmail.com", "SE123458", 4.5));
        danhSach.add(new SinhVien("Nguyen Son Tung", 20, "tung@gmail.com", "SE123459", 9.5));

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

        System.out.println("\n=== SINH VIÊN KHÔNG LÊN LỚP ===");
        for (SinhVien sv : danhSach) {
            if (!sv.duocLen()) {
                System.out.println(sv.ten + " - Điểm TB: " + sv.diemTB);
            }
        }

        System.out.println("\n=== GIẢNG VIÊN ===");
        GiangVien gv = new GiangVien("Nguyen Van A", 35, "gv.a@fpt.edu.vn", "Lap trinh Java", 25000000);
        gv.giaoThien();
    }
}