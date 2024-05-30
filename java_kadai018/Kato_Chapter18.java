package java_kadai018;

public abstract class Kato_Chapter18 {
	
	public String familyName = "加藤";
	public String givenName;
	public String address;

	
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	public abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}