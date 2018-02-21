package chapter7;
/**
 * 被动引用二
 * 通过数组定义来引用类，不会触发此类的初始化
 * @author a_nuo
 *
 */
class SuperClass2 {

	static {
		System.out.println("SuperClass init!");
	}

	public static int value = 123;
}
public class NoInitialization2 {
	public static void main(String[] args) {
		SuperClass2[] sca = new SuperClass2[10];
	}

}
