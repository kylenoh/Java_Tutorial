package lession10_OOP_Constructor;
/**
 * 생성자(Constructor)
 * 객체를 만들때 사용하는 가장 먼저 호출되는 부분입니다.
 * 생성자는 클래스 명과 동일하게 생성합니다.
 * 기본생성자는 Ctrl + Space로 자동 완성할 수 있습니다.
 * */
public class Student {
	// 멤버변수 : 해당 클래스 전역에서 사용할 수 있는 변수
	String name;
	int age;
	
	/*	
	 * 	기본 생성자 : 객체를 생성해 호출시 이부분이 가장먼저 호출됩니다.
	 *	생성자를 전혀 작업을 안하면 자동으로 기본생성자 만들어줌
	 * */
	public Student() { 
		System.out.println("기본생성자가 호출됩니다.");
	}
	
	/*
	 * 	객체를 만들면서 속성값 세팅 => 오버로딩된 생성자
	 * 	this.의 의미는 멤버변수를 의미합니다. ( 지역변수와 멤버변수가 동일하다는 의미입니다. )
	 * */ 
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("커스텀생성자가 호출됩니다.");
	}
		
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("소멸자가 실행되었습니다..");
		super.finalize();
	}


}
