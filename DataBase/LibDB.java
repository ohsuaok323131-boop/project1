package DataBase;
import java.util.ArrayList;
import myClass.DB_Element;
import java.util.Iterator;
/**
 * LibDB : 도서관 데이터베이스(UserDB, BookDB)를 나타내는 제네릭 클래스
 * T는 DB_Element의 자식 클래스(Book, User)만 가능하다.
 * @author (2025320028 오수아)
 * @version (2026.10.03)
 */
public class LibDB<T extends DB_Element>
{
    private ArrayList<T> db;

    /**
     * LibDB 클래스의 객체 생성자. 요소를 저장할 ArrayList를 생성한다.
     */
    public LibDB()
    {
        db=new ArrayList<T>();
    }

    /**
     * 요소 x를 DB에 추가한다.
     *
     * @param  x : DB에 추가할 요소
     */
    public void addElement(T x)
    {
        db.add(x);
    }

    /**
     * getID()가 id와 같은 요소를 찾는다. 
     *
     * @param  id : 찾을려는 요소의 번호
     * @return    찾은 요소 , 없으면 null
     */
    public T findElement(String id)
    {
        Iterator<T> item=db.iterator();
        while(item.hasNext()){
            T x=item.next();
            if (x.getID().equals(id))
            return x;
        }
        return null;
    }

    /**
     * DB에 저장된 모든 요소를 출력한다. 
     *
     */
    public void printAllElements()
    {
        for(T x:db)
            System.out.println(x);
    }
}