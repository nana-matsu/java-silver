package javaSilver.chapter03.p136;


import java.util.List;
//import java.util.*; テキストの解答ではutil.*、util.stream.*をインポートするよう記載があったがctrl＋sで保存するとutil.Listのみインポートとなってしまう
//import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		//	3-4
		List<String> names = List.of("湊雄輔", "朝香あゆみ", "菅原拓真", "大江岳人");
		names.stream()
		.filter(n -> n.length() <= 4)
		.map(n -> n + "さん")
		.forEach(System.out::println);
	}
}