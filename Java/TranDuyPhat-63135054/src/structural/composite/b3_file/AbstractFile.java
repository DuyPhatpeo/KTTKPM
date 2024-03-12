package structural.composite.b3_file;

public abstract class AbstractFile {
    String ten, ngayTao;
    String duongDan;

    public AbstractFile(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.duongDan = ten;
    }

    public abstract void addItem(AbstractFile file);
    public abstract void removeItem(AbstractFile file);
    public abstract String getStringTreeFolder();
    public String getPath(){
        return duongDan;
    }

}
