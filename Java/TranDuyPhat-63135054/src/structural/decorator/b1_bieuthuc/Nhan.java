package structural.decorator.b1_bieuthuc;

public class Nhan extends BieuThuDecorator{
    float toanHang;

    public Nhan(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() * toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + super.bieuThuc()+ ")" + " * " + toanHang;
    }
}
