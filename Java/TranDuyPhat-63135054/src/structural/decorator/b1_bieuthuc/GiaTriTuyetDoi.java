package structural.decorator.b1_bieuthuc;

import static java.lang.Math.abs;

public class GiaTriTuyetDoi extends BieuThuDecorator{

    public GiaTriTuyetDoi(BieuThuc bieuThuc) {
        super(bieuThuc);
    }

    @Override
    public float giaTri() {
        return abs(super.giaTri());
    }

    @Override
    public String bieuThuc() {
        return "|" + super.bieuThuc()+ "|";
    }
}
