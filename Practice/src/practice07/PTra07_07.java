package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_07 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += array[0][i];
		}
		for(int i=0; i<4; i++) {
			sum += array[1][i];
		}
		System.out.println(sum/7);

	}
}
