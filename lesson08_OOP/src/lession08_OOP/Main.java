package lession08_OOP;

public class Main {
	public static void main(String[] args) {
/**
 * 		객체지향프로그래밍(Object Oriented Programming)
 * 		객체 : 실생활에 존재하는 유형, 무형의 모든 것
 * 		클래스란? : 객체 찍어내는 틀
 * 		Main 역시 class로 만들어지지만 , public static void main(String[]args) 로 표현합니다.
 * 		프로그램이 시작될때 가장 먼저 찾게 되는 곳
 * */
//		유형의 객체
		Book book = new Book();		//클래스를 호출해 객체를 만듭니다.
		book.title = "소설같은자바";	//객체 속성에 값을 넣어줍니다.
		book.price =5000;
		book.publisher = "개발자";
		book.showInfo();
		System.out.println(book); 	//객체는 주소값이 담겨있습니다.
		
		System.out.println("-----------------------------------------");
		
//		무형의 객체
		Vehicle vehicle = new Vehicle();	//클래스를 호출해 객체를 만듭니다.
		vehicle.classification = "자동차";	//객체 속성에 값을 넣어줍니다.
		vehicle.VehicleName = "소나타";
		vehicle.price  = 1000;
		vehicle.showInfo();
		System.out.println(vehicle); 		//객체는 주소값이 담겨있습니다.
		
		
		vehicle.classification = "오토바이";	//객체에 새로운 값을 넣어줄 수 있습니다.
		vehicle.VehicleName = "스즈키";
		vehicle.price  = 5000;
		vehicle.showInfo();
		System.out.println(vehicle);		//값은 다르지만, 하나의 주소값을 가진 것을 확인 할 수있습니다.
	}
}
