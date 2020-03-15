package lesson17_ExceptionHandling_class;
// 
// try-catch-finally : 처리방법까지 들어가서 => 코드재사용에 문제가 될 소지
// throws : 개발자 입장에서 메소드 작업할때는 더 많이 사용
public class Calculator {
	public void calculate2(int x, int y) throws Exception{
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
	}

}





