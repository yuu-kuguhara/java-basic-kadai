package kadai_018;

 public abstract class Kato_Chapter18 {
	String familyName = "加藤";
	String givenName;
	String address = "東京都中野区○×";
	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	public abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
