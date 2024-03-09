package creational.builder.a5_book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String tuaDe;
    int soTrang;
    String tacGia;
    List<String> danhSachChuong;

    public Book(String tuaDe, int soTrang, String tacGia, List<String> danhSachChuong) {
        this.tuaDe = tuaDe;
        this.soTrang = soTrang;
        this.tacGia = tacGia;
        this.danhSachChuong = danhSachChuong;
    }
    private Book(Builder b){
        this.tuaDe = b.tuaDe;
        this.tacGia = b.tacGia;
        this.soTrang = b.soTrang;
        this.danhSachChuong = b.danhSachChuong;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(tuaDe).append("\n")
                .append(tacGia).append("\n")
                .append("Số trang: ").append(soTrang).append("\n")
                .append(danhSachChuong);
        return builder.toString();
    }

    public static class Builder{
        String tuaDe, tacGia;
        int soTrang;
        List<String> danhSachChuong = new ArrayList<>();

        public Builder setTuaDe(String tuaDe){
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder setTacGia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }
        public Builder setSoTrang(int soTrang){
            this.soTrang = soTrang;
            return this;
        }
        public Builder addDanhSachChuong(String danhSachChuong){
            this.danhSachChuong.add(danhSachChuong);
            return this;
        }
        public Book build(){
            return new Book(this);
        }
    }
}
