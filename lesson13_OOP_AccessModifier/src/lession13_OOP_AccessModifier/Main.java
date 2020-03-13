package lession13_OOP_AccessModifier;

public class Main {
	public static void main(String[] args) {
		
		Access access = new Access();
		//	public, private 접근자를 주로 사용합니다.
		System.out.println(access.getPublicName());
		System.out.println(access.getPrivateName());
		//	자주 사용되지는 않지만, 기능을 알아두어야 합니다.
		System.out.println(access.getProtectedName());
		System.out.println(access.getNullName());
	}
}
