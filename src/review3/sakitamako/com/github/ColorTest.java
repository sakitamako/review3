package review3.sakitamako.com.github;

public class ColorTest {
	public static void main(String[] args) {
		
		ColorChart red = new ColorChart();
		red.color = "赤";
		red.level = 10;
		System.out.println(red.color + "ベースの");
		System.out.println(red.level + "トーンカラー");
		
		ColorChart blue = new ColorChart("青", 9);
		System.out.println(blue.color + "ベースの");
		System.out.println(blue.level + "トーンカラー");
	}

}
