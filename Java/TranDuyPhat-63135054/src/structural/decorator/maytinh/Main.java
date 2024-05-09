package structural.decorator.maytinh;

public class Main {
    public static void main(String[] args) {
        Computer pc = new PC("Intel Core i7", "8GB", "512GB", "15.6 inch", "GTA", 2000000, 500000, 3000000, 1500000, 1500000);
        System.out.println(pc.build());
        System.out.println(pc.values());
        pc = new Ram(pc, "8GB", 567000);
        System.out.println("Sau khi nâng cấp: ");
        System.out.println(pc.values());
    }
}
