package behavioral.observer.ca4_topic;

public class MainCA4 {
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhVienA A = new ThanhVienA(topic);
        ThanhVienB B = new ThanhVienB(topic);

        TinTuc tt1 = new TinTuc("1","siuuuuuu");
        TinTuc tt2 = new TinTuc("2","tin tuc nx ne");

        topic.themMoi(tt1);
        topic.themMoi(tt2);
    }
}
