//public class Student {
//    private String studentId;
//    private String fullName;
//    private String address;
//    private String email;
//    private String phoneNumber;
//
//    // Constructor không tham số
//    public Student() {
//    }
//
//    // Constructor có tham số
//    public Student(String studentId, String fullName, String address, String email, String phoneNumber) {
//        this.studentId = studentId;
//        this.fullName = fullName;
//        this.address = address;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }
//
//    // Các phương thức Getter và Setter chuyển thành private
//    private String getStudentId() {
//        return studentId;
//    }
//
//    private void setStudentId(String studentId) {
//        this.studentId = studentId;
//    }
//
//    private String getFullName() {
//        return fullName;
//    }
//
//    private void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    private String getAddress() {
//        return address;
//    }
//
//    private void setAddress(String address) {
//        this.address = address;
//    }
//
//    private String getEmail() {
//        return email;
//    }
//
//    private void setEmail(String email) {
//        this.email = email;
//    }
//
//    private String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    private void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    // Phương thức public để hiển thị thông tin
//    public void displayInformation() {
//        System.out.println("Mã sinh viên: " + getStudentId());
//        System.out.println("Họ tên: " + getFullName());
//        System.out.println("Địa chỉ: " + getAddress());
//        System.out.println("Email: " + getEmail());
//        System.out.println("Số điện thoại: " + getPhoneNumber());
//    }
//
//    public static void main(String[] args) {
//        // Tạo đối tượng Student
//        Student student = new Student("B22DCCN175", "Nguyễn Văn A", "Hà Nội", "nguyenvana@email.com", "0123456789");
//        student.displayInformation();
//    }
//}
