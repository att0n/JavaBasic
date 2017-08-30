package practice10;
import java.util.Arrays;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ★ carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * ★ 各carインスタンスのrunメソッドを実行して、200km先の目的地に到達した順位を出力してください
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.serialNo = 10000;
		car1.color = "Red";
		car1.gasoline = 200;
		car2.serialNo = 20000;
		car2.color = "Blue";
		car2.gasoline = 200;
		car3.serialNo = 30000;
		car3.color = "Green";
		car3.gasoline = 200;

		int distance = 200;
		int distance1 = 0;
		int distance2 = 0;
		int distance3 = 0;
		String line = "";

		while(distance1<=200 && distance2<=200 && distance3<=200) {
			distance1 += car1.run();
			distance2 += car2.run();
			distance3 += car3.run();
			line = distance1 + "," + distance2 + "," + distance3;
		}
		String[] ranking = line.split(",",0);
		Arrays.sort(ranking);
		for(int i=2; i>=0; i--) {
			System.out.println(ranking[i]);
		}
	}
}
