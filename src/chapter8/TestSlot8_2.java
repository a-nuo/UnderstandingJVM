package chapter8;
/**
 * Full GC 内存未回收 ParOldGen: 65536K->65823K(174592K)  
 * placeholder 原本所占用的Slot未被其他变量复用，这种关联违背打断
 * @author a_nuo
 *
 */
public class TestSlot8_2 {

	public static void main(String[] args) {
		{
			byte[] placeholder = new byte[64 * 1024 * 1024];
		}
		System.gc();
	}

}
