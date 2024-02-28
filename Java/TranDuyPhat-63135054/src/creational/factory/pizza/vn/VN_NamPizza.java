package creational.factory.pizza.vn;

import creational.factory.pizza.Pizza;

public class VN_NamPizza extends Pizza {
    @Override
    public void prepare() {
        builder.append("Chuẩn bị bột gạo và ít nấm");
    }

    @Override
    public void bake() {
        builder.append("\n")
                .append("Nướng trong lò than trong 15 phút");
    }

    @Override
    public void box() {
        builder.append("\n")
                .append("Gói lá chuối")
                .append("\n")
                .append("Chúc bạn ngon miệng! Hẹn gặp lại");
    }

    @Override
    public void cut() {
        builder.append("\n")
                .append("Cắt thành ít nấm");

    }
}
