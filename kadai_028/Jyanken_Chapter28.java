package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
//	自分のじゃんけんの手を入力
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String choice;
		while (true) {
			System.out.println("自分のじゃんけんの手を入力してください（r, s, p）");
			choice = scanner.nextLine().trim();
			
			if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
				break;
			} else {
				System.out.println("エラー：正しいじゃんけんの手(r, s, p)を入力してください");
			}
		}
		return choice;
	}
	
//	対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
//		配列にじゃんけんの手をセット
		String[] hands = {"r", "s", "p"};
		
//		乱数で対戦相手のじゃんけんの手を選ぶ
		double randomValue = Math.random() * 3; //0以上3未満の乱数
		int index = (int) Math.floor(randomValue); //floor()で切り捨てて0～2に変換
		String opponentHand = hands[index];
		
//		対戦相手のじゃんけんの手を返す
		return opponentHand;
 	}
	
//	じゃんけんを行う
	public String playGame(String myKey, String opponentKey) {
//		じゃんけんの手をSTRINGプ
		HashMap<String, String> handMap = new HashMap<>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		String myHand = handMap.get(myKey);
		String opponentHand = handMap.get(opponentKey);
		
//		自分と対戦相手のじゃんけんの手を出力
		System.out.println("自分の手は：" + myHand);
		System.out.println("対戦相手の手は：" + opponentHand);
		
		String result;
		
//		自分と対戦相手のじゃんけんの手を比較して結果を出力
		if (myHand.equals(opponentHand)) {
			result = "あいこです";
		} else if (
				(myHand.equals("グー") && opponentHand.equals("チョキ")) ||
				(myHand.equals("チョキ") && opponentHand.equals("パー")) ||
				(myHand.equals("パー") && opponentHand.equals("グー"))
	) {
			result = "自分の勝ちです";
		} else {
			result = "自分の負けです";
		}
		return result;
		
	}
	
}
