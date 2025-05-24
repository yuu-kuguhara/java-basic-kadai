package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		インスタンス作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
//		調べる英単語を配列にセット
		String[] wordsToSearch = {"apple", "banana", "grape", "orange"};
		
//		辞書を調べるメソッドを引数指定で呼び出す
		dictionary.searchWords(wordsToSearch);
	}

}
