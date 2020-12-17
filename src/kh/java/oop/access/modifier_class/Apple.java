package kh.java.oop.access.modifier_class;
/**
 * 접근제한자 Access Modifier
 * 
 * field/method
 * 1. public 다른패키지 | 다른 클래스 모두다 가능
 * 2. protected 같은 패키지 | 다른 패키지라도 상속관계 OK
 * 3. default(작성금지) 같은 패키지 (쓰면 오류난다. public int getPoint()
 * 4. private 같은 클래스 내에서만 접근 가능
 *
 * class
 * 1. public 다른패키지 | 다른 클래스 모두다 가능
 * 2. default(작성금지) 같은 패키지 (쓰면 오류난다.)
 * 
 */
public class Apple {

}
/**
 * default class = package class ->그래서 보통 default 클래스를 사용하지 않는다.
 * 
 * 객체지향 프로그래밍 : 완성된 클래스를 모듈로써(부품으로써) 가져다 쓰도록 제공하는 것.
 * 
 * 
 * 
 */
class PineApple{
	
}
