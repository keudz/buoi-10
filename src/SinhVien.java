

public class SinhVien {
    // Thuộc tính
    private String hoTen;
    private String diaChi;
    private String email;
    private String soDienThoai;
    private String maSinhVien;


    public SinhVien(String hoTen, String diaChi, String email, String soDienThoai, String maSinhVien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.maSinhVien = maSinhVien;
    }


    private void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    private String getHoTen() {
        return hoTen;
    }


    private void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    private String getDiaChi() {
        return diaChi;
    }


    private void setEmail(String email) {
        this.email = email;
    }

    private String getEmail() {
        return email;
    }

    private void setMaSinhVien(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    private String getMaSinhVien(){
        return soDienThoai;
    }



    private void setSoDienThoai(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    private String getSoDienThoai(){
        return maSinhVien;
    }


    public void diHoc() {
        System.out.println(getHoTen() + " đang đi học.");
    }

    public void lamBaiTap() {
        System.out.println(getHoTen() + " đang làm bài tập.");
    }

    public void nopHocPhi() {
        System.out.println(getHoTen() + " đã nộp học phí.");
    }

    public void lamBaiKiemTra() {
        System.out.println(getHoTen() + " đang làm bài kiểm tra.");
    }


    public void hienThiThongTin() {
        System.out.println("Họ và tên: " + getHoTen());
        System.out.println("Địa chỉ: " + getDiaChi());
        System.out.println("Email: " + getEmail());
        System.out.println("Số điện thoại: " + getSoDienThoai());
        System.out.println("Mã sinh viên: " + getMaSinhVien());
    }
}
//...
