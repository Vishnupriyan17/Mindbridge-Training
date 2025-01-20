package Day2.Constructors;

class Book{
    String title;
    String author;
    Book()
    {
        title = "Thirsty Crow";
        author = "Vishnupriyan";
    }
    public void display()
    {
        System.out.println("The title of the book is: "+title+"\n"+"Authoe of this book is: "+author);
    }
}
public class Default {
    public static void main(String[] args) {
    Book book = new Book();
    book.display();
    }
}
