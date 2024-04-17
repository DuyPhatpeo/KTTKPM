package behavioral.observer.ca3_tigia;

public class TiGiaUSD extends TiGia{
    @Override
    public void notify(double delta) {
        for(TigiaObserver observer: observers){
            observer.tigiaChanged(delta);
        }
    }
}
