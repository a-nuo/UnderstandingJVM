package chapter7;

import java.io.IOException;
import java.io.InputStream;

/**
 * 不同的类加载器对instanceof关键字运算的结果的影响
 * @author a_nuo
 *
 */
public class ClassloaderTest {

	public static void main(String[] args) throws Exception {
		ClassLoader myLoader = new ClassLoader(){
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				try {
					String fileName = name.substring(name.lastIndexOf(".")+1)+".class";
					InputStream is = getClass().getResourceAsStream(fileName);
					if(is==null){
						return super.loadClass(name);
					}
					byte[] b = new byte[is.available()];
					is.read(b);
					return defineClass(name,b, 0, b.length);
				} catch (IOException e) {
					e.printStackTrace();
					throw new ClassNotFoundException(name);
				}
			}
			@Override
			public String toString() {
				StringBuilder sb = new StringBuilder();
				sb.append("myLoader ");
				return sb.append(super.toString()).toString();
			}
		};
		//类
		Object classObj = myLoader.loadClass("chapter7.ClassloaderTest");
		Object instance = ((Class)classObj).newInstance();//实例化对象
		System.out.println(classObj);
		System.out.println(instance);
		System.out.println(instance.getClass());
		System.out.println(instance instanceof chapter7.ClassloaderTest);
		//classObj类的加载器
		System.out.println(((Class)classObj).getClassLoader());
		//myLoader类的加载器
		System.out.println(myLoader.getClass().getClassLoader());
	}

}
