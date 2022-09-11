package library;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Stephen", "King");
        Book book = new Book(author, "Dijital kale", 300, "Macera, Bilim kurgu", false, 100);
        Reader reader = new Reader("Emre", 22, 'E');
        reader.read(book);
    }
}

