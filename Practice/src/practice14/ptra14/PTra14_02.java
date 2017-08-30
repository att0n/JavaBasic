/*
 * PTra14_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

import practice14.common.DBCourse;

public class PTra14_02 {

	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */
	public static void main(String[] args) {
		DBCourse jc = new DBCourse();
		String[] c = jc.getCourseUnit();
		System.out.println(jc.getCourseName());
		System.out.println("～単元～");
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
