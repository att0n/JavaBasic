package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int i=0; i<6; i++) {
			for(int j=0; j<5; j++) {
				if(i<=j) {
					System.out.print("□");
				}else{
					System.out.print("■");
				}
			}System.out.println("");
		}
		for(int k=4; k>0; k--) {
			for(int l=0; l<5; l++) {
				if(k>l) {
					System.out.print("■");
				}else{
					System.out.print("□");
				}
			}System.out.println("");
		}

	}
}
