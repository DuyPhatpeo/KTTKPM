package creational.builder.computer;
//Lớp co đối tường cần xây dựng với nhiều thành phần
public class Computer {
    // 1.Các thành phần cần xây dựng, việc xây dựng các thành phần này là phức tạp
    private String CPU, RAM, storage, screen;

    // 3.Hàm khởi tạo, khởi tạo đối tượng cần xây dựng của đối tượng builder. Không sử dụng bổ từ truy cập public cho hàm khởi tạo này
    private Computer(Builder b){
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    @Override
    public String toString() {
        return "Computer:" +
                "\nCPU: " + CPU +
                "\nRAM: " + RAM +
                "\nstorage: " + storage +
                "\nscreen: " + screen;
    }

    // 2.Lớp Builder có nhiệm vụ xây dựng các thành phần cho đối tượng cần khởi tạo( Computer)
    public static class Builder{
        String CPU, RAM, storage, screen;
        // Phương thức xây dựng một thành phần cho Computer
        public Builder addCPU(String cpu){
            this.CPU = cpu;
            return this;
        }
        public Builder addRAM(String ram){
            this.RAM = ram;
            return this;
        }
        public Builder addStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder addScreen(String screen){
            this.screen = screen;
            return this;
        }
        // 4.Phương thức (bắt buộc phải có của lớp Builder) dùng để trả về đối tượng cần được xây dựng
        public Computer build(){
            return new Computer(this);
        }
    }
}
