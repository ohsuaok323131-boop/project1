package DataBase;
import java.util.ArrayList;
import myClass.DB_Element;

/**
 * LibDB 클래스의 설명을 작성하세요.
 *
 * @author (20253280028오수아)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibDB<T extends DB_Element>
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 변경하세요.
    private ArrayList<T> db;

    /**
     * LibDB 클래스의 객체 생성자
     */
    public LibDB()
    {
        // 인스턴스 변수 초기화
        db=new ArrayList<T>();
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public void addElement(T x)
    {
        db.add(x);
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public T findElement(String id)
    {
        for(T x:db){
            if(x.getID().equals(id))
                return x;
        }
        return null;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void printAllElements()
    {
        for(T x:db)
            System.out.println(x);
    }
}