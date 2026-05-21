public class Main {
	public static void main(String[] args) {
		String[] items = {"ノートPC", "マウス", "キーボード"};
		int[] stocks = {5, 20, 3};
		
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i] + " : " + stocks[i] + "個");
		}
	}
}