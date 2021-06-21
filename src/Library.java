import java.util.Scanner;

class CenteralLibrary{
    String books[];
    int i;
    CenteralLibrary(){
        this.books = new String[100];
        this.i = 0;
    }
    void AddBook(String book){
        this.books[i] = book;
        i++;

    }
    void AvailabelBooks(){
        System.out.println("The availabel books are ");
        for(int i = 0;i<this.books.length;i++){
            if(this.books[i]==null){
                continue;
            } else {
                System.out.println(this.books[i]);
            }
        }
    }
    void issueBook(String s){
        for(int i = 0;i<this.books.length;i++){
            if(this.books[i]==s){
                System.out.println("The book is isued ");
                this.books[i] = null;
                break;
            }else{
                System.out.println("The book isn't avaialbel ");
                break;
            }
        }
    }
    void returnBook(String b){
        this.AddBook(b);
    }
}
public class Library {
    public static void main(String[] args) {
     CenteralLibrary c = new CenteralLibrary();
     c.AddBook("Marriage of two states ");
     c.AddBook("C++");
     c.AvailabelBooks();
     c.issueBook("Marriage of two states ");
     c.returnBook("Marriage of two states ");
   c.AvailabelBooks();
    }

}
// You have to implement a library using Java Class "Library"
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books
