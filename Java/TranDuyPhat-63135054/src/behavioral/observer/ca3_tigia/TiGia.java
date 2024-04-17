package behavioral.observer.ca3_tigia;

import java.util.ArrayList;
import java.util.List;

public abstract class TiGia {
    List<TigiaObserver> observers = new ArrayList<>();

    public void attach(TigiaObserver observer){
        observers.add(observer);
    }
    public void detach(TigiaObserver observer){
        observers.remove(observer);
    }
    abstract public void notify(double delta);

    public static interface TigiaObserver{
        public void tigiaChanged(double delta);
    }
}
