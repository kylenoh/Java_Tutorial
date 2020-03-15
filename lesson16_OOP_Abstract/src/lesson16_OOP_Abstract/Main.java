package lesson16_OOP_Abstract;

import lesson16_OOP_Avengers.Avengers;
import lesson16_OOP_Avengers.CaptainAmerica;
import lesson16_OOP_Avengers.Ironman;
import lesson16_OOP_Avengers.Thor;

public class Main {
	public static void main(String[] args) {
		Avengers captain = new CaptainAmerica();
		captain.attack();
		captain.setName("ĸƾ");
		captain.setAge(10);
		captain.printInfo();
		
		System.out.println("------------------------------");
		Avengers ironman = new Ironman();
		ironman.attack();
		ironman.setName("���̾��");
		ironman.setAge(20);
		ironman.printInfo();
		
		System.out.println("------------------------------");
		
		Avengers thor = new Thor();
		thor.attack();
		thor.setName("�丣");
		thor.setAge(30);
		thor.printInfo();
	}
}
