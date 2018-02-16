package chapter3;

public class TestHandlePromotion {
	private static final int _1M = 1024*1024;
	/**
	 * -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8  -XX:-HandlePromotionFailure
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte[] allocation1,allocation2,allocation3,allocation4;
		allocation1 = new byte[2 * _1M];
		allocation2 = new byte[2 * _1M];
		allocation3 = new byte[2 * _1M];
		allocation1 = null;
		allocation4 = new byte[2 * _1M];
		byte[] allocation5 = new byte[2 * _1M];
		byte[] allocation6 = new byte[2 * _1M];
		allocation4 = null;
		allocation5 = null;
		allocation6 = null;
		byte[] allocation7 = new byte[2 * _1M];
		

	}

}
