package behavioral.observer.ca4_topic;

public class ThanhVienA implements TopicListener{
    Topic t;

    public ThanhVienA(Topic t) {
        this.t = t;
        this.t.dangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        System.out.println(t.toString());
    }
}
