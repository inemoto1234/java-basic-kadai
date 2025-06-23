package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
        // 辞書の作成
        HashMap<String, String> fruitMap = new HashMap<>();
        
        public Dictionary_Chapter21() {
        	fruitMap.put("apple", "りんご");
        	fruitMap.put("peach", "桃");
        	fruitMap.put("banana", "バナナ");
        	fruitMap.put("lemon", "レモン");
        	fruitMap.put("pear", "梨");
        	fruitMap.put("kiwi", "キウィ");
        	fruitMap.put("strawberry", "いちご");
        	fruitMap.put("grape", "ぶどう");
        	fruitMap.put("muscat", "マスカット");
        	fruitMap.put("cherry", "さくらんぼ");
        }

        // 調べる単語の配列
        String[] words = {"apple", "banana", "grape", "orange"};

        // 辞書を調べる
        public void lookupWords(String[] words) {
        	for (String word : words) {
        		String value = fruitMap.get(word);
        		if (value != null) {
        			System.out.println(word + " → " + value);
        		} else {
        			System.out.println(word + " → （辞書にありません）");
        
        	}	
        }
}
}
