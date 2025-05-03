public class Book {
    private int isbn;
    private String title;
    private String author;
    private BookCategory category;
    private boolean checkedOut;

    public Book (int constIsbn, String constTitle, String constAuthor, BookCategory constCategory){
        isbn = constIsbn;
        title = constTitle;
        author = constAuthor;
        category = constCategory;
        checkedOut = false;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean status) {
        checkedOut = status;
    }

}
