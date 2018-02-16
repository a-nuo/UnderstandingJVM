package chapter3;

public class TestPretenureSizeThreshold {
	private static final int _1M = 1024*1024;
	/**
	 * -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC -XX:PretenureSizeThreshold=3145728
	 * XX:PretenureSizeThreshold，大于3M直接进入老年代，该参数仅支持
	 * @param args
	 */

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte[] allocation;
		allocation = new byte[4 * _1M];

	}

}
