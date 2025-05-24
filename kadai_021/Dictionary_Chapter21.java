package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String, String> dict;
	public Dictionary_Chapter21() {
		dict = new HashMap<String, String>();
		
//		辞書に10通りの英単語と意味を追加
		dict.put("apple", "りんご");
		dict.put("peach", "桃");
		dict.put("banana", "バナナ");
		dict.put("lemon", "レモン");
		dict.put("pear", "梨");
		dict.put("kiwi", "キウィ");
		dict.put("strawberry", "いちご");
		dict.put("grape", "ぶどう");
		dict.put("muscat", "マスカット");
		dict.put("cherry", "さくらんぼ");
	}
		
	
//		調べる英単語が辞書に追加されているかを判定
	public void searchWords(String[] words) {
		for (String word : words) {
			if(dict.containsKey(word)) {
				System.out.println(word + "の意味は" + dict.get(word));
			}else {
				System.out.println(word + "は辞書に存在しません。");
			}
		}
	}
}

