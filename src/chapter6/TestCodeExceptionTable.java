package chapter6;
/**
 * 查看 方法  code 内的 exception_table（异常表）
 * @author a_nuo
 *
 */
public class TestCodeExceptionTable {
	public int inc(){
		int x;
		try {
			x = 1;
			return x;
		} catch(Exception e){
			x = 2;
			return x;
		}finally {
			x = 3;
		}
	}
}
