package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public HashMap<String, String> fruitMap = new HashMap<String, String>();{
		
	
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
	
	public void searchWords(String[] words) {
		for (String word : words) {
			if(fruitMap.containsKey(word)) {
				System.out.println(word + "の意味は" +fruitMap.get(word) + "です" );
			}else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
//	public static void main(String[] args) {
//		HashMap<String,String> wordsArray = new HashMap<String,String>();
//	
//		wordsArray.put("apple","りんご");
//		wordsArray.put("peach","桃");
//		wordsArray.put("banana","バナナ");
//		wordsArray.put("lemon","レモン");
//		wordsArray.put("pear","洋梨");
//		wordsArray.put("kiwi","キウイ");
//		wordsArray.put("strawberry","いちご");
//		wordsArray.put("grape","ぶどう");
//		wordsArray.put("muscat","マスカット");
//		wordsArray.put("cherry","さくらんぼ");
//		
//		
//		
//		//繰り返し処理
//		
//		for(int i = 0; i < wordsArray.size(); i++) {
//	         if(wordsArray.get(i) == null) {
//	        	 System.out.println(i + "は辞書に存在しません");
//	         }else {
//	        	 System.out.println(i + "の意味は" + wordsArray.get(i) + "です");
//	         }
//	
//		}
//
//		
//	}

}
