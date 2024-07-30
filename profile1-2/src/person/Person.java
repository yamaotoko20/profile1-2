package person;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// BMIを計算するメソッド
	public double bmi() {
		if (height == 0.0) {
			System.out.println("エラー：身長が0です。BMIを計算できません。");
			return 0.0;
		}

		double bmiValue = weight / (height * height);
		double truncatedBmi = Math.floor(bmiValue * 10) / 10.0; // BMIを小数点第一位で切り捨てる
		return Math.floor(truncatedBmi); // BMIを小数点第一位で切り捨てる
	}

	// プロフィールを出力するメソッド
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + bmi() + "です");

	}

}