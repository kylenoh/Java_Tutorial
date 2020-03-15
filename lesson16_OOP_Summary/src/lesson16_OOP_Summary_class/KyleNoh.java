package lesson16_OOP_Summary_class;

// ���� ������ ��ü => singleton pattern
public class KyleNoh {
	// 2. ���ο��� ��ü �ϳ� ���� ���ȭ
	private static final KyleNoh KYLE = new KyleNoh("KyleNoh", 32, "����");

	private String name;
	private int age;
	private String addr;

	// 1. ��ü �ܺο��� ������ ���ϰ� ��ױ�
	private KyleNoh() {
		// TODO Auto-generated constructor stub
	}

	private KyleNoh(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	// 3. �� �ϳ����� ��ü �ܺο��� �ҷ��� �� �� �ֵ��� getter�۾�

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
