package behavioral.observer.ca3_tigia;

public class NhaDauTuB implements TiGia.TigiaObserver {
    TiGia t;

    public NhaDauTuB(TiGia t) {
        this.t = t;
    }

    public void dangKy(){
        t.attach(this);
    }
    public void huyDangKy(){
        t.detach(this);
    }
    @Override
    public void tigiaChanged(double delta) {
        if(delta < 0 )
            System.out.println("Nhà đầu tư B: Bán vào");
        else
            System.out.println("Nhà đầu tư B: Mua ra");
    }
}
