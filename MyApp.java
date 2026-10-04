import java.util.*;
import DataBase.LibDB;
import myClass.*;

/**
 * MyApp : 이용자가 책을 대출하는 처리를 수행하는 프로그램
 * 대출작업 수행 후 대출 현황 출력
 *
 * @author (2025320028 오수아, 2025320012 박현서)
 * @version (2026.10.04)
 */
public class MyApp
{
    public static void main(String[] args){
        // DB 3개 생성
        LibDB<User> userDB = new LibDB<User>();
        LibDB<Book> bookDB = new LibDB<Book>();
        HashMap<User, Book> loanDB = new HashMap<User, Book>();
        
        // 이용자 3명 생성
        User u1 = new User(2025320001, "Kim");
        User u2 = new User(2024320002, "Lee");
        User u3 = new User(2023320003, "Park");
        
        // 이용자 이용자DB에 등록
        userDB.addElement(u1);
        userDB.addElement(u2);
        userDB.addElement(u3);
        
        // 이용자 목록 출력
        System.out.println("----- 이용자 목록 출력 -----");
        printDB(userDB);
        System.out.println();
        
        // 책 4권 생성
        Book b1 = new Book("B01", "Java Programming", "홍길동", "ABC", 2000);
        Book b2 = new Book("B02", "Software Analysis and Design", "profsHwang", "SMU", 2023);
        Book b3 = new Book("B03", "명품 자바프로그래밍", "황기태", "생능출판", 2025);
        Book b4 = new Book("B04", "소프트웨어테스트", "profsHwang", "SMU", 2024);
        
        // 책 4권을 책DB에 등록
        bookDB.addElement(b1);
        bookDB.addElement(b2);
        bookDB.addElement(b3);
        bookDB.addElement(b4);
        
        // 책 목록 출력
        System.out.println("----- 책 목록 출력 -----");
        printDB(bookDB);
        System.out.println();
        
        // 대출작업 3개 수행
        loanDB.put(userDB.findElement("2025320001"), bookDB.findElement("B02"));
        loanDB.put(userDB.findElement("2024320002"), bookDB.findElement("B03"));
        loanDB.put(userDB.findElement("2023320003"), bookDB.findElement("B04"));
        
        // 대출 현황 출력
        printLoanList(loanDB);
    }

    /**
     * 책DB or 이용자DB에 저장된 모든 요소를 출력
     *
     * @param  db : 책DB or 이용자DB를 출력할 데이터베이스 
     */
    public static <T extends DB_Element> void printDB(LibDB<T> db)
    {
        db.printAllElements();
    }

    /**
     * 대출DB에 저장된 대출 현황 출력
     *
     * @param  loanDB: 이용자와 대출한 책을 저장한 대출DB
     */
    public static void printLoanList(HashMap<User, Book> loanDB)
    {
        System.out.println("----- 대출 현황 -----");
        // 대출DB, 이용자 한 명씩 꺼내서 대출한 책과 같이 출력
        for (User user : loanDB.keySet()){
            System.out.println(user + " ===> " + loanDB.get(user));  
        }
        System.out.println("--------------------");
        }
    }