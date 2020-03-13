package lession07_Array;

import java.util.Scanner;

public class Main_ProductManagement {
	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);

		int menu = 0;
		int no = -1;
		String[] name = new String[10];
		int[] price = new int[10];
		double[] weight = new double[10];
		int sum = 0;
		int tNo = 0;
		while (true) {
			System.out.println("---------------------------");
			System.out.println("상품관리");
			System.out.println("---------------------------");
			System.out.println("1.상품등록");
			System.out.println("2.상품목록조회");
			System.out.println("3.특정상품조회");
			System.out.println("4.등록상품수정");
			System.out.println("---------------------------");
			System.out.print("번호를 입력해주세요 : ");
			menu = keyBoard.nextInt();
			if (menu == 1) {
				no++;
				System.out.print("상품명 : ");
				name[no] = keyBoard.next();
				System.out.print("가격 : ");
				price[no] = keyBoard.nextInt();
				System.out.print("무게 : ");
				weight[no] = keyBoard.nextDouble();
			} else if (menu == 2) {
				sum = 0;
				for (int i = 0; i <= no; i++) {
					sum += price[i];
					System.out.printf("%d) \t %s \t %d원 \t %.1fg \t %.1f원 \n", (i + 1), name[i], price[i], weight[i],
							(price[i] / weight[i]));
				}
				System.out.printf("평균 : %d원\n", sum / (no + 1));

			} else if (menu == 3) {
				System.out.print("번호 : ");
				tNo = keyBoard.nextInt() - 1;
				System.out.printf("%d) \t %s \t %d원 \t %.1fg \t %.1f원 \n", (tNo + 1), name[tNo], price[tNo],
						weight[tNo], (price[tNo] / weight[tNo]));
			} else if (menu == 4) {
				System.out.print("번호 : ");
				tNo = keyBoard.nextInt() - 1;
				System.out.print("이름 : ");
				name[tNo] = keyBoard.next();
				System.out.print("가격 : ");
				price[tNo] = keyBoard.nextInt();
				System.out.print("무게 : ");
				weight[tNo] = keyBoard.nextDouble();
			} else {
				break;
			}
		}
		keyBoard.close();
	}
}
