package lession13_OOP_AccessModifier;

public class Main {
	public static void main(String[] args) {
		
		Access access = new Access();
		//	public, private �����ڸ� �ַ� ����մϴ�.
		System.out.println(access.getPublicName());
		System.out.println(access.getPrivateName());
		//	���� �������� ������, ����� �˾Ƶξ�� �մϴ�.
		System.out.println(access.getProtectedName());
		System.out.println(access.getNullName());
	}
}
