import java.util.ArrayList;
import java.util.List;

class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> items;

    public Folder(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void add(FileSystemItem item) {
        items.add(item);
    }

    public void remove(FileSystemItem item) {
        items.remove(item);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemItem item : items) {
            item.showDetails();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemItem item : items) {
            totalSize += item.getSize();
        }
        return totalSize;
    }
}
