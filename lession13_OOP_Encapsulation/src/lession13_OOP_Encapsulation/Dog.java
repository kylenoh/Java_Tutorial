package lession13_OOP_Encapsulation;

// 캡슐화(encapsulation)
//		데이터의 안전한 처리를 위해
public class Dog {
	private String name;
	private int age; // 외부의 직접 접근을 막고

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	////////////////////////
	// 변수에 접근할 수 있는 안전한 통로
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
		if (age < 0) {
			age *= -1;
		}
		this.age = age;
	}

	/////////////////////////
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}

}
