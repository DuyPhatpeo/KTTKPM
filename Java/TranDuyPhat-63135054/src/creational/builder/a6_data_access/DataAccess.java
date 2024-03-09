package creational.builder.a6_data_access;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;
    private List<SanPham> list = new ArrayList<>();

    public static DataAccess getInstance(){
        if(instance == null)
            instance = new DataAccess();
        return instance;
    }

    public void add(SanPham s){
        list.add(s);
    }

}
