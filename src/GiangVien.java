public class GiangVien extends NguoiDung {
    String boMon;
    double luong;

    GiangVien(String ten, int tuoi, String email, String boMon, double luong) {
        super(ten, tuoi, email);
        this.boMon = boMon;
        this.luong = luong;
    }

    @Override
    void giaoThien() {
        super.giaoThien();
        System.out.println("Bộ môn: " + boMon);
        System.out.printf("Lương: %.0f VND%n", luong);
    }
}
