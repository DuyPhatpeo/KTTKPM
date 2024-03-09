package behavioral.template_method.beverage;

public class MainTemplateMethod {
    public static void main(String[] args) {
        CaffeinBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println();
        CaffeinBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
