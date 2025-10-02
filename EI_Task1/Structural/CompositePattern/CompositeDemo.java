public class CompositeDemo {
    public static void main(String[] args) {
        File file1 = new File("resume.docx");
        File file2 = new File("photo.png");
        File file3 = new File("notes.txt");

        // Create directories
        Directory docs = new Directory("Documents");
        Directory images = new Directory("Images");
        Directory root = new Directory("Root");

        // Build hierarchy
        docs.add(file1);
        docs.add(file3);

        images.add(file2);

        root.add(docs);
        root.add(images);

        // Display full structure
        root.showDetails("");
    }
}
