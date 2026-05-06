public class Main {

    static void tinhTienDien(double kWhTieuThu) {
        double tongTien = 0;

        if (kWhTieuThu < 50) {
            tongTien = kWhTieuThu * 1.678;
        } else if (kWhTieuThu >= 50 && kWhTieuThu <= 100) {
            tongTien = (50 * 1.678) + ((kWhTieuThu - 50) * 1.734);
        } else {
            tongTien = (50 * 1.678) + (50 * 1.734) + ((kWhTieuThu - 100) * 2.014);
        }

        System.out.println("Số kWh: " + kWhTieuThu);
        System.out.printf("Tổng tiền phải trả: %.3f%n", tongTien);
        System.out.println("---");
    }

    public static void main(String[] args) {
        double[] danhSachKwh = {30, 75, 150, 200, 45};

        for (int i = 0; i < danhSachKwh.length; i++) {
            tinhTienDien(danhSachKwh[i]);
        }
    }
}