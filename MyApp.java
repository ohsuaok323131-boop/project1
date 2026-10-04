import java.util.*;
import DataBase.LibDB;
import myClass.*;

/**
 * MyApp 클래스의 설명을 작성하세요.
 *
 * @author (2025320028오수아, 2025320012박현서)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        LibDB<User> userDB = new LibDB<User>();
        LibDB<Book> bookDB = new LibDB<Book>();
        HashMap<User, Book> loanDB = new HashMap<User, Book>();

        User u1 = new User(2025320001, "Kim");
        User u2 = new User(2024320002, "Lee");
        User u3 = new User(2023320003, "Park");

        userDB.addElement(u1);
        userDB.addElement(u2);
        userDB.addElement(u3);

        System.out.println("----- 이용자 목록 출력 -----");
        printDB(userDB);
        System.out.println();

        Book b1 = new Book("B01", "Java Programming", "홍길동", "ABC", 2000);
        Book b2 = new Book("B02", "Java Software Analysis and Design", "profsHwang", "SMU", 2023);
        Book b3 = new Book("B03", "명품 자바프로그래밍", "황기태", "생능출판", 2025);
        Book b4 = new Book("B04", "소프트웨어테스트", "profsHwang", "SMU", 2024);

        bookDB.addElement(b1);
        bookDB.addElement(b2);
        bookDB.addElement(b3);
        bookDB.addElement(b4);

        System.out.println("----- 책 목록 출력 -----");
        printDB(bookDB);
        System.out.println();

        loanDB.put(userDB.findElement("2025320001"), bookDB.findElement("B02"));
        loanDB.put(userDB.findElement("2024320002"), bookDB.findElement("B03"));
        loanDB.put(userDB.findElement("2023320003"), bookDB.findElement("B04"));

        printLoanList(loanDB);
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public static <T extends DB_Element> void printDB(LibDB<T> db)
    {
        db.printAllElements();
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public static void printLoanList(HashMap<User, Book> loanDB)
    {
        System.out.println("----- 대출 현황 -----");
        for (User user : loanDB.keySet()){
            System.out.println(user + " ===> " + loanDB.get(user));
        }
        System.out.println("--------------------");
        }
    }