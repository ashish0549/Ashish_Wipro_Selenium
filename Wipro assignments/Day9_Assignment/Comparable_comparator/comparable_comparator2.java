//Q12. Sort a list of Book objects using both Comparable (by ID) and Comparator (by title, then author).

package Comparable_comparator;
import java.util.*;

//Book class implementing Comparable (sort by ID)
class Books implements Comparable<Books> {
 private int bookId;
 private String title;
 private String author;


 public Books(int bookId, String title, String author) {
     this.bookId = bookId;
     this.title = title;
     this.author = author;
 }


 public int getBookId() {
     return bookId;
 }

 public String getTitle() {
     return title;
 }

 public String getAuthor() {
     return author;
 }


 public int compareTo(Books other) {
     return Integer.compare(this.bookId, other.bookId);
 }

 
 public String toString() {
     return "Book{id=" + bookId + ", title='" + title + "', author='" + author + "'}";
 }

 public static final Comparator<Books> TITLE_THEN_AUTHOR_COMPARATOR = new Comparator<Books>() {
     
     public int compare(Books b1, Books b2) {
         int titleComparison = b1.getTitle().compareToIgnoreCase(b2.getTitle());
         if (titleComparison != 0) {
             return titleComparison;
         }
         return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
     }
 };
}
public class comparable_comparator2 {
	public static void main(String[] args) {
        List<Books> b = new ArrayList<>();
        b.add(new Books(103, "Java Programming", "Anita"));
        b.add(new Books(101, "Data Structures", "Ravi"));
        b.add(new Books(105, "Java Programming", "Zoya"));
        b.add(new Books(102, "Algorithms", "Meera"));
        b.add(new Books(104, "Data Structures", "Amit"));

       
        System.out.println("Original List:");
        b.forEach(System.out::println);

       
        Collections.sort(b);
        System.out.println("\nSorted by Book ID (Comparable):");
        b.forEach(System.out::println);

     
        b.sort(Books.TITLE_THEN_AUTHOR_COMPARATOR);
        System.out.println("\nSorted by Title, then Author (Comparator):");
        b.forEach(System.out::println);
    }
}
