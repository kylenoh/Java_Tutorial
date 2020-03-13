package lession10_OOP_Constructor;

public class Main {
	public static void main(String[] args) {

//		기본 생성자를 사용한 객체 생성
		Student student = new Student();
		student.name ="홍길";
		student.age = 20;
		student.showInfo();
		
		System.out.println("--------------------------");
		
//		커스텀 생성자를 사용한 객체 생성
		Student student2 = new Student("홍길동", 10);
		student2.showInfo();
		
//		GarbageCollector 에게 조금더 빨리 메모리에서 제거를 요청합니다. (즉시 삭제되는 것이 아닙니다.)
		System.gc();
	}
}









