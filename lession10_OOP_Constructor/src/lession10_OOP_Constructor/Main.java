package lession10_OOP_Constructor;

public class Main {
	public static void main(String[] args) {

//		�⺻ �����ڸ� ����� ��ü ����
		Student student = new Student();
		student.name ="ȫ��";
		student.age = 20;
		student.showInfo();
		
		System.out.println("--------------------------");
		
//		Ŀ���� �����ڸ� ����� ��ü ����
		Student student2 = new Student("ȫ�浿", 10);
		student2.showInfo();
		
//		GarbageCollector ���� ���ݴ� ���� �޸𸮿��� ���Ÿ� ��û�մϴ�. (��� �����Ǵ� ���� �ƴմϴ�.)
		System.gc();
	}
}









