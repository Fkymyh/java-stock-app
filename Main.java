package stocksproject;

public class Main {
	public static void main(String[] args) {
		
		String[] items = {"ノートPC", "マウス", "キーボード"};
		int[] stocks = {5, 10, 2};
		
		showItems(items, stocks);
		showLowStock(items, stocks);
	}
	public static void showItems(String[] items, int[] stocks) {
		System.out.println("===在庫一覧===");
		
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i] + " : " + stocks[i] + "個");
		}
		int sum = 0;
		for(int i = 0; i < stocks.length; i++) {
			sum += stocks[i];
		}
		System.out.println("合計在庫数 :" + sum);
	}
	public static void showLowStock(String[] items, int[] stocks) {
		
		System.out.println("===在庫が少ない商品===");
		
		for (int i = 0; i < stocks.length; i++) {
			if (stocks[i] <= 3) {
				System.out.println(items[i] + " : " + stocks[i] + "個");
			}
		}
	}
}
