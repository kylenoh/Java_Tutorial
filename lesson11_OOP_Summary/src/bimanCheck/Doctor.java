package bimanCheck;

public class Doctor {
	Guest guest; // ���� �մ�
		
	// 1. �մ��� �����ϴ� ����� ������ �ֽ��ϴ�.
	public void start() {
		guest = new Guest();
		ask();
	}

	// 2. �� �մ��� ������ ����� ����� ������ �ֽ��ϴ�.
	public void ask() {
		guest = guest.tell();
		calculate();
	}
	// 4. ���� ������ ���� ����ϴ� ����� ������ �ֽ��ϴ�.
	public void calculate() {
		guest.stdWeight = (guest.height - 100) * 0.9;
		guest.bimando = (guest.weight / guest.stdWeight) * 100;
		guest.status = "��ü��";
		if (guest.bimando > 120) {
			guest.status = "��";
		} else if (guest.bimando >= 80) {
			guest.status = "����";
		}
		tellResult();
	}

	// 5. ���� ��� ��ǥ�ϴ� ����� ������ �ֽ��ϴ�.
	public void tellResult() {
		System.out.printf("ǥ��ü�� : %.1fkg\n", guest.stdWeight);
		System.out.printf("�񸸵� : %.1f%%\n", guest.bimando);
		System.out.printf("%s���� %s", guest.name, guest.status);
	}

}






