package com.poly.part01.test04;

public class MTest {

	public static void main(String[] args) {
		Animal a = new Cat();
		a.bark();
		a.eat("생선");
		
		a = new Dog();
		a.bark();
		a.eat("뼈다귀");
		((Dog)a).bite(); //다운캐스팅
		
		a = new Eagle();
		a.bark();
		a.eat("비둘기");
		((Eagle)a).fly();
		
	}

}
