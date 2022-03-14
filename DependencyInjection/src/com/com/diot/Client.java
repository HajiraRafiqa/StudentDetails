package com.com.diot;

public class Client {

	public static void main(String[] args) {
		Student stu = new Student();
		MathCheat cheat = new MathCheat();
		stu.setMathCheat(cheat);
		stu.cheating();

	}

}
