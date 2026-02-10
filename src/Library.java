public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if(count < books.length) {
            books[count] = book;
            count++;
        }else{
            System.out.println("Library is full!");
        }
    }

    // TODO: Display all books
    public void displayBooks() {
        if(count == 0){
            System.out.println("No books in library.");
            return;
        }
        for(int i = 0; i < count; i++){
            System.out.println(books[i]);
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for(int i = 0; i < count; i++){
            if(books[i].getTitle().equalsIgnoreCase((title))){
                return books[i];
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
       Book book = searchByTitle(title);
       if(book != null && book.isAvailable()){
        book.borrowBook();
        System.out.println("Book borrowed.");
        }else{
        System.out.println("Book not available.");
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
         Book book = searchByTitle(title);
        if(book != null){
            book.returnBook();
            System.out.println("Book returned.");
        }else{
            System.out.println("Book not found.");
        }
    }
}
