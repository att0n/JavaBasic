package practice13.common;
/*
 * ★ common.Itemクラスを作成してください
 *
 * フィールド
 * 		name	:	String
 * 		additionalDamage	:	int
 * メソッド
 * 		各フィールドのアクセサ
 * コンストラクタ
 * 		name, additionalDamageに初期値を設定するコンストラクタ
 * 		上記2つを設定するための引数を持つ
 */
public class Item {
	private String name;
	private int additionalDamage;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdditionalDamage() {
		return additionalDamage;
	}
	public void setAdditionalDamage(int aid) {
		this.additionalDamage = aid;
	}

	public Item(String n,int a) {
		this.name = n;
		this.additionalDamage = a;
	}
}
