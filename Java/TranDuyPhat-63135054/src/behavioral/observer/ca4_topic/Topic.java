package behavioral.observer.ca4_topic;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<TinTuc> list = new ArrayList<>();
    List<TopicListener> listeners = new ArrayList<>();
    public void dangKy(TopicListener listener){
        listeners.add(listener);
    }
    public void huyDangKy(TopicListener listener){
        listeners.remove(listener);
    }
    public void themMoi(TinTuc t){
        list.add(t);
        for(TopicListener listener: listeners){
            listener.listen(t);
        }
    }
    public void capNhat(TinTuc t){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == t.getId()){
                list.set(i,t);
                for(TopicListener listener: listeners){
                    listener.listen(t);
                }
                return;
            }
        }
    }
}
