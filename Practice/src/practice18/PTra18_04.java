/*
 * PTra18_04.java
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

public class PTra18_04 {

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


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        int random = new java.util.Random().nextInt(5);
        int random2 = new java.util.Random().nextInt(20)+5;
        int random3 = new java.util.Random().nextInt(20)+5;
        int random4 = new java.util.Random().nextInt(20)+5;
        int random5 = new java.util.Random().nextInt(20)+5;
        int random6 = new java.util.Random().nextInt(15)+25;
        int random7 = new java.util.Random().nextInt(15)+25;
        int random8 = new java.util.Random().nextInt(15)+25;
        int random9 = new java.util.Random().nextInt(15)+25;
        int random10 = new java.util.Random().nextInt(15)+40;
        int random11 = new java.util.Random().nextInt(15)+40;

        int sumGK = 0;
        int sumDF = 0;
        int sumMF = 0;
        int sumFW = 0;

        for(int i=0; i<array.size(); i++) {
            if(array.get(i).getPosition().indexOf("GK")==0) {
            	sumGK++;
            }else if(array.get(i).getPosition().indexOf("DF")==0) {
            	sumDF++;
            }else if(array.get(i).getPosition().indexOf("MF")==0) {
            	sumMF++;
            }else if(array.get(i).getPosition().indexOf("FW")==0) {
            	sumFW++;
            }
        }
        //System.out.println("GK" + sumGK + ",DF" + sumDF + ",MF" + sumMF + ",FW" + sumFW);
        //System.out.println(random10);
        System.out.println(array.get(random).getPosition() + "," + array.get(random).getName() + "," + array.get(random).getCountry() + "," + array.get(random).getTeam());
        System.out.println(array.get(random2).getPosition() + "," + array.get(random2).getName() + "," + array.get(random2).getCountry() + "," + array.get(random2).getTeam());
        System.out.println(array.get(random3).getPosition() + "," + array.get(random3).getName() + "," + array.get(random3).getCountry() + "," + array.get(random3).getTeam());
        System.out.println(array.get(random4).getPosition() + "," + array.get(random4).getName() + "," + array.get(random4).getCountry() + "," + array.get(random4).getTeam());
        System.out.println(array.get(random5).getPosition() + "," + array.get(random5).getName() + "," + array.get(random5).getCountry() + "," + array.get(random5).getTeam());
        System.out.println(array.get(random6).getPosition() + "," + array.get(random6).getName() + "," + array.get(random6).getCountry() + "," + array.get(random6).getTeam());
        System.out.println(array.get(random7).getPosition() + "," + array.get(random7).getName() + "," + array.get(random7).getCountry() + "," + array.get(random7).getTeam());
        System.out.println(array.get(random8).getPosition() + "," + array.get(random8).getName() + "," + array.get(random8).getCountry() + "," + array.get(random8).getTeam());
        System.out.println(array.get(random9).getPosition() + "," + array.get(random9).getName() + "," + array.get(random9).getCountry() + "," + array.get(random9).getTeam());

        System.out.println(array.get(random10).getPosition() + "," + array.get(random10).getName() + "," + array.get(random10).getCountry() + "," + array.get(random10).getTeam());
        System.out.println(array.get(random11).getPosition() + "," + array.get(random11).getName() + "," + array.get(random11).getCountry() + "," + array.get(random11).getTeam());
	}
}
