package myClass;


/**
 * User 클래스의 설명을 작성하세요.
 *
 * @author (2025957111 김가희)
 * @version (2026.10.04)
 */
public class User extends DB_Element
{
    private String name;    // 이름
    private Integer stID;   // 학번 (Wrapper 클래스)
    public User(int stID, String name)
    {
        this.stID = stID;   // int → Integer 자동 박싱
        this.name = name;
    }
    public String getID()
    {
        return stID.toString();
    }
    // 출력 형식
    public String toString()
    {
        return "[" + stID + "] " + name;
    }
}