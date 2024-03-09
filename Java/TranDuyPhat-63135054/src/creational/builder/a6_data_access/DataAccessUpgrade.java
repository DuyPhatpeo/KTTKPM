package creational.builder.a6_data_access;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccessUpgrade {
    private static Dictionary<String, DataAccessUpgrade> instances = new Hashtable<>();
    private List<SanPham> list = new ArrayList<>();

    public static DataAccessUpgrade getInstance(String tag){
        if(instances.get(tag) == null){
            DataAccessUpgrade d = new DataAccessUpgrade();
            instances.put(tag,d);
        }
        return instances.get(tag);
    }

    public void add(SanPham s){
        list.add(s);
    }
}
