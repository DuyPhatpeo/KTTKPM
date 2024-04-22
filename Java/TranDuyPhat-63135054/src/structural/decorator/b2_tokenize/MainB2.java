package structural.decorator.b2_tokenize;

public class MainB2 {
    public static void main(String[] args) {
        String s = "Sinh viên và giáo viên được nghỉ lễ 5 ngày, đi chơi thôi!";
        Tokenize t = new TachTu(s);
        System.out.println(t.tokenize());
        t = new RemoveStopword(t);
        System.out.println(t.tokenize());
        t = new RemovePunc(t);
        System.out.println(t.tokenize());
    }
}
