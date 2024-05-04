package behavioral.observer.ca1_streamdata;

import java.util.List;

public class MyClient implements MyStream.MyListener<List<MonHoc>> {
    MyStream<List<MonHoc>> myStream;

    public MyClient(MyStream<List<MonHoc>> myStream) {
        this.myStream = myStream;
        myStream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        System.out.println("So mon hoc: " + monHocs.size());
        for(MonHoc monHoc: monHocs){
            System.out.println(monHoc.toString());
        }
    }
}
