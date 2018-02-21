package chapter7;
/**
 * 测试字段解析
 * @author a_nuo
 *
 */
public class FieldResolution {

	interface Interface0 {
		int A = 0;
	}

	interface Interface1 extends Interface0 {
		int A = 1;
	}

	interface Interface2 {
		int A = 2;
	}

	static class Parent implements Interface1 {
		public static int A = 3;
	}

	static class Sub extends Parent implements Interface2 {
		//public static int A = 4;
	}

	public static void main(String[] args) {
		//注释22行，则提示The field Sub.A is ambiguous（歧义，父类和实现的接口中都包含A字段）
		System.out.println(Sub.A);
	}
}
