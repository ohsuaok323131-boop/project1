package myClass;


/**
 * DB_Element: 데이터베이스에 저장되는 요소의 추상 클래스
 *
 * @author (2025957111 김가희)
 * @version (2026.10.04)
 */
public abstract class DB_Element
{
    /**
     * 요소의 고유번호를 반환한다.
     *
     * @return     요소의 고유번호(문자열)
     */
    public abstract String getID();
}