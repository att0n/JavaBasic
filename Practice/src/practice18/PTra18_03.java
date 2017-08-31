/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(",",0);
                Player player = new Player();
                player.setPositon(line[0]);
                player.setName(line[1]);
                player.setCountry(line[2]);
                player.setTeam(line[3]);

                array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
        for(int i=0; i<array.size(); i++) {
        	if(array.get(i).getTeam().indexOf("レアル・マドリード")==0) {
        		array.remove(array.get(i).getTeam().indexOf("レアル・マドリード"));
        	}else if(array.get(i).getTeam().indexOf("バルセロナ")==0){
        		array.remove(array.get(i).getTeam().indexOf("バルセロナ"));
        	}
        }

        //System.out.println(array.get(0).getTeam());

		// ★ 削除後のArrayListの中身を全件出力してください
        for(Player p : array) {
        	System.out.println(p.toString(p.getPosition(), p.getName(), p.getCountry(), p.getTeam()));
        }

	}
}
