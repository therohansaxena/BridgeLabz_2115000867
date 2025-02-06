import java.util.*;

class Book {
    char[] title;
    char[] author;

    Book(char[] title, char[] author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    Book[] books;
    int count = 0;

    Library(int size) {
        books = new Book[size];
    }

    void addBook(Book book) {
        books[count] = book;
        count++;
    }

    void displayBooks() {
        for (int i = 0; i < count; i++) {
            for (char c : books[i].title) System.out.print(c);
            System.out.print(" by ");
            for (char c : books[i].author) System.out.print(c);
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Library lib = new Library(2);
        Book b1 = new Book(new char[]{'B', 'o', 'o', 'k', '1'}, new char[]{'A', 'u', 't', 'h', 'o', 'r', '1'});
        Book b2 = new Book(new char[]{'B', 'o', 'o', 'k', '2'}, new char[]{'A', 'u', 't', 'h', 'o', 'r', '2'});
        lib.addBook(b1);
        lib.addBook(b2);
        lib.displayBooks();
    }
}
