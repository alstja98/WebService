package com.poly.part01.test03;


public class Run {

	public static void main(String[] args) {
			Cat cat = new Cat();
			cat.bark();
			cat.eat("사료");
			
			Dog dog = new Dog();
			dog.bark();
			dog.eat("간식");
			
			Animal a = new Cat();
			a.bark();
			a = new Dog();
			a.bark();
		}
	}


