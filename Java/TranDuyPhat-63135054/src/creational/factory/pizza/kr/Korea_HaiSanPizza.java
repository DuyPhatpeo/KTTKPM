package creational.factory.pizza.kr;

import creational.factory.pizza.Pizza;

public class Korea_HaiSanPizza extends Pizza {
    @Override
    public void prepare() {
        builder.append("Chuẩn bị bột gạo và tôm");
    }

    @Override
    public void bake() {
        builder.append("\n")
                .append("Nướng trong lò than trong 15 phút");
    }

    @Override
    public void box() {
        builder.append("\n")
                .append("Cho vào hộp đóng gói")
                .append("\n")
                .append("Chúc bạn ngon miệng! Hẹn gặp lại");
    }

    @Override
    public void cut() {
        builder.append("\n")
                .append("Cắt thành 4 miếng");

    }
}
