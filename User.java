// [패키지 선언] User 클래스를 myClass 패키지에 넣는다. (6장 9쪽)package myClass;


/**
 * DB_Element 클래스의 설명을 작성하세요.
 *
 * @author (2025320028오수아)
 * @version (버전 번호 또는 작성한 날짜)
 */
/**
 * 도서관 이용자 한 명을 나타내는 클래스.
 * DB_Element를 상속하며, 이용자고유식별번호(stID)를 고유 식별번호로 사용한다.
 *
 * @author (학번 이름)
 * @version (2026.10.04)
 */
// [extends DB_Element] DB_Element를 상속한다.
//   → LibDB<User>에 저장하고 getID()로 이용자를 찾을 수 있게 된다.
public class User extends DB_Element
{
    // ---------------- 속성(필드) ----------------
    // [private] UML의 '-' 표시. 외부에서 직접 접근하지 못하게 숨긴다.
    private String name;    // 이름 (예: "Kim")

    // [Integer] UML에 stID : Integer 로 되어 있어서 기본 타입 int가 아니라
    //   Wrapper 클래스 Integer를 사용했다. (6장 33쪽 Wrapper 클래스)
    //   Integer는 "객체"이므로 toString() 같은 메소드를 호출할 수 있다.
    // [참고] 학번 2025320001은 int 최댓값(2,147,483,647)보다 작아서 int/Integer로 저장 가능하다.
    private Integer stID;   // 이용자고유식별번호(학번) (예: 2025320001)

    // ---------------- 생성자 ----------------
    /**
     * User 객체 생성자
     * 사용 예) new User(2025320001, "Kim")
     *
     * @param stID 이용자고유식별번호 (int 값이 Integer로 자동 박싱됨)
     * @param name 이름
     */
    // [매개변수 순서] UML의 User(int, String) 그대로: (학번, 이름)
    public User(int stID, String name)
    {
        // [자동 박싱(auto boxing)] 매개변수 stID는 기본 타입 int인데,
        //   필드 this.stID는 Integer 객체이다.
        //   int 값을 Integer에 대입하면 자바가 자동으로 Integer.valueOf(stID)로 바꿔준다.
        //   (6장 38쪽 "자동 박싱과 자동 언박싱", JDK 1.5부터)
        this.stID = stID;
        this.name = name;
    }

    // ---------------- 메소드 ----------------
    /**
     * 이용자의 고유 식별번호(stID)를 문자열로 반환한다.
     * LibDB의 findElement(String)에서 비교할 수 있도록 String으로 변환한다.
     *
     * @return stID를 문자열로 변환한 값
     */
    // [추상 메소드 구현] DB_Element의 getID()는 반환형이 String이다.
    //   그런데 stID는 Integer이므로 그대로 반환할 수 없다.
    //   → Integer 객체의 toString()을 호출해 "2025320001" 같은 문자열로 바꿔서 반환한다.
    //   (6장 34~36쪽 Wrapper 객체 → 문자열 변환)
    // [왜 문자열인가?] 팀원 C가 대출 처리할 때 findElement("2025320001")처럼
    //   문자열로 이용자를 찾기 때문에, 책과 같은 방식(문자열 비교)으로 통일했다.
    public String getID()
    {
        return stID.toString();
    }

    /**
     * 이용자 정보를 "[2025320001] Kim" 형태의 문자열로 반환한다.
     *
     * @return 이용자 정보 문자열
     */
    // [toString 오버라이딩] Object의 toString()을 다시 정의해서
    //   실습 실행 화면과 같은 모양으로 출력되게 한다. (6장 25~27쪽)
    // [출력 예] [2025320001] Kim
    //   Integer 객체 stID를 + 연산으로 문자열에 연결하면
    //   stID.toString()이 자동 호출되어 숫자가 문자열로 들어간다. (6장 46쪽)
    public String toString()
    {
        return "[" + stID + "] " + name;
    }
}