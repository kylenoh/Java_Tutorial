package lession04_Operator;

public class Main {
	public static void main(String[] args) {
	
		/**���Կ�����*/
		

        
        System.out.println("���Կ�����------------------------");
		int xValue = 10;
        int yValue = 20;
        System.out.println("xVlaue	:"+xValue);
        System.out.println("yVlaue	:"+yValue);
        System.out.println("xVlaue == yValue	:"+ (xValue == yValue));
        
        xValue = yValue;	// yValue�� ���� xValue�� ����ݴϴ�.
        
        System.out.println("xVlaue	:"+xValue);
        System.out.println("yVlaue	:"+yValue);
        System.out.println("xVlaue == yValue	:"+ (xValue == yValue));
        
        /**���������*/
        System.out.println("���������------------------------");
//        +, - , * , / , %
		xValue = 10;
        yValue = 20;
        int plus = xValue + yValue;	// ���ϱ�
		int minus = xValue - yValue;	// ����
		int multi = xValue * yValue;	// ���ϱ�
		int division = xValue / yValue;	// ������
		int remainder = xValue % yValue;	// ������
		System.out.println("���ϱ�\t"+plus);
		System.out.println("����\t"+minus);
		System.out.println("���ϱ�\t"+multi);
		System.out.println("������\t"+division);
		System.out.println("������\t"+remainder);
		
		/**���� ���Կ�����*/
		System.out.println("���� ���Կ�����------------------------");
//		+=, -=, *=, /=, %=
		xValue = 10;
        yValue = 20;
        plus += xValue;	// ���ϱ�
		minus -= xValue;	// ����
		multi *= xValue;	// ���ϱ�
		division /= xValue;	// ������
		remainder %= xValue;	// ������
		System.out.println("���ϱ�\t"+plus);
		System.out.println("����\t"+minus);
		System.out.println("���ϱ�\t"+multi);
		System.out.println("������\t"+division);
		System.out.println("������\t"+remainder);

		/**���� ������*/
		System.out.println("���� ���Կ�����------------------------");
//		++ , --
		xValue = 10;
        yValue = 20;
        plus = ++xValue;	// ���ϱ�
		minus = xValue--;	// ����
		System.out.println("���ϱ�\t"+plus);
		System.out.println("����\t"+minus);

		/**���� ������*/
		System.out.println("���� ���Կ�����------------------------");
//		> , < . >= , <= , == , !=
		xValue = 10;
        yValue = 20;
		System.out.println("xValue>yValue\t"+(xValue>yValue));
		System.out.println("xValue<yValue\t"+(xValue<yValue));
		System.out.println("xValue>=yValue\t"+(xValue>=yValue));
		System.out.println("xValue<=yValue\t"+(xValue<=yValue));
		System.out.println("xValue==yValue\t"+(xValue==yValue));
		System.out.println("xValue!=yValue\t"+(xValue!=yValue));
		
		/**�� ������*/
		System.out.println("�� ���Կ�����------------------------");
//		&&(AND) , ||(OR) . !(NOT)
		xValue = 10;
        yValue = 20;
		System.out.println("AND : xValue�� 10���� ũ�� 10���� ������"+((xValue>10)&&(xValue<10)));
		System.out.println("OR : xValue�� 10���� ũ�ų� 10���� ������"+((xValue>10)||(xValue<10)));
		System.out.println("NOT : xValue�� 10���� �۰ų� 10���� Ŭ��"+(!(xValue>10)||(xValue<10)));
		
		/**���׿���*/
		System.out.println("���׿���------------------------");
//		���ǽ� ? �����Ҷ��� : �������Ҷ���
		xValue = 10;
        yValue = 20;
		String say = ((xValue > 100) && (xValue > 5)) ? "�¾ƿ�" : "Ʋ����";
		System.out.println(say);
		
		
	}
}
