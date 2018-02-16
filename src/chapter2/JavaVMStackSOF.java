package chapter2;

public class JavaVMStackSOF {
	private int stackLength = 1;
	
	public void stackLenth(){
		stackLength++;
		stackLenth();
	}
	
	public static void main(String[] args) throws Throwable{
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try {
			oom.stackLenth();
		} catch (Throwable e) {
			System.out.println("栈深度："+oom.stackLength);
			throw e;
		}
	}

}
