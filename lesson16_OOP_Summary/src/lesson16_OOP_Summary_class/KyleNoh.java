package lesson16_OOP_Summary_class;

// 세상에 유일한 객체 => singleton pattern
public class KyleNoh {
	// 2. 내부에서 객체 하나 만들어서 상수화
	private static final KyleNoh KYLE = new KyleNoh("KyleNoh", 32, "서울");

	private String name;
	private int age;
	private String addr;

	// 1. 객체 외부에서 만들지 못하게 잠그기
	private KyleNoh() {
		// TODO Auto-generated constructor stub
	}

	private KyleNoh(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	// 3. 그 하나뿐인 객체 외부에서 불러다 쓸 수 있도록 getter작업

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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public static KyleNoh getKyle() {
		return KYLE;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);

	}
}
