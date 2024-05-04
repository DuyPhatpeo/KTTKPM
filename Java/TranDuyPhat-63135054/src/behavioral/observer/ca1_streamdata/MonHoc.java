package behavioral.observer.ca1_streamdata;

public class MonHoc {
    String tenMonHoc;
    String maMH;

    public MonHoc(String tenMonHoc, String maMH) {
        this.tenMonHoc = tenMonHoc;
        this.maMH = maMH;
    }

    @Override
    public String toString() {
        StringBuilder builder =new StringBuilder();
        builder.append("Ma MH: ").append(maMH).append("\t")
                .append("Ten mon hoc: ").append(tenMonHoc);
        return builder.toString();
    }
}
