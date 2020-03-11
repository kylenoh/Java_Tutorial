package lession07_Array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
/**
 * 		배열	:	데이터를 여러개 담을 수 있는 공간입니다.
 * 
 * 		단점	:	데이터 종류를 섞지 못함( String, int .. )
 * 				만들때 몇칸짜리인지 알아야합니다.
 * 				칸수 및 위치를 수정할 수 없습니다.
 * 
 * */
//		int배열 객체를 생성 후, intValue[1]안에 값을 넣었습니다.
//		int는 4byte이며 3개를 배열 시켰으므로, intValue는 총 12byte입니다.
		int[] intValue = new int[3];	
		intValue[1] = 1; 
		System.out.println("intValue[0]의값\t" + intValue[0]);
		System.out.println("intValue[1]의값\t" + intValue[1]);
		System.out.println("intValue[2]의값\t" + intValue[2]);
		System.out.println("-----------------------------------");
		
//		string배열 객체 생성시, Hello를 넣어줍니다.
//		string은 4byte이며 3개를 배열 시켰으므로, stringValue는 총 12byte입니다.
		String stringValue[] = {"Hello","Java","World"};
		System.out.println("stringValue[0]의값\t" + stringValue[0]);
		System.out.println("stringValue[1]의값\t" + stringValue[1]);
		System.out.println("stringValue[2]의값\t" + stringValue[2]);
		System.out.println("stringValue배열의크기\t" + stringValue.length);
		System.out.println("-----------------------------------");
		
//		배열 안에 들은 값들을 출력합니다.
		String arrayValue = Arrays.toString(stringValue);
		System.out.println(arrayValue);
		
//		배열 안에 값들(요소)는 모두 동일하지만, 주소값은 달라지게 됩니다.
		String[] arrayValue2 = Arrays.copyOf(stringValue, stringValue.length);
		String[] arrayValue3 = arrayValue2;
		System.out.println(stringValue);
		System.out.println(arrayValue2);
		System.out.println(arrayValue3);
		
//		다차원 배열 : 배열안에 또다른 배열이 존재하는 형태입니다. 
		String doublueArray[][]= {{"안","녕"},{"하","세","요"}};
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
