public class NguoiDung {
    String ten;
    int tuoi;
    String email;

    NguoiDung(String ten, int tuoi, String email) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
    }

    void giaoThien() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Email: " + email);
    }
}
