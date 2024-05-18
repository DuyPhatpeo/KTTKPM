package behavioral.observer.ca4_topic;

public class TinTuc {
    String Id;
    String tinTuc;

    public TinTuc(String maTinTuc, String tinTuc) {
        this.Id = maTinTuc;
        this.tinTuc = tinTuc;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getTinTuc() {
        return tinTuc;
    }

    public void setTinTuc(String tinTuc) {
        this.tinTuc = tinTuc;
    }

    @Override
    public String toString() {
        StringBuilder builder =new StringBuilder();
        builder.append("Ma Tin Tuc: ").append(Id).append("\t")
                .append("Tin tuc: ").append(tinTuc);
        return builder.toString();
    }
}
