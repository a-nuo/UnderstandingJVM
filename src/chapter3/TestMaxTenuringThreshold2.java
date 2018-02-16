package chapter3;

public class TestMaxTenuringThreshold2 {
	private static final int _1M = 1024*1024;
	/**
	 * -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15 -XX:+PrintTenuringDistribution -XX:+UseSerialGC
	 * 
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte[] allocation1,allocation2,allocation3,allocation4;
		allocation1 = new byte[_1M / 4];
//		allocation2 = new byte[_1M / 4];
		allocation3 = new byte[_1M * 4];
		allocation4 = new byte[_1M * 4];
		allocation4 = null;
		allocation4 = new byte[_1M * 4];
	}

}
