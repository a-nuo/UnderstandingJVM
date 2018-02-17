package chapter4;
/**
 * 死锁代码样例
 * @author a_nuo
 *
 */
public class TestDeadLock {
	static class SynAddRunable implements Runnable{
		int a,b;
		public SynAddRunable(int a,int b){
			this.a = a;
			this.b = b;
		}
		@Override
		public void run(){
			synchronized(Integer.valueOf(a)){
				try {
					//增加等待时间，增加死锁概率
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(Integer.valueOf(b)){
					System.out.println(a+b);
				}
			}
		}
	}
	public static void main(String args[]){
		for(int i = 0; i < 100; i++){
			new Thread(new SynAddRunable(1,2)).start();
			new Thread(new SynAddRunable(2,1)).start();
			
		}
	}
}
