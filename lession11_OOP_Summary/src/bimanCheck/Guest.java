package bimanCheck;
import java.util.Scanner;

public class Guest {
	// �Ӵ��� �Ʒ��� ���� �Ӽ��� ������ �ֽ��ϴ�.
	String name;	
	double height;			
	double weight;
	double stdWeight;	
	double bimando;		
	String status;
	Scanner mouth = new Scanner(System.in);
	
	// 3. �ڱ� ���� �˷��ִ� ����� ������ �ֽ��ϴ�.
	public Guest tell() {
		System.out.print("�̸��� ");		name = mouth.next();
		System.out.print("Ű�� ");		height = mouth.nextDouble();
		System.out.print("�����Դ� ");		weight = mouth.nextDouble();

		Guest myInfo = new Guest();
		myInfo.name = this.name;
		myInfo.height = height;
		myInfo.weight = weight;
		return myInfo;
	}
	
}




