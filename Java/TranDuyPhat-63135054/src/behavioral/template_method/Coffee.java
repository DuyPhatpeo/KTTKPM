package behavioral.template_method;

public class Coffee extends CaffeinBeverage{
    @Override
    void brew() {
        System.out.println("Cho bột coffe vào phin và cho nước sôi vào.");
    }

    @Override
    void addCondiments() {
        System.out.println("Thêm một đường vào cốc.");
    }
}
