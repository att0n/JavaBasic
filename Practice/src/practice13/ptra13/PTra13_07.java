/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		//Hero cH = new Hero(25,10,7);
		SuperHero sHero = new SuperHero(25,10,7);
		Slime slime = new Slime(10,5,2);
		sHero.setName("勇者(装備あり)");
		slime.setName("スライム");

		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		Item item = new Item("こんぼう",4);

		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		sHero.setEquipment(item);

		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		while(sHero.damage(slime.attack())==false || slime.damage(sHero.attack())==false) {
			int ha = sHero.attack();
			slime.damage(ha);
			int sa = slime.attack();
			sHero.damage(sa);
		}

		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		if(sHero.damage(slime.attack())==true) {
			System.out.println("勇者はスライムとの戦闘に勝利した");
		}else {
			System.out.println("スライムは勇者との戦闘に勝利した");
		}

	}
}
