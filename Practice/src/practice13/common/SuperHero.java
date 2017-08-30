package practice13.common;
/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */
public class SuperHero extends practice13.common.Hero{
	Item equipment;

	public SuperHero(int h,int p,int e) {
		super(h,p,e);
	}

	public int attack(int p,int ad) {
		return p + ad;
	}
	public Item getEquipment() {
		return equipment;
	}
	public void setEquipment(Item eq) {
		this.equipment = eq;
	}
}
