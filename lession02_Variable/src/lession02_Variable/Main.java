package lession02_Variable;

public class Main {
	public static void main(String[] args) {
		
//		�⺻ �ڷ���
//		������
		char charValue ='A';
		byte byteValue = 1;
		short shortValue = 1000; 
		int intValue = 1000;
		long longValue = 1000;
//		�Ǽ���
		float floatValue = 3;
		double doubleValue = 3.14;
//		����
		boolean booleanValue = true;
		
//		��ü �ڷ���
//		���ڿ� - ��ü �ڷ��������� ���־��� ������ �⺻ �ڷ����� ���� ������ϴ�.
		String stringValue = "kyle Noh";
		
		
		System.out.println("----------------------------------");
		System.out.println("Char�ڷ��� :"+charValue);
		System.out.println("Byte�ڷ��� :"+byteValue);
		System.out.println("Short�ڷ��� :"+shortValue);
		System.out.println("Int�ڷ��� :"+intValue);
		System.out.println("Long�ڷ��� :"+longValue);
		System.out.println("Float�ڷ��� :"+floatValue);
		System.out.println("Double�ڷ��� :"+doubleValue);
		System.out.println("Boolean�ڷ��� :"+booleanValue);
		System.out.println("String�ڷ��� :"+stringValue);
		System.out.println("----------------------------------");
		
		
//		�� ��ȯ - ������ �ս� ����
		intValue = 10000;
		byteValue = (byte)intValue;

		System.out.println("bVar = " + byteValue);
		
	


	}
}
