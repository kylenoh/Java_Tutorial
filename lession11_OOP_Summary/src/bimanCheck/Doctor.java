package bimanCheck;

public class Doctor {
	Guest guest; // 받은 손님
		
	// 1. 손님을 맞이하는 기능을 가지고 있습니다.
	public void start() {
		guest = new Guest();
		ask();
	}

	// 2. 그 손님의 정보를 물어보는 기능을 가지고 있습니다.
	public void ask() {
		guest = guest.tell();
		calculate();
	}
	// 4. 받은 정보를 토대로 계산하는 기능을 가지고 있습니다.
	public void calculate() {
		guest.stdWeight = (guest.height - 100) * 0.9;
		guest.bimando = (guest.weight / guest.stdWeight) * 100;
		guest.status = "저체중";
		if (guest.bimando > 120) {
			guest.status = "비만";
		} else if (guest.bimando >= 80) {
			guest.status = "정상";
		}
		tellResult();
	}

	// 5. 계산된 결과 발표하는 기능을 가지고 있습니다.
	public void tellResult() {
		System.out.printf("표준체중 : %.1fkg\n", guest.stdWeight);
		System.out.printf("비만도 : %.1f%%\n", guest.bimando);
		System.out.printf("%s씨는 %s", guest.name, guest.status);
	}

}






