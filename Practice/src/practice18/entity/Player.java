package practice18.entity;
/*
 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
 *
 * フィールド
 * 		position	：	String
 * 		name		：	String
 * 		country		：	String
 * 		team		：	String
 * メソッド
 * 		各アクセサ
 *
 * 		toString()	：	Objectクラスのオーバーライド
 * 		各フィールドの値を、カンマ区切りの文字列を取得する
 */
public class Player {
	private String position;
	private String name;
	private String country;
	private String team;

	public String getPosition() {
		return this.position;
	}
	public void setPositon(String p) {
		this.position = p;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getCountry() {
		return this.country;
	}
	public void setCountry(String c) {
		this.country = c;
	}
	public String getTeam() {
		return this.team;
	}
	public void setTeam(String t) {
		this.team = t;
	}

	public String toString(String p,String n,String c,String t) {
		return p + "," + n + "," + c + "," + t;
	}
	//public String toString() {
		//return this.position + "," + this.name + "," + this.country + "," + this.team;
	//}
}
