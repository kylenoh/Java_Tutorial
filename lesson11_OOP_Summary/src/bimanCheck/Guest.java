package bimanCheck;
import java.util.Scanner;

public class Guest {
	// 속님은 아래오 같이 속성을 가지고 있습니다.
	String name;	
	double height;			
	double weight;
	double stdWeight;	
	double bimando;		
	String status;
	Scanner mouth = new Scanner(System.in);
	
	// 3. 자기 정보 알려주는 기능을 가지고 있습니다.
	public Guest tell() {
		System.out.print("이름은 ");		name = mouth.next();
		System.out.print("키는 ");		height = mouth.nextDouble();
		System.out.print("몸무게는 ");		weight = mouth.nextDouble();

		Guest myInfo = new Guest();
		myInfo.name = this.name;
		myInfo.height = height;
		myInfo.weight = weight;
		return myInfo;
	}
	
}




