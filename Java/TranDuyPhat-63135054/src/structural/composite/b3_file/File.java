package structural.composite.b3_file;

public class File extends AbstractFile{
    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public void addItem(AbstractFile file) {

    }

    @Override
    public void removeItem(AbstractFile file) {

    }

    @Override
    public String getStringTreeFolder() {
        return this.ten;
    }
}
