package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Jyanken_Chapter28 game = new Jyanken_Chapter28();
		
		String myHand = game.getMyChoice();
		String opponentHand = game.getRandom();
		
		System.out.println("自分の手は：" + myHand);
		System.out.println("対戦相手の手は：" + opponentHand);
		
		String result = game.playGame(myHand, opponentHand);
		System.out.println("結果：" + result);

	}

}
