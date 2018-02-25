package chapter8;
/**
 * 单分派、多分派演示
 * 方法的接受者和方法的参数，统称为方法的宗量
 * java 的静态分配属于多分派根据两个宗量进行选择，动态分配属于单分派，根据方法
* @author zzm
 */
public class Dispatch10 {
	static class QQ {}

	static class _360 {}

	public static class Father {
		public void hardChoice(QQ arg) {
			System.out.println("father choose qq");
		}

		public void hardChoice(_360 arg) {
			System.out.println("father choose 360");
		}
	}

	public static class Son extends Father {
		public void hardChoice(QQ arg) {
			System.out.println("son choose qq");
		}

		public void hardChoice(_360 arg) {
			System.out.println("son choose 360");
		}
	}

	public static void main(String[] args) {
		Father father = new Father();
		Father son = new Son();
		father.hardChoice(new _360());
		son.hardChoice(new QQ());
	}
}