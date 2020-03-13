package lession04_Operator;

public class Main {
	public static void main(String[] args) {
	
		/**대입연산자*/
		

        
        System.out.println("대입연산자------------------------");
		int xValue = 10;
        int yValue = 20;
        System.out.println("xVlaue	:"+xValue);
        System.out.println("yVlaue	:"+yValue);
        System.out.println("xVlaue == yValue	:"+ (xValue == yValue));
        
        xValue = yValue;	// yValue의 값을 xValue에 담아줍니다.
        
        System.out.println("xVlaue	:"+xValue);
        System.out.println("yVlaue	:"+yValue);
        System.out.println("xVlaue == yValue	:"+ (xValue == yValue));
        
        /**산술연산자*/
        System.out.println("산술연산자------------------------");
//        +, - , * , / , %
		xValue = 10;
        yValue = 20;
        int plus = xValue + yValue;	// 더하기
		int minus = xValue - yValue;	// 뺴기
		int multi = xValue * yValue;	// 곱하기
		int division = xValue / yValue;	// 나누기
		int remainder = xValue % yValue;	// 나머지
		System.out.println("더하기\t"+plus);
		System.out.println("뺴기\t"+minus);
		System.out.println("곱하기\t"+multi);
		System.out.println("나누기\t"+division);
		System.out.println("나머지\t"+remainder);
		
		/**복합 대입연산자*/
		System.out.println("복합 대입연산자------------------------");
//		+=, -=, *=, /=, %=
		xValue = 10;
        yValue = 20;
        plus += xValue;	// 더하기
		minus -= xValue;	// 뺴기
		multi *= xValue;	// 곱하기
		division /= xValue;	// 나누기
		remainder %= xValue;	// 나머지
		System.out.println("더하기\t"+plus);
		System.out.println("뺴기\t"+minus);
		System.out.println("곱하기\t"+multi);
		System.out.println("나누기\t"+division);
		System.out.println("나머지\t"+remainder);

		/**증감 연산자*/
		System.out.println("복합 대입연산자------------------------");
//		++ , --
		xValue = 10;
        yValue = 20;
        plus = ++xValue;	// 더하기
		minus = xValue--;	// 뺴기
		System.out.println("더하기\t"+plus);
		System.out.println("뺴기\t"+minus);

		/**관계 연산자*/
		System.out.println("관계 대입연산자------------------------");
//		> , < . >= , <= , == , !=
		xValue = 10;
        yValue = 20;
		System.out.println("xValue>yValue\t"+(xValue>yValue));
		System.out.println("xValue<yValue\t"+(xValue<yValue));
		System.out.println("xValue>=yValue\t"+(xValue>=yValue));
		System.out.println("xValue<=yValue\t"+(xValue<=yValue));
		System.out.println("xValue==yValue\t"+(xValue==yValue));
		System.out.println("xValue!=yValue\t"+(xValue!=yValue));
		
		/**논리 연산자*/
		System.out.println("논리 대입연산자------------------------");
//		&&(AND) , ||(OR) . !(NOT)
		xValue = 10;
        yValue = 20;
		System.out.println("AND : xValue가 10보다 크고 10보다 작을떄"+((xValue>10)&&(xValue<10)));
		System.out.println("OR : xValue가 10보다 크거나 10보다 작을떄"+((xValue>10)||(xValue<10)));
		System.out.println("NOT : xValue가 10보다 작거나 10보다 클떄"+(!(xValue>10)||(xValue<10)));
		
		/**삼항연산*/
		System.out.println("삼항연산------------------------");
//		조건식 ? 만족할때값 : 만족안할때값
		xValue = 10;
        yValue = 20;
		String say = ((xValue > 100) && (xValue > 5)) ? "맞아요" : "틀려요";
		System.out.println(say);
		
		
	}
}
