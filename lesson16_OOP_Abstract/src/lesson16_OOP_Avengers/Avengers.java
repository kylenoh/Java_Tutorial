package lesson16_OOP_Avengers;

/**
 * 추상 클래스 : 미완성된 메소드가 있기 떄문에 객체를 만들 수 없습니다.
 * 
 * */

// 추상메소드를 하나라도 가지는 클래스는 추상클래스여야함
public abstract class Avengers {
//	멤버 변수
	private String name;
	private int age;

//	기본 생성자
	public Avengers() {
		// TODO Auto-generated constructor stub
	}
//	커스텀 생성자
	public Avengers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//	Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//	일반메소드
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}

//	추상메소드: 반드시 오버라이딩 해야하는 메소드
	public abstract void attack();


}
