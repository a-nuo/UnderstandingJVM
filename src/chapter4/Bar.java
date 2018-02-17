package chapter4;
/**
 * 增加HSDIS插件后，命令执行：java -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly -Xcomp -XX:CompileCommand=dontinline,*Bar.sum -XX:CompileCommand=compileonly,*Bar.sum chapter4.Bar  
 * mac下，目前仅jdk7设置成功，放置lib包到该位置：/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/server/hsdis-amd64.dylib
 * @author a_nuo
 *
 */
public class Bar {
    int a = 1;
    static int b = 2;

    public int sum(int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
		Bar bar = new Bar();
		int a = 20;
		while (a-- > 0) {
			System.out.println(bar.sum(3));
		}
    }
}
