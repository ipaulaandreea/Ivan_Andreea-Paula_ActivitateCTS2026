class FileItem implements FileSystemItem {
    private String name;
    private int size;

    public FileItem(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}