package lession08_OOP;

//	무형의 존재
public class Vehicle {
//	속성
	String classification;
	String VehicleName;
	int price;
	
//	기능
	public void showInfo() {
		System.out.println(classification);
		System.out.println(VehicleName);
		System.out.println(price);
	}
}
