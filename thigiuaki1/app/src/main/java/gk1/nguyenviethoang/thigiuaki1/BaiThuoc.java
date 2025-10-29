package gk1.nguyenviethoang.thigiuaki1;

public class BaiThuoc {
    private String ten;
    private String thoiGian;
    private int anh;

    public BaiThuoc(String ten, String thoiGian, int anh) {
        this.ten = ten;
        this.thoiGian = thoiGian;
        this.anh = anh;
    }

    public String getTen() { return ten; }
    public String getThoiGian() { return thoiGian; }
    public int getAnh() { return anh; }
}
