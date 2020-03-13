package lession07_Array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
/**
 * 		�迭	:	�����͸� ������ ���� �� �ִ� �����Դϴ�.
 * 
 * 		����	:	������ ������ ���� ����( String, int .. )
 * 				���鶧 ��ĭ¥������ �˾ƾ��մϴ�.
 * 				ĭ�� �� ��ġ�� ������ �� �����ϴ�.
 * 
 * */
//		int�迭 ��ü�� ���� ��, intValue[1]�ȿ� ���� �־����ϴ�.
//		int�� 4byte�̸� 3���� �迭 �������Ƿ�, intValue�� �� 12byte�Դϴ�.
		int[] intValue = new int[3];	
		intValue[1] = 1; 
		System.out.println("intValue[0]�ǰ�\t" + intValue[0]);
		System.out.println("intValue[1]�ǰ�\t" + intValue[1]);
		System.out.println("intValue[2]�ǰ�\t" + intValue[2]);
		System.out.println("-----------------------------------");
		
//		string�迭 ��ü ������, Hello�� �־��ݴϴ�.
//		string�� 4byte�̸� 3���� �迭 �������Ƿ�, stringValue�� �� 12byte�Դϴ�.
		String stringValue[] = {"Hello","Java","World"};
		System.out.println("stringValue[0]�ǰ�\t" + stringValue[0]);
		System.out.println("stringValue[1]�ǰ�\t" + stringValue[1]);
		System.out.println("stringValue[2]�ǰ�\t" + stringValue[2]);
		System.out.println("stringValue�迭��ũ��\t" + stringValue.length);
		System.out.println("-----------------------------------");
		
//		�迭 �ȿ� ���� ������ ����մϴ�.
		String arrayValue = Arrays.toString(stringValue);
		System.out.println(arrayValue);
		
//		�迭 �ȿ� ����(���)�� ��� ����������, �ּҰ��� �޶����� �˴ϴ�.
		String[] arrayValue2 = Arrays.copyOf(stringValue, stringValue.length);
		String[] arrayValue3 = arrayValue2;
		System.out.println(stringValue);
		System.out.println(arrayValue2);
		System.out.println(arrayValue3);
		
//		������ �迭 : �迭�ȿ� �Ǵٸ� �迭�� �����ϴ� �����Դϴ�. 
		String doublueArray[][]= {{"��","��"},{"��","��","��"}};
		System.out.println(doublueArray[0][0]);
		System.out.println(doublueArray[0][1]);
		System.out.println(doublueArray[1][0]);
		System.out.println(doublueArray[1][1]);
		System.out.println(doublueArray[1][2]);
		System.out.println("-----------------------------------");
		
		int[][] intValues = { { 1, 2, 3 }, { 10, 20, 30 } };
		System.out.println(intValues[1][2]);
		System.out.println(intValues[0][1]);
		System.out.println(intValues[1][0]);

		for (int[] is : intValues) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
	}
}
