package creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        s1.inCount();//1
        s1.inCount();//2
        s2.inCount();//1
        s1.inCount();//3
    }
}
