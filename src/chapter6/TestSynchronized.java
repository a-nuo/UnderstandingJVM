package chapter6;
/**
 * 查看生成的同步指令：monitorenter，monitoexit
 * 
 * @author a_nuo
 *
 */
public class TestSynchronized {
	/**
	 * 方法的access_flags=ACC_PUBLIC,ACC_SYNCHRONIZED
	 */
	public  synchronized void synMethod(){
		
	}
	public void onlyMe(Object f){
		synchronized(f){
			doSomething();
		}
	}
	public void doSomething(){
		
	}
}
