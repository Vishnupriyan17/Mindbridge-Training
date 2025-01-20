package Day2.Additional;

import java.util.ArrayList;
import java.util.List;

class Book{
    private String bookId ;
    private String bookName;
    private String bookAuthor;
    private int bookCopies;

    Book(String bookId,String bookName,String bookAuthor,int bookCopies)
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCopies = bookCopies;
    }
    public boolean borrowBook()
    {
        if(bookCopies > 0)
        {
            bookCopies--;
            return true;
        }
        return false;
    }
    public int returnBook()
    {
        return bookCopies++;
    }
    public String getBookName() {
        return bookName;
    }
    public String toString() {
        return bookId + ": " + bookName + " by " + bookAuthor + " (Available copies: " + bookCopies + ")";
    }
}
class Member{
    private String memberId;
    private String memberName;
    private List<Book> borrowedBook;

    Member(String memberId,String memberName)
    {
        this.memberId=memberId;
        this.memberName=memberName;
        borrowedBook = new ArrayList<>();
    }
    public void borrowBooks(Book book)
    {
        if(book.borrowBook())
        {
            borrowedBook.add(book);
            System.out.println(book.getBookName()+" is successfully borrowed");
        }
        else {
            System.out.println(book.getBookName()+" is not available");
        }
    }
    public void returnBooks(Book book)
    {
        if(borrowedBook.remove(book))
        {
            book.returnBook();
            System.out.println(book.getBookName()+" is successfully returned");
        }
        else {
            System.out.println(book.getBookName()+" is not borrowed");
        }
    }
}
class Librarian{
    private String librarianName;
    private List<Book> catalog;

    Librarian(String librarianName)
    {
        this.librarianName = librarianName;
        this.catalog = new ArrayList<>();
    }
    public void addBook(Book book)
    {
        catalog.add(book);
        System.out.println(book.getBookName()+" is successfully added to the library catalog");
    }
    public void removeBook(Book book)
    {
        if(catalog.remove(book)) {
            System.out.println(book.getBookName() + " is successfully removed from the catalog");
        }
        else {
            System.out.println(book.getBookName()+" is not available in the catalog");
        }
    }
    public void viewCatalog()
    {
        System.out.println("Library Catalog: ");
        for(Book book : catalog)
        {
            System.out.println(book);
        }
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
    Book book1 = new Book("101","Thirsty Crow","Vishnupriyan",5);

    Librarian libraryObject = new Librarian("Gogulraj");
    libraryObject.addBook(book1);

    libraryObject.viewCatalog();

    Member member = new Member("123ad","ShanAdams");
    member.borrowBooks(book1);

    libraryObject.viewCatalog();

    member.returnBooks(book1);

    libraryObject.viewCatalog();
    }
}
