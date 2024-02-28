package behavioral.template_method;

public class Tea extends CaffeinBeverage{
    @Override
    void brew() {
        System.out.println("Cho trà và nước sôi vào cốc.");
    }

    @Override
    void addCondiments() {
        System.out.println("Cho thêm một miếng chanh vào cốc.");
    }
}
