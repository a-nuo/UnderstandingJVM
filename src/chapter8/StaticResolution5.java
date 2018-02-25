package chapter8;
/**
 * 测试  方法静态解析 演示
 * 依赖静态类型定位方法执行版本
 * 主要指编译阶段的方法重载
 * @author a_nuo
 *
 */
public class StaticResolution5 {
	 public static void sayHello(){
		 System.out.println("Hello world");
	 }
	 public static void main(String[] args) {
		StaticResolution5.sayHello();
	}
}
