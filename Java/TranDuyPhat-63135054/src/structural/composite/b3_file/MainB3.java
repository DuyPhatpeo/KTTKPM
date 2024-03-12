package structural.composite.b3_file;

public class MainB3 {
    public static void main(String[] args) {
        Folder folder = new Folder("Data (D:)","12/3/2024");
        Folder folder1 = new Folder("TaiLieu","12/3/2024");
        Folder folder2 = new Folder("Design Pattern","12/3/2024");
        Folder folder3 = new Folder("Lap Trinh Java","12/3/2024");
        folder.addItem(folder1);
        folder1.addItem(folder2);
        folder1.addItem(folder3);
        File file = new File("CreationalPattern.pptx","12/3/2024");
        File file1 = new File("StructuralPattern.pptx","12/3/2024");
        File file2 = new File("LapTrinhJavaCoBan.docx","12/3/2024");
        File file4 = new File("NgonNguLapTrinhC.pdf","12/3/2024");
        folder2.addItem(file);
        folder2.addItem(file1);
        folder1.addItem(file4);
        folder3.addItem(file2);

        System.out.println(folder.getStringTreeFolder());
        System.out.println(file4.getPath());
    }
}
