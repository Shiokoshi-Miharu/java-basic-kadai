package kadai_018;

public abstract class Kato_Chapter18 {
	//姓・名、住所を表すフィールド
	public String familyName = "加藤";
	public String givenName;
	public String address = "住所は東京都中野区〇×";

	
	//共通の紹介を出力
	public void commonIntroduce(){
		System.out.println("名前は" +familyName + givenName + "です");
		System.out.println( "住所は" + address + "です");
	}
	//個別の紹介を出力する
	public abstract void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println(); // 空白行を追加
	}
	
}
