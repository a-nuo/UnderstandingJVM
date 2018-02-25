package chapter8;
/**
 * 动态分派：生成的字节码，都是调用
	//invokevirtual #22     // Method chapter8/DynamicDispatch8$Human.sayHello:()V
	 *指令invokevirtual，通过栈顶的第一个元素所指向的对象的【实际类型】，查找常量中的描述符和简单名称都相符的方法
 * @author a_nuo
 *
 */
public class DynamicDispatch8 {
	static abstract class Human {
		protected abstract void sayHello();
	}

	static class Man extends Human {
		@Override
		protected void sayHello() {
			System.out.println("man say hello");
		}
	}

	static class Woman extends Human {
		@Override
		protected void sayHello() {
			System.out.println("woman say hello");
		}
	}

	public static void main(String[] args) {
		Human man = new Man();
		Human woman = new Woman();
		//invokevirtual #22     // Method chapter8/DynamicDispatch8$Human.sayHello:()V
		man.sayHello();
		//invokevirtual #22     // Method chapter8/DynamicDispatch8$Human.sayHello:()V
		woman.sayHello();
		man = new Woman();
		//invokevirtual #22     // Method chapter8/DynamicDispatch8$Human.sayHello:()V
		man.sayHello();
	}
}
