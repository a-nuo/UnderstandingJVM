package chapter3;

public class TestAllocation {
	private static final int _1M = 1024*1024;
	/**
	 * VM 参数: -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 * jdk1.7.0_80需要添加-XX:+UseConcMarkSweepGC ,使用CMS垃圾回收器 ，否则默认使用
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte[] allocation1,allocation2,allocation3,allocation4;
		allocation1 =new byte[2 * _1M];
		allocation2 = new byte[2 * _1M];
		allocation3 = new byte[2 * _1M];
		allocation4 = new byte[4 * _1M];//出现一次minor GC
	}

}
