package lession02_Variable;

public class Main {
	public static void main(String[] args) {
		
//		기본 자료형
//		정수형
		char charValue ='A';
		byte byteValue = 1;
		short shortValue = 1000; 
		int intValue = 1000;
		long longValue = 1000;
//		실수형
		float floatValue = 3;
		double doubleValue = 3.14;
//		논리형
		boolean booleanValue = true;
		
//		객체 자료형
//		문자열 - 객체 자료형이지만 자주쓰기 때문에 기본 자료형과 같이 생겼습니다.
		String stringValue = "kyle Noh";
		
		
		System.out.println("----------------------------------");
		System.out.println("Char자료형 :"+charValue);
		System.out.println("Byte자료형 :"+byteValue);
		System.out.println("Short자료형 :"+shortValue);
		System.out.println("Int자료형 :"+intValue);
		System.out.println("Long자료형 :"+longValue);
		System.out.println("Float자료형 :"+floatValue);
		System.out.println("Double자료형 :"+doubleValue);
		System.out.println("Boolean자료형 :"+booleanValue);
		System.out.println("String자료형 :"+stringValue);
		System.out.println("----------------------------------");
		
		
//		형 변환 - 데이터 손실 샘플
		intValue = 10000;
		byteValue = (byte)intValue;

		System.out.println("bVar = " + byteValue);
		
	


	}
}
