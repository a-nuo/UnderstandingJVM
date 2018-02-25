package chapter8;
/**
 * Full GC 内存未回收 ParOldGen: 65536K->65823K(174592K)  
 * placeholder 任然在所用域之内
 * @author a_nuo
 *
 */
public class TestSlot8_1 {

	public static void main(String[] args) {
		byte[] placeholder = new byte[64 * 1024 * 1024];
		System.gc();
	}

}
