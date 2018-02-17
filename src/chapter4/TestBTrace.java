package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 测试BTrace功能，在运行的程序中加入调试代码
 * 打印调用堆栈、参数、返回值，只是基本功能，还可以监控性能、定位连接泄露、内存泄露、解决多线程竞争问题
 * 详见：
 * @author a_nuo
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class TestBTrace {
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) throws IOException {
		TestBTrace test = new TestBTrace();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			reader.readLine();
			int a = (int) Math.round(Math.random() * 1000);
			int b = (int) Math.round(Math.random() * 1000);
			System.out.println(test.add(a, b));
		}
	}
}
/*
 *  BTrace Script Template
import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class TracingScript {
	@OnMethod(
    clazz="chapter4.TestBTrace",
    method="add",
    location=@Location(Kind.RETURN)
    )
    public static void func(@Self chapter4.TestBTrace instance, int a,int b,@Return int result,@Duration long duration){
        println("调用堆栈:");
        jstack();
        println(strcat("方法参数A:",str(a)));
        println(strcat("方法参数B:",str(b)));
        println(strcat("方法执行时间:",str(duration)));
        println(strcat("方法结果:",str(result)));
    }
}
 * */
