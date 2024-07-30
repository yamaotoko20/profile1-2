package main;

import person.Person;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		System.out.println(person1.name);//nameフィールド（名前）をコンソールに出力
		System.out.println(person1.age);//ageフィールド（年齢）をコンソールに出力
		System.out.println(person1.height);//heightフィールド（身長）をコンソールに出力

		person1.print();//print()メソッドを呼び出し

		System.out.println("合計1人です");//メッセージ "合計1人です" をコンソールに出力
	}

}
