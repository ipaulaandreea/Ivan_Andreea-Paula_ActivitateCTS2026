//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    FileItem file1 = new FileItem("document.txt", 10);
    FileItem file2 = new FileItem("image.png", 25);
    FileItem file3 = new FileItem("video.mp4", 100);

    Folder folder1 = new Folder("Documents");
    folder1.add(file1);
    folder1.add(file2);

    Folder folder2 = new Folder("Media");
    folder2.add(file3);

    Folder root = new Folder("Root");
    root.add(folder1);
    root.add(folder2);

    root.showDetails();
    System.out.println("Total size: " + root.getSize() + " KB");
}
