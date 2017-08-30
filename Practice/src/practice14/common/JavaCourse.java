package practice14.common;
/*
 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】Java」
 * 単元
 * 		式と演算
 * 		制御構文
 * 		メソッド
 * 		配列
 * 		オブジェクト指向
 * 		継承
 * 		高度な継承
 */

public class JavaCourse implements Course {
	public String getCourseName() {
		return "【Eラーニング】Java";
	}
	public String[] getCourseUnit() {
		String[] course = {"指揮と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		return course;
	}
}
