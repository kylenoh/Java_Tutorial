package lession05_ConditionalStatmt;

import java.util.Scanner;

public class Main_Switch {
	public static void main(String[] args) {
//		switch-case
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("계급을 입력하세요 : ");
		String grade = keyBoard.next();
//////////////////////////////////////////////////////////////////////////////
//		병장일 경우, 이등병의 속성을 모두 가져갑니다. Break 전까지
		switch (grade) { // 체크할 값
		case "병장":
			System.out.println("특화\t:다크 템플러");
		case "상병":
			System.out.println("특화\t:삽질전문가");
		case "일병":
			System.out.println("특화\t:전두화닦기");
		case "이병": // 값(조건식 x)
			System.out.println("특화\t:눈치보기");
			break;
		default: // else	- 옵션 위 case가 모두 아닐경우, 기본값이 출력됩니다.
			System.out.println("간부");
			System.out.println("특화\t:병장 찾기");
			break;
		}
		
//////////////////////////////////////////////////////////////////////////////
//		DBA일 경우, 해당 속성만 가집니다. case 안에 Break가 존재합니다.
		System.out.println("-----------------------------------");
		System.out.print("어떤 DB 권한을 가지고 계신가요 : ");
		// 권한관리
		String role = keyBoard.next();
		switch (role) {
		case "DBA":
			System.out.println("역활\t:전원관리");
			System.out.println("역활\t:백업/복구");
			System.out.println("역활\t:사용자관리");
			break;
		case "DBP":
			System.out.println("역활\t:CRUD");
			break;
		default:
			System.out.println("사용자");
			System.out.println("역활\t:사용");
			break;
		}
		
//////////////////////////////////////////////////////////////////////////////

		keyBoard.close();
	}
}
