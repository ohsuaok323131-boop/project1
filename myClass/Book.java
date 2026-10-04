package myClass;


/**
 * Book 클래스의 설명을 작성하세요.
 *
 * @author (2025957111 김가희)
 * @version (2026.10.04)
 */
public class Book extends DB_Element
{
    private String author;     // 저자
    private String bookID;     // 책이 등록된 번호
    private String publisher;  // 출판사
    private String title;      // 제목
    private int year;          // 출판 년도
    
    public Book(String bookID, String title, String author, String publisher, int year)
    {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }
    // 고유번호(책등록번호) 반환
    public String getID()
    {
        return bookID;
    }
    // 출력 형식
    public String toString()
    {
        return "(" + bookID + ") " + title + ", " + author + ", " + publisher + ", " + year;
    }
}