public class Book {
    Integer bookId;
    String title, author;

    Book(Integer id, String name, String auth){
        bookId = id;
        title = name;
        author = auth;
    }
    public Integer getId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
}
