package structural.composite.b3_file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile> children = new ArrayList<>();
    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public void addItem(AbstractFile file) {
        children.add(file);
        file.duongDan = this.duongDan + "\\" + file.duongDan;
    }

    @Override
    public void removeItem(AbstractFile file) {
        children.remove(file);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten);
        // Ghép cây con vào
        for (var f: children)
            builder.append("\n").append("\t").append(f.getStringTreeFolder());
        return builder.toString();
    }
}
